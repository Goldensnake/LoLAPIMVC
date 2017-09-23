package com.juliens.lolapimvctest.dao;

import com.juliens.lolapimvctest.model.champion.ChampionsList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by juliens on 23/09/2017.
 */

public interface StaticDataDDragon {
    @GET("{version}/data/{locale}/champion.json")
    Observable<ChampionsList> getAllChampionsData(@Path("version") String locale,
                                                  @Path("locale") String version);

    @GET("{version}/data/{locale}/champion/{name}.json")
    Observable<ChampionsList> getChampionData(@Path("version") String locale,
                                              @Path("locale") String version,
                                              @Path("name") String name);
}
