
package com.juliens.lolapimvctest.model.champion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Spell implements Serializable{

    @SerializedName("cooldownBurn")
    @Expose
    private String cooldownBurn;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("resource")
    @Expose
    private String resource;
    @SerializedName("leveltip")
    @Expose
    private Leveltip leveltip;
    @SerializedName("vars")
    @Expose
    private List<Var> vars = null;
    @SerializedName("costType")
    @Expose
    private String costType;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("sanitizedDescription")
    @Expose
    private String sanitizedDescription;
    @SerializedName("sanitizedTooltip")
    @Expose
    private String sanitizedTooltip;
    @SerializedName("effect")
    @Expose
    private List<Object> effect = null;
    @SerializedName("tooltip")
    @Expose
    private String tooltip;
    @SerializedName("maxrank")
    @Expose
    private Integer maxrank;
    @SerializedName("costBurn")
    @Expose
    private String costBurn;
    @SerializedName("rangeBurn")
    @Expose
    private String rangeBurn;
    @SerializedName("range")
    @Expose
    private List<Integer> range = null;
    @SerializedName("cost")
    @Expose
    private List<Integer> cost = null;
    @SerializedName("effectBurn")
    @Expose
    private List<String> effectBurn = null;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("cooldown")
    @Expose
    private List<Integer> cooldown = null;
    @SerializedName("name")
    @Expose
    private String name;

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public void setCooldownBurn(String cooldownBurn) {
        this.cooldownBurn = cooldownBurn;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Leveltip getLeveltip() {
        return leveltip;
    }

    public void setLeveltip(Leveltip leveltip) {
        this.leveltip = leveltip;
    }

    public List<Var> getVars() {
        return vars;
    }

    public void setVars(List<Var> vars) {
        this.vars = vars;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public String getSanitizedTooltip() {
        return sanitizedTooltip;
    }

    public void setSanitizedTooltip(String sanitizedTooltip) {
        this.sanitizedTooltip = sanitizedTooltip;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public void setEffect(List<Object> effect) {
        this.effect = effect;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public Integer getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(Integer maxrank) {
        this.maxrank = maxrank;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public void setRangeBurn(String rangeBurn) {
        this.rangeBurn = rangeBurn;
    }

    public List<Integer> getRange() {
        return range;
    }

    public void setRange(List<Integer> range) {
        this.range = range;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public void setCost(List<Integer> cost) {
        this.cost = cost;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(List<String> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Integer> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Integer> cooldown) {
        this.cooldown = cooldown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
