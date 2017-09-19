
package com.juliens.lolapimvctest.model.champion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.LinkedHashMap;

public class ChampionsList implements Serializable {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("data")
    @Expose
    private LinkedHashMap<String, ChampionData> data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LinkedHashMap<String,ChampionData> getData() {
        return data;
    }

    public void setData(LinkedHashMap<String,ChampionData> data) {
        this.data = data;
    }
}
