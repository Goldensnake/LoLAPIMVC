package com.juliens.lolapimvctest.controler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.juliens.lolapimvctest.MainActivity;
import com.juliens.lolapimvctest.R;
import com.juliens.lolapimvctest.model.champion.ChampionsList;
import com.juliens.lolapimvctest.view.champion.ChampionAdapter;

/**
 * Created by juliens on 14/09/2017.
 */

public class ChampionListFragment extends Fragment {
    private ChampionsList championsList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        championsList = (ChampionsList) this.getArguments().getSerializable(MainActivity.CHAMPIONS_LIST);
        return inflater.inflate(R.layout.fragment_champions_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ChampionAdapter championAdapter = new ChampionAdapter(championsList.getData());
        recyclerView.setAdapter(championAdapter);
        championAdapter.getChampNameSelected().subscribe(s -> Toast.makeText(getContext(), "click on " + s, Toast.LENGTH_SHORT).show());
    }
}
