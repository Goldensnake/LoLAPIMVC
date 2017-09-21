
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Passive implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image")
    @Expose
    private Image image;
    public final static Parcelable.Creator<Passive> CREATOR = new Creator<Passive>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Passive createFromParcel(Parcel in) {
            Passive instance = new Passive();
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.description = ((String) in.readValue((String.class.getClassLoader())));
            instance.image = ((Image) in.readValue((Image.class.getClassLoader())));
            return instance;
        }

        public Passive[] newArray(int size) {
            return (new Passive[size]);
        }

    }
            ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(image);
    }

    public int describeContents() {
        return 0;
    }

}