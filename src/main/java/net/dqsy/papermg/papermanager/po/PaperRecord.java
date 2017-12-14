package net.dqsy.papermg.papermanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "paper_record")
public class PaperRecord implements Serializable{
    @Id
    @Column(name = "id")
    private int id;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PaperTitleId", unique = true)
    private PaperTitle paperTitle;
    @Column(name = "replyDate")
    private String replyDate;
    @Column(name = "site")
    private String site;
    @Column(name = "record")
    private String record;
    @Column(name = "teamAdvice")
    private String teamAdvice;
    @Column(name = "councilAdvice")
    private String councilAdvice;
    @Column(name = "teamDate")
    private String teamDate;
    @Column(name = "counDate")
    private String counDate;
    @Column(name = "score")
    private double score;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReplyDate() {
        return this.replyDate;
    }

    public void setReplyDate(String replyDate) {
        this.replyDate = replyDate;
    }

    public String getSite() {
        return this.site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getRecord() {
        return this.record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public PaperTitle getPaperTitle() {
        return this.paperTitle;
    }

    public void setPaperTitle(PaperTitle paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getTeamAdvice() {
        return this.teamAdvice;
    }

    public void setTeamAdvice(String teamAdvice) {
        this.teamAdvice = teamAdvice;
    }

    public String getCouncilAdvice() {
        return this.councilAdvice;
    }

    public void setCouncilAdvice(String councilAdvice) {
        this.councilAdvice = councilAdvice;
    }

    public String getTeamDate() {
        return this.teamDate;
    }

    public void setTeamDate(String teamDate) {
        this.teamDate = teamDate;
    }

    public String getCounDate() {
        return this.counDate;
    }

    public void setCounDate(String counDate) {
        this.counDate = counDate;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}