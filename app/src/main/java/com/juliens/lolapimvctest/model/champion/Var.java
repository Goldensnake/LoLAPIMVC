
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Var implements Parcelable
{

    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("coeff")
    @Expose
    private Object coeff;

    @SerializedName("key")
    @Expose
    private String key;
    public final static Parcelable.Creator<Var> CREATOR = new Creator<Var>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Var createFromParcel(Parcel in) {
            Var instance = new Var();
            instance.link = ((String) in.readValue((String.class.getClassLoader())));
            instance.coeff = (in.readValue((Object.class.getClassLoader())));
            instance.key = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Var[] newArray(int size) {
            return (new Var[size]);
        }

    }
            ;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Object getCoeff() {
        return coeff;
    }

    public void setCoeff(Object coeff) {
        this.coeff = coeff;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(link);
        dest.writeValue(coeff);
        dest.writeValue(key);
    }

    public int describeContents() {
        return 0;
    }

}