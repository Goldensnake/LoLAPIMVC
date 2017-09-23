package com.juliens.lolapimvctest.service;

import com.juliens.lolapimvctest.dao.StaticDataAPI;
import com.juliens.lolapimvctest.dao.StaticDataDDragon;
import com.juliens.lolapimvctest.model.Tags;
import com.juliens.lolapimvctest.model.champion.ChampionsList;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by juliens on 14/09/2017.
 */

public class ChampionQuery {

    private static StaticDataAPI staticApi;
    private static StaticDataDDragon staticDragon;
    private ChampionQuery(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        staticDragon = new Retrofit.Builder()
                .baseUrl("http://ddragon.leagueoflegends.com/cdn/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build()
                .create(StaticDataDDragon.class);

        staticApi = new Retrofit.Builder()
                .baseUrl("https://euw1.api.riotgames.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build()
                .create(StaticDataAPI.class);
    }

    private static class ChampionQueryHolder{
        private final static ChampionQuery instance = new ChampionQuery();
    }

    public static ChampionQuery getInstance(){
        return ChampionQueryHolder.instance;
    }

    public Observable<ChampionsList> getAllChampionWithFilter(String locale, Tags... tags){
        return staticApi.getAllChampionsData("",locale,null,true,tags)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

    public Observable<ChampionsList> getAllChampion(String locale){
        return staticDragon.getAllChampionsData("7.18.1",locale)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

    public Observable<ChampionsList> getChampion(String locale, String champion){
        return staticDragon.getChampionData("7.18.1",locale,champion)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }








}
