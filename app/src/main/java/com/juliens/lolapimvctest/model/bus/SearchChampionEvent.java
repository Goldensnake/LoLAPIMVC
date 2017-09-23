package com.juliens.lolapimvctest.model.bus;

/**
 * Created by juliens on 19/09/2017.
 */

public class SearchChampionEvent {
    private String search;

    public SearchChampionEvent(String search) {
        this.search = search;
    }

    public String getSearch() {
        return search.toLowerCase();
    }
}
