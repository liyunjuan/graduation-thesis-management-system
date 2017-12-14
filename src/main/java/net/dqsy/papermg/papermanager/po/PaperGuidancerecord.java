package net.dqsy.papermg.papermanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "paper_guidancerecord")
public class PaperGuidancerecord implements Serializable {
    @Id
    @Column(name = "GuidId")
    private Integer guidId;
    @ManyToOne
    @JoinColumn(name = "titleId")
    private PaperTitle paperTitle;
    @Column(name = "Guidance")
    private String guidance;
    @Column(name = "GuidanceType")
    private String guidanceType;
    @Column(name = "GuidanceDate")
    private Date guidanceDate;
    @Column(name = "GuidanceUpDate")
    private Date guidanceUpDate;
    @Column(name = "filePath")
    private String filePath;
    @Column(name = "flag")
    private Integer flag;
    @Column(name = "remark")
    private String remark;

    public PaperGuidancerecord() {
    }

    public PaperGuidancerecord(Integer guidId, String guidance, String guidanceType, Date guidanceDate) {
        this.guidId = guidId;
        this.guidance = guidance;
        this.guidanceType = guidanceType;
        this.guidanceDate = guidanceDate;
    }

    public Integer getGuidId() {
        return this.guidId;
    }

    public void setGuidId(Integer guidId) {
        this.guidId = guidId;
    }

    public PaperTitle getPaperTitle() {
        return this.paperTitle;
    }

    public void setPaperTitle(PaperTitle paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getGuidance() {
        return this.guidance;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    public String getGuidanceType() {
        return this.guidanceType;
    }

    public void setGuidanceType(String guidanceType) {
        this.guidanceType = guidanceType;
    }

    public Date getGuidanceDate() {
        return this.guidanceDate;
    }

    public void setGuidanceDate(Date guidanceDate) {
        this.guidanceDate = guidanceDate;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getGuidanceUpDate() {
        return this.guidanceUpDate;
    }

    public void setGuidanceUpDate(Date guidanceUpDate) {
        this.guidanceUpDate = guidanceUpDate;
    }
}