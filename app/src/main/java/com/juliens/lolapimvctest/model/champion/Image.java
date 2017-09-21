
package com.juliens.lolapimvctest.model.champion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Image implements Serializable{

    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("sprite")
    @Expose
    private String sprite;
    @SerializedName("h")
    @Expose
    private Integer h;
    @SerializedName("w")
    @Expose
    private Integer w;
    @SerializedName("y")
    @Expose
    private Integer y;
    @SerializedName("x")
    @Expose
    private Integer x;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}
