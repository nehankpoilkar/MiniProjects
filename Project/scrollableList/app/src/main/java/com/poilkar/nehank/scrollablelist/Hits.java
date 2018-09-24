
package com.poilkar.nehank.scrollablelist;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hits {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("max_score")
    @Expose
    private Object maxScore;
    @SerializedName("hits")
    @Expose
    private List<Hit> hits = null;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Object getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Object maxScore) {
        this.maxScore = maxScore;
    }

    public List<Hit> getHits() {
        return hits;
    }

    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

}
