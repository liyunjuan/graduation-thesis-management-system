package net.dqsy.papermg.papermanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "paper_apply")
public class PaperApply implements Serializable {
    @Id
    @Column(name = "AplyID")
    private Integer aplyId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "titleId")
    private PaperTitle paperTitle;
    @Column(name = "applyReason")
    private String applyReason;
    @Column(name = "applyDate")
    private Date applyDate;
    @Column(name = "Score")
    private String score;
    @Column(name = "allowReply")
    private String allowReply;
    @Column(name = "inpuDate")
    private Date inpuDate;
    @Column(name = "flag")
    private Integer flag;

    public PaperApply() {
    }

    public PaperApply(String applyReason, Date applyDate) {
        this.applyReason = applyReason;
        this.applyDate = applyDate;
    }

    public PaperApply(String applyReason, Date applyDate, String score, String allowReply, Date inpuDate) {
        this.applyReason = applyReason;
        this.applyDate = applyDate;
        this.score = score;
        this.allowReply = allowReply;
        this.inpuDate = inpuDate;
    }

    public PaperApply(Integer aplyId, String applyReason, Date applyDate, String score, String allowReply, Date inpuDate) {
        this.aplyId = aplyId;
        this.applyReason = applyReason;
        this.applyDate = applyDate;
        this.score = score;
        this.allowReply = allowReply;
        this.inpuDate = inpuDate;
    }

    public Integer getAplyId() {
        return this.aplyId;
    }

    public void setAplyId(Integer aplyId) {
        this.aplyId = aplyId;
    }

    public PaperTitle getPaperTitle() {
        return this.paperTitle;
    }

    public void setPaperTitle(PaperTitle paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getApplyReason() {
        return this.applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public Date getApplyDate() {
        return this.applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAllowReply() {
        return this.allowReply;
    }

    public void setAllowReply(String allowReply) {
        this.allowReply = allowReply;
    }

    public Date getInpuDate() {
        return this.inpuDate;
    }

    public void setInpuDate(Date inpuDate) {
        this.inpuDate = inpuDate;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}