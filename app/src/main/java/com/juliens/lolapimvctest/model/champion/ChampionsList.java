
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.LinkedHashMap;

public class ChampionsList implements Parcelable {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("data")
    @Expose
    private LinkedHashMap<String, ChampionData> data;

    public final static Parcelable.Creator<ChampionsList> CREATOR = new Creator<ChampionsList>() {

        @SuppressWarnings({
                "unchecked"
        })
        public ChampionsList createFromParcel(Parcel in) {
            ChampionsList instance = new ChampionsList();
            instance.type = (String) in.readValue((String.class.getClassLoader()));
            instance.version = (String) in.readValue((String.class.getClassLoader()));
            instance.data = (LinkedHashMap<String, ChampionData>) in.readHashMap(LinkedHashMap.class.getClassLoader());
            return instance;
        }

        public ChampionsList[] newArray(int size) {
            return (new ChampionsList[size]);
        }

    };

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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(version);
        dest.writeMap(data);
    }

    public int describeContents() {
        return 0;
    }
}
