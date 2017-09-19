
package com.juliens.lolapimvctest.model.champion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Leveltip {

    @SerializedName("effect")
    @Expose
    private List<String> effect = null;
    @SerializedName("label")
    @Expose
    private List<String> label = null;

    public List<String> getEffect() {
        return effect;
    }

    public void setEffect(List<String> effect) {
        this.effect = effect;
    }

    public List<String> getLabel() {
        return label;
    }

    public void setLabel(List<String> label) {
        this.label = label;
    }
}
