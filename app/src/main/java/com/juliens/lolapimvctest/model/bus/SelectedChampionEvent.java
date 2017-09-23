package com.juliens.lolapimvctest.model.bus;

import com.juliens.lolapimvctest.model.champion.ChampionData;

/**
 * Created by juliens on 21/09/2017.
 */

public class SelectedChampionEvent {
    private ChampionData championData;

    public SelectedChampionEvent(ChampionData championData) {
        this.championData = championData;
    }

    public ChampionData getChampionData() {
        return championData;
    }
}
