
package com.poilkar.nehank.scrollablelist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

    @SerializedName("tribunal")
    @Expose
    private String tribunal;
    @SerializedName("Judge_name")
    @Expose
    private String judgeName;
    @SerializedName("Court")
    @Expose
    private String court;
    @SerializedName("citedNo")
    @Expose
    private Integer citedNo;
    @SerializedName("cases_cited")
    @Expose
    private String casesCited;
    @SerializedName("Citation")
    @Expose
    private String citation;
    @SerializedName("Case_No")
    @Expose
    private String caseNo;
    @SerializedName("Adv_respondent")
    @Expose
    private String advRespondent;
    @SerializedName("Petitioner")
    @Expose
    private String petitioner;
    @SerializedName("judgement")
    @Expose
    private String judgement;
    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("Respondent")
    @Expose
    private String respondent;
    @SerializedName("fileurl")
    @Expose
    private String fileurl;
    @SerializedName("HeadNote_keywords")
    @Expose
    private String headNoteKeywords;
    @SerializedName("decision")
    @Expose
    private String decision;
    @SerializedName("Adv_petitioner")
    @Expose
    private String advPetitioner;

    public String getTribunal() {
        return tribunal;
    }

    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

    public String getJudgeName() {
        return judgeName;
    }

    public void setJudgeName(String judgeName) {
        this.judgeName = judgeName;
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    public Integer getCitedNo() {
        return citedNo;
    }

    public void setCitedNo(Integer citedNo) {
        this.citedNo = citedNo;
    }

    public String getCasesCited() {
        return casesCited;
    }

    public void setCasesCited(String casesCited) {
        this.casesCited = casesCited;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getAdvRespondent() {
        return advRespondent;
    }

    public void setAdvRespondent(String advRespondent) {
        this.advRespondent = advRespondent;
    }

    public String getPetitioner() {
        return petitioner;
    }

    public void setPetitioner(String petitioner) {
        this.petitioner = petitioner;
    }

    public String getJudgement() {
        return judgement;
    }

    public void setJudgement(String judgement) {
        this.judgement = judgement;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRespondent() {
        return respondent;
    }

    public void setRespondent(String respondent) {
        this.respondent = respondent;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public String getHeadNoteKeywords() {
        return headNoteKeywords;
    }

    public void setHeadNoteKeywords(String headNoteKeywords) {
        this.headNoteKeywords = headNoteKeywords;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getAdvPetitioner() {
        return advPetitioner;
    }

    public void setAdvPetitioner(String advPetitioner) {
        this.advPetitioner = advPetitioner;
    }

}
