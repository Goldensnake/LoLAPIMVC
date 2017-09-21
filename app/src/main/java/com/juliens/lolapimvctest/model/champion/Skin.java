
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Skin implements Parcelable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("num")
    @Expose
    private Integer num;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("chromas")
    @Expose
    private Boolean chromas;
    public final static Parcelable.Creator<Skin> CREATOR = new Creator<Skin>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Skin createFromParcel(Parcel in) {
            Skin instance = new Skin();
            instance.id = ((String) in.readValue((String.class.getClassLoader())));
            instance.num = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.chromas = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            return instance;
        }

        public Skin[] newArray(int size) {
            return (new Skin[size]);
        }

    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getChromas() {
        return chromas;
    }

    public void setChromas(Boolean chromas) {
        this.chromas = chromas;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(num);
        dest.writeValue(name);
        dest.writeValue(chromas);
    }

    public int describeContents() {
        return 0;
    }
}