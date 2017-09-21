
package com.juliens.lolapimvctest.model.champion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Stats implements Serializable{

    @SerializedName("armorperlevel")
    @Expose
    private Double armorperlevel;
    @SerializedName("attackdamage")
    @Expose
    private Double attackdamage;
    @SerializedName("mpperlevel")
    @Expose
    private Double mpperlevel;
    @SerializedName("attackspeedoffset")
    @Expose
    private Double attackspeedoffset;
    @SerializedName("mp")
    @Expose
    private Double mp;
    @SerializedName("armor")
    @Expose
    private Double armor;
    @SerializedName("hp")
    @Expose
    private Double hp;
    @SerializedName("hpregenperlevel")
    @Expose
    private Double hpregenperlevel;
    @SerializedName("attackspeedperlevel")
    @Expose
    private Double attackspeedperlevel;
    @SerializedName("attackrange")
    @Expose
    private Double attackrange;
    @SerializedName("movespeed")
    @Expose
    private Double movespeed;
    @SerializedName("attackdamageperlevel")
    @Expose
    private Double attackdamageperlevel;
    @SerializedName("mpregenperlevel")
    @Expose
    private Double mpregenperlevel;
    @SerializedName("critperlevel")
    @Expose
    private Double critperlevel;
    @SerializedName("spellblockperlevel")
    @Expose
    private Double spellblockperlevel;
    @SerializedName("crit")
    @Expose
    private Double crit;
    @SerializedName("mpregen")
    @Expose
    private Double mpregen;
    @SerializedName("spellblock")
    @Expose
    private Double spellblock;
    @SerializedName("hpregen")
    @Expose
    private Double hpregen;
    @SerializedName("hpperlevel")
    @Expose
    private Double hpperlevel;

    public Double getArmorperlevel() {
        return armorperlevel;
    }

    public void setArmorperlevel(Double armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    public Double getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(Double attackdamage) {
        this.attackdamage = attackdamage;
    }

    public Double getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(Double mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    public Double getAttackspeedoffset() {
        return attackspeedoffset;
    }

    public void setAttackspeedoffset(Double attackspeedoffset) {
        this.attackspeedoffset = attackspeedoffset;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    public Double getArmor() {
        return armor;
    }

    public void setArmor(Double armor) {
        this.armor = armor;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public Double getHpregenperlevel() {
        return hpregenperlevel;
    }

    public void setHpregenperlevel(Double hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    public Double getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(Double attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    public Double getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(Double attackrange) {
        this.attackrange = attackrange;
    }

    public Double getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(Double movespeed) {
        this.movespeed = movespeed;
    }

    public Double getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    public void setAttackdamageperlevel(Double attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    public Double getMpregenperlevel() {
        return mpregenperlevel;
    }

    public void setMpregenperlevel(Double mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    public Double getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(Double critperlevel) {
        this.critperlevel = critperlevel;
    }

    public Double getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(Double spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    public Double getCrit() {
        return crit;
    }

    public void setCrit(Double crit) {
        this.crit = crit;
    }

    public Double getMpregen() {
        return mpregen;
    }

    public void setMpregen(Double mpregen) {
        this.mpregen = mpregen;
    }

    public Double getSpellblock() {
        return spellblock;
    }

    public void setSpellblock(Double spellblock) {
        this.spellblock = spellblock;
    }

    public Double getHpregen() {
        return hpregen;
    }

    public void setHpregen(Double hpregen) {
        this.hpregen = hpregen;
    }

    public Double getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(Double hpperlevel) {
        this.hpperlevel = hpperlevel;
    }
}
