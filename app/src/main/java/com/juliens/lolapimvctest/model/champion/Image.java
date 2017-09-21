
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image implements Parcelable
{

    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("sprite")
    @Expose
    private String sprite;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("x")
    @Expose
    private Integer x;
    @SerializedName("y")
    @Expose
    private Integer y;
    @SerializedName("w")
    @Expose
    private Integer w;
    @SerializedName("h")
    @Expose
    private Integer h;
    public final static Parcelable.Creator<Image> CREATOR = new Creator<Image>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Image createFromParcel(Parcel in) {
            Image instance = new Image();
            instance.full = ((String) in.readValue((String.class.getClassLoader())));
            instance.sprite = ((String) in.readValue((String.class.getClassLoader())));
            instance.group = ((String) in.readValue((String.class.getClassLoader())));
            instance.x = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.y = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.w = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.h = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public Image[] newArray(int size) {
            return (new Image[size]);
        }

    }
            ;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(full);
        dest.writeValue(sprite);
        dest.writeValue(group);
        dest.writeValue(x);
        dest.writeValue(y);
        dest.writeValue(w);
        dest.writeValue(h);
    }

    public int describeContents() {
        return 0;
    }

}
