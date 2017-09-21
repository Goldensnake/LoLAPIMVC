
package com.juliens.lolapimvctest.model.champion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Recommended implements Serializable{

    @SerializedName("map")
    @Expose
    private String map;
    @SerializedName("blocks")
    @Expose
    private List<Block> blocks = null;
    @SerializedName("champion")
    @Expose
    private String champion;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("type")
    @Expose
    private String type;

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
