
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Leveltip implements Parcelable
{

    @SerializedName("label")
    @Expose
    private List<String> label = null;
    @SerializedName("effect")
    @Expose
    private List<String> effect = null;
    public final static Parcelable.Creator<Leveltip> CREATOR = new Creator<Leveltip>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Leveltip createFromParcel(Parcel in) {
            Leveltip instance = new Leveltip();
            in.readList(instance.label, (java.lang.String.class.getClassLoader()));
            in.readList(instance.effect, (java.lang.String.class.getClassLoader()));
            return instance;
        }

        public Leveltip[] newArray(int size) {
            return (new Leveltip[size]);
        }

    }
            ;

    public List<String> getLabel() {
        return label;
    }

    public void setLabel(List<String> label) {
        this.label = label;
    }

    public List<String> getEffect() {
        return effect;
    }

    public void setEffect(List<String> effect) {
        this.effect = effect;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(label);
        dest.writeList(effect);
    }

    public int describeContents() {
        return 0;
    }

}