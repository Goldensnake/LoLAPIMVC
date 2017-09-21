
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChampionData implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("skins")
    @Expose
    private List<Skin> skins = null;
    @SerializedName("lore")
    @Expose
    private String lore;
    @SerializedName("blurb")
    @Expose
    private String blurb;
    @SerializedName("allytips")
    @Expose
    private List<String> allytips = null;
    @SerializedName("enemytips")
    @Expose
    private List<String> enemytips = null;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("partype")
    @Expose
    private String partype;
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("passive")
    @Expose
    private Passive passive;
    @SerializedName("spells")
    @Expose
    private List<Spell> spells = null;
    @SerializedName("recommended")
    @Expose
    private List<Recommended> recommended = null;

    public final static Parcelable.Creator<ChampionData> CREATOR = new Creator<ChampionData>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ChampionData createFromParcel(Parcel in) {
            ChampionData instance = new ChampionData();
            instance.id = ((String) in.readValue((String.class.getClassLoader())));
            instance.key = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.image = ((Image) in.readValue((Image.class.getClassLoader())));
            in.readList(instance.skins, (com.juliens.lolapimvctest.model.champion.Skin.class.getClassLoader()));
            instance.lore = ((String) in.readValue((String.class.getClassLoader())));
            instance.blurb = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.allytips, (java.lang.String.class.getClassLoader()));
            in.readList(instance.enemytips, (java.lang.String.class.getClassLoader()));
            in.readList(instance.tags, (java.lang.String.class.getClassLoader()));
            instance.partype = ((String) in.readValue((String.class.getClassLoader())));
            instance.info = ((Info) in.readValue((Info.class.getClassLoader())));
            instance.stats = ((Stats) in.readValue((Stats.class.getClassLoader())));
            instance.passive = ((Passive) in.readValue((Passive.class.getClassLoader())));
            in.readList(instance.spells, (com.juliens.lolapimvctest.model.champion.Spell.class.getClassLoader()));
            in.readList(instance.recommended, (com.juliens.lolapimvctest.model.champion.Recommended.class.getClassLoader()));
            return instance;
        }

        public ChampionData[] newArray(int size) {
            return (new ChampionData[size]);
        }

    }
            ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Skin> getSkins() {
        return skins;
    }

    public void setSkins(List<Skin> skins) {
        this.skins = skins;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public List<String> getAllytips() {
        return allytips;
    }

    public void setAllytips(List<String> allytips) {
        this.allytips = allytips;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(List<String> enemytips) {
        this.enemytips = enemytips;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Passive getPassive() {
        return passive;
    }

    public void setPassive(Passive passive) {
        this.passive = passive;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public List<Recommended> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<Recommended> recommended) {
        this.recommended = recommended;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(key);
        dest.writeValue(name);
        dest.writeValue(title);
        dest.writeValue(image);
        dest.writeList(skins);
        dest.writeValue(lore);
        dest.writeValue(blurb);
        dest.writeList(allytips);
        dest.writeList(enemytips);
        dest.writeList(tags);
        dest.writeValue(partype);
        dest.writeValue(info);
        dest.writeValue(stats);
        dest.writeValue(passive);
        dest.writeList(spells);
        dest.writeList(recommended);
    }

    public int describeContents() {
        return 0;
    }

}