
package com.juliens.lolapimvctest.model.champion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("armorperlevel")
    @Expose
    private Double armorperlevel;
    @SerializedName("attackdamage")
    @Expose
    private Double attackdamage;
    @SerializedName("mpperlevel")
    @Expose
    private Integer mpperlevel;
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
    private Integer attackspeedperlevel;
    @SerializedName("attackrange")
    @Expose
    private Integer attackrange;
    @SerializedName("movespeed")
    @Expose
    private Integer movespeed;
    @SerializedName("attackdamageperlevel")
    @Expose
    private Double attackdamageperlevel;
    @SerializedName("mpregenperlevel")
    @Expose
    private Double mpregenperlevel;
    @SerializedName("critperlevel")
    @Expose
    private Integer critperlevel;
    @SerializedName("spellblockperlevel")
    @Expose
    private Double spellblockperlevel;
    @SerializedName("crit")
    @Expose
    private Integer crit;
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
    private Integer hpperlevel;

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

    public Integer getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(Integer mpperlevel) {
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

    public Integer getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(Integer attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    public Integer getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(Integer attackrange) {
        this.attackrange = attackrange;
    }

    public Integer getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(Integer movespeed) {
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

    public Integer getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(Integer critperlevel) {
        this.critperlevel = critperlevel;
    }

    public Double getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(Double spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    public Integer getCrit() {
        return crit;
    }

    public void setCrit(Integer crit) {
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

    public Integer getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(Integer hpperlevel) {
        this.hpperlevel = hpperlevel;
    }
}
