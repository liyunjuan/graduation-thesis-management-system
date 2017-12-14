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
@Table(name = "paper_thesisproposal")
public class PaperThesisProposal implements Serializable {
    @Id
    @Column(name = "thesisProposalReportId")
    private Integer thesisProposalReportId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TitleId", unique = true, nullable = false)
    private PaperTitle paperTitle;
    @Column(name = "thesisProposalBackground")
    private String thesisProposalBackground;
    @Column(name = "thesisProposalResearchContent")
    private String thesisProposalResearchContent;
    @Column(name = "thesisProposalResearchMethod")
    private String thesisProposalResearchMethod;
    @Column(name = "thesisProposalResearchSchedule")
    private String thesisProposalResearchSchedule;
    @Column(name = "thesisProposalReference")
    private String thesisProposalReference;
    @Column(name = "thesisProposalTeacherSug")
    private String thesisProposalTeacherSug;
    @Column(name = "teacherSugDate")
    private Date teacherSugDate;
    @Column(name = "thesisProposalDeanSug")
    private String thesisProposalDeanSug;
    @Column(name = "deanSugDate")
    private Date deanSugDate;
    @Column(name = "thesisProposalRemark")
    private String thesisProposalRemark;
    @Column(name = "thesisProposalFlag")
    private Integer thesisProposalFlag;

    public PaperThesisProposal() {
    }

    public PaperThesisProposal(String thesisProposalBackground, String thesisProposalResearchContent, String thesisProposalResearchMethod, String thesisProposalResearchSchedule, String thesisProposalReference) {
        this.thesisProposalBackground = thesisProposalBackground;
        this.thesisProposalResearchContent = thesisProposalResearchContent;
        this.thesisProposalResearchMethod = thesisProposalResearchMethod;
        this.thesisProposalResearchSchedule = thesisProposalResearchSchedule;
        this.thesisProposalReference = thesisProposalReference;
    }

    public PaperThesisProposal(Integer thesisProposalReportId, String thesisProposalBackground, String thesisProposalResearchContent, String thesisProposalResearchMethod, String thesisProposalResearchSchedule, String thesisProposalReference, String thesisProposalTeacherSug, Date teacherSugDate) {
        this.thesisProposalReportId = thesisProposalReportId;
        this.thesisProposalBackground = thesisProposalBackground;
        this.thesisProposalResearchContent = thesisProposalResearchContent;
        this.thesisProposalResearchMethod = thesisProposalResearchMethod;
        this.thesisProposalResearchSchedule = thesisProposalResearchSchedule;
        this.thesisProposalReference = thesisProposalReference;
        this.thesisProposalTeacherSug = thesisProposalTeacherSug;
        this.teacherSugDate = teacherSugDate;
    }

    public Integer getThesisProposalReportId() {
        return this.thesisProposalReportId;
    }

    public void setThesisProposalReportId(Integer thesisProposalReportId) {
        this.thesisProposalReportId = thesisProposalReportId;
    }

    public PaperTitle getPaperTitle() {
        return this.paperTitle;
    }

    public void setPaperTitle(PaperTitle paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getThesisProposalBackground() {
        return this.thesisProposalBackground;
    }

    public void setThesisProposalBackground(String thesisProposalBackground) {
        this.thesisProposalBackground = thesisProposalBackground;
    }

    public String getThesisProposalResearchContent() {
        return this.thesisProposalResearchContent;
    }

    public void setThesisProposalResearchContent(String thesisProposalResearchContent) {
        this.thesisProposalResearchContent = thesisProposalResearchContent;
    }

    public String getThesisProposalResearchMethod() {
        return this.thesisProposalResearchMethod;
    }

    public void setThesisProposalResearchMethod(String thesisProposalResearchMethod) {
        this.thesisProposalResearchMethod = thesisProposalResearchMethod;
    }

    public String getThesisProposalResearchSchedule() {
        return this.thesisProposalResearchSchedule;
    }

    public void setThesisProposalResearchSchedule(String thesisProposalResearchSchedule) {
        this.thesisProposalResearchSchedule = thesisProposalResearchSchedule;
    }

    public String getThesisProposalReference() {
        return this.thesisProposalReference;
    }

    public void setThesisProposalReference(String thesisProposalReference) {
        this.thesisProposalReference = thesisProposalReference;
    }

    public String getThesisProposalTeacherSug() {
        return this.thesisProposalTeacherSug;
    }

    public void setThesisProposalTeacherSug(String thesisProposalTeacherSug) {
        this.thesisProposalTeacherSug = thesisProposalTeacherSug;
    }

    public String getThesisProposalDeanSug() {
        return this.thesisProposalDeanSug;
    }

    public void setThesisProposalDeanSug(String thesisProposalDeanSug) {
        this.thesisProposalDeanSug = thesisProposalDeanSug;
    }

    public String getThesisProposalRemark() {
        return this.thesisProposalRemark;
    }

    public void setThesisProposalRemark(String thesisProposalRemark) {
        this.thesisProposalRemark = thesisProposalRemark;
    }

    public Integer getThesisProposalFlag() {
        return this.thesisProposalFlag;
    }

    public void setThesisProposalFlag(Integer thesisProposalFlag) {
        this.thesisProposalFlag = thesisProposalFlag;
    }

    public Date getTeacherSugDate() {
        return this.teacherSugDate;
    }

    public void setTeacherSugDate(Date teacherSugDate) {
        this.teacherSugDate = teacherSugDate;
    }

    public Date getDeanSugDate() {
        return this.deanSugDate;
    }

    public void setDeanSugDate(Date deanSugDate) {
        this.deanSugDate = deanSugDate;
    }
}