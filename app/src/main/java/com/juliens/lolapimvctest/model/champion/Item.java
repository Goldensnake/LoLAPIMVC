
package com.juliens.lolapimvctest.model.champion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("id")
    @Expose
    private Integer id;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
