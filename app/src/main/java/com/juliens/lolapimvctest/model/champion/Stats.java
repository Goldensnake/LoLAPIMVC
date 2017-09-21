
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats implements Parcelable
{

    @SerializedName("hp")
    @Expose
    private Double hp;
    @SerializedName("hpperlevel")
    @Expose
    private Double hpperlevel;
    @SerializedName("mp")
    @Expose
    private Double mp;
    @SerializedName("mpperlevel")
    @Expose
    private Double mpperlevel;
    @SerializedName("movespeed")
    @Expose
    private Double movespeed;
    @SerializedName("armor")
    @Expose
    private Double armor;
    @SerializedName("armorperlevel")
    @Expose
    private Double armorperlevel;
    @SerializedName("spellblock")
    @Expose
    private Double spellblock;
    @SerializedName("spellblockperlevel")
    @Expose
    private Double spellblockperlevel;
    @SerializedName("attackrange")
    @Expose
    private Double attackrange;
    @SerializedName("hpregen")
    @Expose
    private Double hpregen;
    @SerializedName("hpregenperlevel")
    @Expose
    private Double hpregenperlevel;
    @SerializedName("mpregen")
    @Expose
    private Double mpregen;
    @SerializedName("mpregenperlevel")
    @Expose
    private Double mpregenperlevel;
    @SerializedName("crit")
    @Expose
    private Double crit;
    @SerializedName("critperlevel")
    @Expose
    private Double critperlevel;
    @SerializedName("attackdamage")
    @Expose
    private Double attackdamage;
    @SerializedName("attackdamageperlevel")
    @Expose
    private Double attackdamageperlevel;
    @SerializedName("attackspeedoffset")
    @Expose
    private Double attackspeedoffset;
    @SerializedName("attackspeedperlevel")
    @Expose
    private Double attackspeedperlevel;
    public final static Parcelable.Creator<Stats> CREATOR = new Creator<Stats>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Stats createFromParcel(Parcel in) {
            Stats instance = new Stats();
            instance.hp = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.hpperlevel = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.mp = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.mpperlevel = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.movespeed = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.armor = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.armorperlevel = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.spellblock = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.spellblockperlevel = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.attackrange = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.hpregen = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.hpregenperlevel = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.mpregen = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.mpregenperlevel = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.crit = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.critperlevel = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.attackdamage = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.attackdamageperlevel = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.attackspeedoffset = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.attackspeedperlevel = ((Double) in.readValue((Double.class.getClassLoader())));
            return instance;
        }

        public Stats[] newArray(int size) {
            return (new Stats[size]);
        }

    }
            ;

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public Double getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(Double hpperlevel) {
        this.hpperlevel = hpperlevel;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    public Double getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(Double mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    public Double getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(Double movespeed) {
        this.movespeed = movespeed;
    }

    public Double getArmor() {
        return armor;
    }

    public void setArmor(Double armor) {
        this.armor = armor;
    }

    public Double getArmorperlevel() {
        return armorperlevel;
    }

    public void setArmorperlevel(Double armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    public Double getSpellblock() {
        return spellblock;
    }

    public void setSpellblock(Double spellblock) {
        this.spellblock = spellblock;
    }

    public Double getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(Double spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    public Double getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(Double attackrange) {
        this.attackrange = attackrange;
    }

    public Double getHpregen() {
        return hpregen;
    }

    public void setHpregen(Double hpregen) {
        this.hpregen = hpregen;
    }

    public Double getHpregenperlevel() {
        return hpregenperlevel;
    }

    public void setHpregenperlevel(Double hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    public Double getMpregen() {
        return mpregen;
    }

    public void setMpregen(Double mpregen) {
        this.mpregen = mpregen;
    }

    public Double getMpregenperlevel() {
        return mpregenperlevel;
    }

    public void setMpregenperlevel(Double mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    public Double getCrit() {
        return crit;
    }

    public void setCrit(Double crit) {
        this.crit = crit;
    }

    public Double getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(Double critperlevel) {
        this.critperlevel = critperlevel;
    }

    public Double getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(Double attackdamage) {
        this.attackdamage = attackdamage;
    }

    public Double getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    public void setAttackdamageperlevel(Double attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    public Double getAttackspeedoffset() {
        return attackspeedoffset;
    }

    public void setAttackspeedoffset(Double attackspeedoffset) {
        this.attackspeedoffset = attackspeedoffset;
    }

    public Double getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(Double attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(hp);
        dest.writeValue(hpperlevel);
        dest.writeValue(mp);
        dest.writeValue(mpperlevel);
        dest.writeValue(movespeed);
        dest.writeValue(armor);
        dest.writeValue(armorperlevel);
        dest.writeValue(spellblock);
        dest.writeValue(spellblockperlevel);
        dest.writeValue(attackrange);
        dest.writeValue(hpregen);
        dest.writeValue(hpregenperlevel);
        dest.writeValue(mpregen);
        dest.writeValue(mpregenperlevel);
        dest.writeValue(crit);
        dest.writeValue(critperlevel);
        dest.writeValue(attackdamage);
        dest.writeValue(attackdamageperlevel);
        dest.writeValue(attackspeedoffset);
        dest.writeValue(attackspeedperlevel);
    }

    public int describeContents() {
        return 0;
    }

}