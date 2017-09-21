
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info implements Parcelable
{

    @SerializedName("attack")
    @Expose
    private Integer attack;
    @SerializedName("defense")
    @Expose
    private Integer defense;
    @SerializedName("magic")
    @Expose
    private Integer magic;
    @SerializedName("difficulty")
    @Expose
    private Integer difficulty;
    public final static Parcelable.Creator<Info> CREATOR = new Creator<Info>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Info createFromParcel(Parcel in) {
            Info instance = new Info();
            instance.attack = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.defense = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.magic = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.difficulty = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public Info[] newArray(int size) {
            return (new Info[size]);
        }

    }
            ;

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(attack);
        dest.writeValue(defense);
        dest.writeValue(magic);
        dest.writeValue(difficulty);
    }

    public int describeContents() {
        return 0;
    }

}
