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
@Table(name = "paper_score")
public class PaperScore implements Serializable {
    @Id
    @Column(name = "paperTitleId")
    private Integer scoreId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PaperTitleId", unique = true)
    private PaperTitle paperTitle;
    @Column(name = "Tcomment")
    private String tcomment;
    @Column(name = "Tscore")
    private float tscore;
    @Column(name = "CommitteeComment")
    private String committeeComment;
    @Column(name = "CommitteeScore")
    private float committeeScore;
    @Column(name = "TotalScore")
    private float totalScore;
    @Column(name = "councilComment")
    private String councilComment;
    @Column(name = "Remark")
    private String remark;
    @Column(name = "flag")
    private Integer flag;

    public PaperScore() {
    }

    public PaperScore(PaperTitle paperTitle, String tcomment, float tscore, String committeeComment, float committeeScore, float totalScore, String remark, Integer flag) {
        this.paperTitle = paperTitle;
        this.tcomment = tcomment;
        this.tscore = tscore;
        this.committeeComment = committeeComment;
        this.committeeScore = committeeScore;
        this.totalScore = totalScore;
        this.remark = remark;
        this.flag = flag;
    }

    public PaperScore(Integer scoreId, PaperTitle paperTitle, String tcomment, float tscore, String committeeComment, float committeeScore, float totalScore, String remark, Integer flag) {
        this.scoreId = scoreId;
        this.paperTitle = paperTitle;
        this.tcomment = tcomment;
        this.tscore = tscore;
        this.committeeComment = committeeComment;
        this.committeeScore = committeeScore;
        this.totalScore = totalScore;
        this.remark = remark;
        this.flag = flag;
    }

    public Integer getScoreId() {
        return this.scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public PaperTitle getPaperTitle() {
        return this.paperTitle;
    }

    public void setPaperTitle(PaperTitle paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getTcomment() {
        return this.tcomment;
    }

    public void setTcomment(String tcomment) {
        this.tcomment = tcomment;
    }

    public float getTscore() {
        return this.tscore;
    }

    public void setTscore(float tscore) {
        this.tscore = tscore;
    }

    public String getCommitteeComment() {
        return this.committeeComment;
    }

    public void setCommitteeComment(String committeeComment) {
        this.committeeComment = committeeComment;
    }

    public float getCommitteeScore() {
        return this.committeeScore;
    }

    public void setCommitteeScore(float committeeScore) {
        this.committeeScore = committeeScore;
    }

    public float getTotalScore() {
        return this.totalScore;
    }

    public void setTotalScore(float totalScore) {
        this.totalScore = totalScore;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getCouncilComment() {
        return this.councilComment;
    }

    public void setCouncilComment(String councilComment) {
        this.councilComment = councilComment;
    }
}