
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Block implements Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("recMath")
    @Expose
    private Boolean recMath;
    @SerializedName("recSteps")
    @Expose
    private Boolean recSteps;
    @SerializedName("minSummonerLevel")
    @Expose
    private Integer minSummonerLevel;
    @SerializedName("maxSummonerLevel")
    @Expose
    private Integer maxSummonerLevel;
    @SerializedName("showIfSummonerSpell")
    @Expose
    private String showIfSummonerSpell;
    @SerializedName("hideIfSummonerSpell")
    @Expose
    private String hideIfSummonerSpell;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    public final static Parcelable.Creator<Block> CREATOR = new Creator<Block>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Block createFromParcel(Parcel in) {
            Block instance = new Block();
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.recMath = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.recSteps = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.minSummonerLevel = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.maxSummonerLevel = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.showIfSummonerSpell = ((String) in.readValue((String.class.getClassLoader())));
            instance.hideIfSummonerSpell = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.items, (com.juliens.lolapimvctest.model.champion.Item.class.getClassLoader()));
            return instance;
        }

        public Block[] newArray(int size) {
            return (new Block[size]);
        }

    }
            ;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRecMath() {
        return recMath;
    }

    public void setRecMath(Boolean recMath) {
        this.recMath = recMath;
    }

    public Boolean getRecSteps() {
        return recSteps;
    }

    public void setRecSteps(Boolean recSteps) {
        this.recSteps = recSteps;
    }

    public Integer getMinSummonerLevel() {
        return minSummonerLevel;
    }

    public void setMinSummonerLevel(Integer minSummonerLevel) {
        this.minSummonerLevel = minSummonerLevel;
    }

    public Integer getMaxSummonerLevel() {
        return maxSummonerLevel;
    }

    public void setMaxSummonerLevel(Integer maxSummonerLevel) {
        this.maxSummonerLevel = maxSummonerLevel;
    }

    public String getShowIfSummonerSpell() {
        return showIfSummonerSpell;
    }

    public void setShowIfSummonerSpell(String showIfSummonerSpell) {
        this.showIfSummonerSpell = showIfSummonerSpell;
    }

    public String getHideIfSummonerSpell() {
        return hideIfSummonerSpell;
    }

    public void setHideIfSummonerSpell(String hideIfSummonerSpell) {
        this.hideIfSummonerSpell = hideIfSummonerSpell;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(recMath);
        dest.writeValue(recSteps);
        dest.writeValue(minSummonerLevel);
        dest.writeValue(maxSummonerLevel);
        dest.writeValue(showIfSummonerSpell);
        dest.writeValue(hideIfSummonerSpell);
        dest.writeList(items);
    }

    public int describeContents() {
        return 0;
    }

}