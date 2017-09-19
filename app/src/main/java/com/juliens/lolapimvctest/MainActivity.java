package com.juliens.lolapimvctest;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

import com.juliens.lolapimvctest.controler.ChampionFragment;
import com.juliens.lolapimvctest.controler.ChampionListFragment;
import com.juliens.lolapimvctest.model.champion.ChampionsList;
import com.juliens.lolapimvctest.service.ChampionQuery;
import com.juliens.lolapimvctest.util.AndroidUtil;

public class MainActivity extends AppCompatActivity{
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);
        return true;
    }

    //TODO wait click in recycler view
    public void showChampionData(String championName){
        ChampionQuery.getInstance().getChampion(AndroidUtil.getLocale(this),championName)
                .subscribe(this::receiveChampionData,this::receiveError);
    }

    //Call reception//
    private void receiveChampionsList(ChampionsList championsList){
        Bundle bundle = new Bundle();
        bundle.putSerializable(CHAMPIONS_LIST, championsList );
        championListFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentLayout,championListFragment)
                .commit();

    }

    private void receiveChampionData(ChampionsList championsList){
        Bundle bundle = new Bundle();
        bundle.putSerializable(CHAMPION_DATA, championsList.getData().entrySet().iterator().next().getValue());
        championListFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentLayout,championFragment)
                .commit();
    }

    private void receiveError(Throwable error){
        Toast.makeText(this,"network error: "+error.getMessage(), Toast.LENGTH_LONG).show();
    }



}
