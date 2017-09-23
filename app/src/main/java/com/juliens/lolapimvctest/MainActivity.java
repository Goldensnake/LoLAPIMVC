package com.juliens.lolapimvctest;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

import com.juliens.lolapimvctest.controler.ChampionFragment;
import com.juliens.lolapimvctest.controler.ChampionListFragment;
import com.juliens.lolapimvctest.model.bus.SearchChampionEvent;
import com.juliens.lolapimvctest.model.bus.SelectedChampionEvent;
import com.juliens.lolapimvctest.model.champion.ChampionsList;
import com.juliens.lolapimvctest.service.ChampionQuery;
import com.juliens.lolapimvctest.util.AndroidUtil;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private final Fragment championListFragment = new ChampionListFragment();
    private final Fragment championFragment = new ChampionFragment();
    public static String CHAMPIONS_LIST = "championsList";
    public static String CHAMPION_DATA = "championData";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChampionQuery.getInstance().getAllChampion(AndroidUtil.getLocale(this))
                .subscribe(this::receiveChampionsList, this::receiveError);

        // Get the intent, verify the action and get the query
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            //doMySearch(query);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(true);
        searchView.setOnQueryTextListener(this);
        return true;
    }

    //bus event
    @Subscribe
    public void onEvent (SelectedChampionEvent selectedChampion){
        ChampionQuery.getInstance().getChampion(AndroidUtil.getLocale(this),selectedChampion.getChampionData().getId())
                .subscribe(this::receiveChampionData,this::receiveError);
    }

    //Call reception//
    private void receiveChampionsList(ChampionsList championsList){
        Bundle bundle = new Bundle();
        bundle.putParcelable(CHAMPIONS_LIST, championsList );
        championListFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentLayout,championListFragment)
                .commit();
    }

    private void receiveChampionData(ChampionsList championsList){
        Toast.makeText(this,championsList.getData().entrySet().iterator().next().getValue().getName(),Toast.LENGTH_SHORT).show();
        /*Bundle bundle = new Bundle();
        bundle.putParcelable(CHAMPION_DATA, championsList.getData().entrySet().iterator().next().getValue());
        championListFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentLayout,championFragment)
                .commit();*/
    }

    private void receiveError(Throwable error){
        Log.e("error network", error.toString());
        Toast.makeText(this,"network error: "+error.getMessage(), Toast.LENGTH_LONG).show();
    }


    //search view
    @Override
    public boolean onQueryTextSubmit(String query) {
        invalidateOptionsMenu();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        EventBus.getDefault().post(new SearchChampionEvent(newText));
        return true;
    }

    //lifecycle
    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
