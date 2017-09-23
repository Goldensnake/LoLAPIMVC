package com.juliens.lolapimvctest.controler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juliens.lolapimvctest.MainActivity;
import com.juliens.lolapimvctest.R;
import com.juliens.lolapimvctest.model.bus.SearchChampionEvent;
import com.juliens.lolapimvctest.model.champion.ChampionData;
import com.juliens.lolapimvctest.model.champion.ChampionsList;
import com.juliens.lolapimvctest.view.champion.ChampionAdapter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.LinkedHashMap;

/**
 * Created by juliens on 14/09/2017.
 */

public class ChampionListFragment extends Fragment {
    private ChampionsList championsList;
    private ChampionAdapter championAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        championsList = this.getArguments().getParcelable(MainActivity.CHAMPIONS_LIST);
        return inflater.inflate(R.layout.fragment_champions_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //not to have the same memory pointer in adapter
        LinkedHashMap<String,ChampionData> champData = new LinkedHashMap<>();
        champData.putAll(championsList.getData());
        championAdapter = new ChampionAdapter(champData);
        recyclerView.setAdapter(championAdapter);
    }

    @Subscribe
    public void onEvent(SearchChampionEvent searchChampion) {
        if (searchChampion.getSearch().equals(""))
            championAdapter.changeData(championsList.getData());
        else {
            LinkedHashMap<String,ChampionData> temp = new LinkedHashMap<>();
            championsList.getData().forEach((k, v) -> {
                if (k.toLowerCase().contains(searchChampion.getSearch())) {
                    temp.put(k,v);
                }
            });
            championAdapter.changeData(temp);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
