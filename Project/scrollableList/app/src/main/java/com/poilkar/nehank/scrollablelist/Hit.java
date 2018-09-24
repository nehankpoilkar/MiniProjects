
package com.poilkar.nehank.scrollablelist;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hit {

    @SerializedName("_index")
    @Expose
    private String index;
    @SerializedName("_type")
    @Expose
    private String type;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("_score")
    @Expose
    private Object score;
    @SerializedName("_source")
    @Expose
    private Source source;
    @SerializedName("sort")
    @Expose
    private List<Integer> sort = null;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public List<Integer> getSort() {
        return sort;
    }

    public void setSort(List<Integer> sort) {
        this.sort = sort;
    }

}
