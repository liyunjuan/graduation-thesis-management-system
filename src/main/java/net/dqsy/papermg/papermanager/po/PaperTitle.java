package net.dqsy.papermg.papermanager.po;

import net.dqsy.papermg.sysmanager.po.PaperStudent;
import net.dqsy.papermg.sysmanager.po.PaperTeacher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "paper_title")
public class PaperTitle implements Serializable {
    @Id
    @Column(name = "paperTitleId")
    private int paperTitleId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "studentId",unique = true)
    private PaperStudent paperStudent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacherId", unique = true)
    private PaperTeacher paperTeacher;

    @Column(name = "paperTitleName")
    private String paperTitleName;

    @Column(name = "paperTitleKeywords")
    private String paperTitleKeywords;

    @Column(name = "paperTitletype")
    private String paperTitletype;

    @Column(name = "paperTitleSource")
    private String paperTitleSource;

    @Column(name = "paperTitlePlatform")
    private String paperTitlePlatform;

    @Column(name = "paperTitleLimitMajor")
    private String paperTitleLimitMajor;

    @Column(name = "paperTitleIntroduce")
    private String paperTitleIntroduce;

    @Column(name = "paperTitleReportDate")
    private Date paperTitleReportDate;

    @Column(name = "paperTitleDeanSug")
    private String paperTitleDeanSug;

    @Column(name = "paperTitleApproveDate")
    private Date paperTitleApproveDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "paperTitleState",unique = true)
    private PaperTitleState paperTitleState;

    @Column(name = "paperTitleRemark")
    private String paperTitleRemark;

    @Column(name = "paperTitleFlag")
    private int paperTitleFlag;

    @Column(name = "paperTitlecol")
    private String paperTitlecol;

    @Column(name = "paperTitlecol1")
    private String paperTitlecol1;

    @OneToOne(mappedBy = "paperTitle")
    private PaperRecord paperRecord;

    @OneToOne(mappedBy = "paperTitle")
    private PaperScore paperScore;

    public PaperTitle() {
    }

    public PaperTitle(String paperTitleName, String paperTitleKeywords, String paperTitletype, String paperTitleSource, String paperTitlePlatform, String paperTitleLimitMajor, String paperTitleIntroduce, Date paperTitleReportDate, PaperTitleState paperTitleState) {
        this.paperTitleName = paperTitleName;
        this.paperTitleKeywords = paperTitleKeywords;
        this.paperTitletype = paperTitletype;
        this.paperTitleSource = paperTitleSource;
        this.paperTitlePlatform = paperTitlePlatform;
        this.paperTitleLimitMajor = paperTitleLimitMajor;
        this.paperTitleIntroduce = paperTitleIntroduce;
        this.paperTitleReportDate = paperTitleReportDate;
        this.paperTitleState = paperTitleState;
    }

    public int getPaperTitleId() {
        return this.paperTitleId;
    }

    public void setPaperTitleId(int paperTitleId) {
        this.paperTitleId = paperTitleId;
    }

    public PaperStudent getPaperStudent() {
        return this.paperStudent;
    }

    public void setPaperStudent(PaperStudent paperStudent) {
        this.paperStudent = paperStudent;
    }

    public PaperTeacher getPaperTeacher() {
        return this.paperTeacher;
    }

    public void setPaperTeacher(PaperTeacher paperTeacher) {
        this.paperTeacher = paperTeacher;
    }

    public String getPaperTitleName() {
        return this.paperTitleName;
    }

    public void setPaperTitleName(String paperTitleName) {
        this.paperTitleName = paperTitleName;
    }

    public String getPaperTitleKeywords() {
        return this.paperTitleKeywords;
    }

    public void setPaperTitleKeywords(String paperTitleKeywords) {
        this.paperTitleKeywords = paperTitleKeywords;
    }

    public String getPaperTitletype() {
        return this.paperTitletype;
    }

    public void setPaperTitletype(String paperTitletype) {
        this.paperTitletype = paperTitletype;
    }

    public String getPaperTitleSource() {
        return this.paperTitleSource;
    }

    public void setPaperTitleSource(String paperTitleSource) {
        this.paperTitleSource = paperTitleSource;
    }

    public String getPaperTitlePlatform() {
        return this.paperTitlePlatform;
    }

    public void setPaperTitlePlatform(String paperTitlePlatform) {
        this.paperTitlePlatform = paperTitlePlatform;
    }

    public String getPaperTitleLimitMajor() {
        return this.paperTitleLimitMajor;
    }

    public void setPaperTitleLimitMajor(String paperTitleLimitMajor) {
        this.paperTitleLimitMajor = paperTitleLimitMajor;
    }

    public String getPaperTitleIntroduce() {
        return this.paperTitleIntroduce;
    }

    public void setPaperTitleIntroduce(String paperTitleIntroduce) {
        this.paperTitleIntroduce = paperTitleIntroduce;
    }

    public String getPaperTitleDeanSug() {
        return this.paperTitleDeanSug;
    }

    public void setPaperTitleDeanSug(String paperTitleDeanSug) {
        this.paperTitleDeanSug = paperTitleDeanSug;
    }

    public String getPaperTitleRemark() {
        return this.paperTitleRemark;
    }

    public void setPaperTitleRemark(String paperTitleRemark) {
        this.paperTitleRemark = paperTitleRemark;
    }

    public String getPaperTitlecol() {
        return this.paperTitlecol;
    }

    public void setPaperTitlecol(String paperTitlecol) {
        this.paperTitlecol = paperTitlecol;
    }

    public String getPaperTitlecol1() {
        return this.paperTitlecol1;
    }

    public void setPaperTitlecol1(String paperTitlecol1) {
        this.paperTitlecol1 = paperTitlecol1;
    }

    public Date getPaperTitleReportDate() {
        return this.paperTitleReportDate;
    }

    public void setPaperTitleReportDate(Date paperTitleReportDate) {
        this.paperTitleReportDate = paperTitleReportDate;
    }

    public Date getPaperTitleApproveDate() {
        return this.paperTitleApproveDate;
    }

    public void setPaperTitleApproveDate(Date paperTitleApproveDate) {
        this.paperTitleApproveDate = paperTitleApproveDate;
    }

    public PaperTitleState getPaperTitleState() {
        return this.paperTitleState;
    }

    public void setPaperTitleState(PaperTitleState paperTitleState) {
        this.paperTitleState = paperTitleState;
    }

    public int getPaperTitleFlag() {
        return this.paperTitleFlag;
    }

    public void setPaperTitleFlag(int paperTitleFlag) {
        this.paperTitleFlag = paperTitleFlag;
    }

    public PaperRecord getPaperRecord() {
        return this.paperRecord;
    }

    public void setPaperRecord(PaperRecord paperRecord) {
        this.paperRecord = paperRecord;
    }

    public PaperScore getPaperScore() {
        return this.paperScore;
    }

    public void setPaperScore(PaperScore paperScore) {
        this.paperScore = paperScore;
    }
}