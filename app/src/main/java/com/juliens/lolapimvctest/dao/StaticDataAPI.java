package com.juliens.lolapimvctest.dao;

import com.juliens.lolapimvctest.model.Tags;
import com.juliens.lolapimvctest.model.champion.ChampionsList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by juliens on 14/09/2017.
 */

public interface StaticDataAPI {
    @GET("lol/static-data/v3/champions")
    Observable<ChampionsList> getAllChampionsData(@Query("api_key") String apiKey,
                                                  @Query("locale") String locale,
                                                  @Query("version") String version,
                                                  @Query("dataById") boolean dataById,
                                                  @Query("tags") Tags... tags);

    @GET("{version}/data/{locale}/champion.json")
    Observable<ChampionsList> getAllChampionsData(@Path("version") String locale,
                                                  @Path("locale") String version);

    @GET("{version}/data/{locale}/champion/{name}.json")
    Observable<ChampionsList> getChampionData(@Path("version") String locale,
                                              @Path("locale") String version,
                                              @Path("name") String name);
}
