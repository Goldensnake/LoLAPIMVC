
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Recommended implements Parcelable
{

    @SerializedName("champion")
    @Expose
    private String champion;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("map")
    @Expose
    private String map;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("customTag")
    @Expose
    private String customTag;
    @SerializedName("sortrank")
    @Expose
    private Integer sortrank;
    @SerializedName("extensionPage")
    @Expose
    private Boolean extensionPage;
    @SerializedName("customPanel")
    @Expose
    private Object customPanel;
    @SerializedName("blocks")
    @Expose
    private List<Block> blocks = null;
    public final static Parcelable.Creator<Recommended> CREATOR = new Creator<Recommended>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Recommended createFromParcel(Parcel in) {
            Recommended instance = new Recommended();
            instance.champion = ((String) in.readValue((String.class.getClassLoader())));
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.map = ((String) in.readValue((String.class.getClassLoader())));
            instance.mode = ((String) in.readValue((String.class.getClassLoader())));
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.customTag = ((String) in.readValue((String.class.getClassLoader())));
            instance.sortrank = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.extensionPage = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.customPanel = in.readValue((Object.class.getClassLoader()));
            in.readList(instance.blocks, (com.juliens.lolapimvctest.model.champion.Block.class.getClassLoader()));
            return instance;
        }

        public Recommended[] newArray(int size) {
            return (new Recommended[size]);
        }

    }
            ;

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

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
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

    public String getCustomTag() {
        return customTag;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }

    public Integer getSortrank() {
        return sortrank;
    }

    public void setSortrank(Integer sortrank) {
        this.sortrank = sortrank;
    }

    public Boolean getExtensionPage() {
        return extensionPage;
    }

    public void setExtensionPage(Boolean extensionPage) {
        this.extensionPage = extensionPage;
    }

    public Object getCustomPanel() {
        return customPanel;
    }

    public void setCustomPanel(Object customPanel) {
        this.customPanel = customPanel;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(champion);
        dest.writeValue(title);
        dest.writeValue(map);
        dest.writeValue(mode);
        dest.writeValue(type);
        dest.writeValue(customTag);
        dest.writeValue(sortrank);
        dest.writeValue(extensionPage);
        dest.writeValue(customPanel);
        dest.writeList(blocks);
    }

    public int describeContents() {
        return 0;
    }

}