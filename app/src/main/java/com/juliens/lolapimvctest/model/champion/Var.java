
package com.juliens.lolapimvctest.model.champion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Var {

    @SerializedName("coeff")
    @Expose
    private List<Double> coeff = null;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("key")
    @Expose
    private String key;

    public List<Double> getCoeff() {
        return coeff;
    }

    public void setCoeff(List<Double> coeff) {
        this.coeff = coeff;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
