package net.dqsy.papermg.papermanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "paper_writingtask")
public class PaperWritingTask implements Serializable {
    @Id
    @Column(name = "writingTaskID")
    private Integer writingTaskID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "WritingTaskTitleId", nullable = false)
    private PaperTitle paperTitle;

    @Column(name = "writingTaskStartTime")
    private Date writingTaskStartTime;

    @Column(name = "writingTaskEndTime")
    private Date writingTaskEndTime;
    @Column(name = "writingTaskContent")
    private String writingTaskContent;
    @Column(name = "writingTaskReference")
    private String writingTaskReference;
    @Column(name = "writingTaskFlag")
    private Integer writingTaskFlag;
    @Column(name = "writingTaskcol")
    private String writingTaskcol;
    @Column(name = "writingTaskcol1")
    private String writingTaskcol1;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "paperWritingTask")
    private Set<PaperPlan> paperPlans = new HashSet<>(0);

    public PaperWritingTask() {
    }

    public PaperWritingTask(Date writingTaskStartTime, Date writingTaskEndTime, String writingTaskContent, String writingTaskReference) {
        this.writingTaskStartTime = writingTaskStartTime;
        this.writingTaskEndTime = writingTaskEndTime;
        this.writingTaskContent = writingTaskContent;
        this.writingTaskReference = writingTaskReference;
    }

    public Integer getWritingTaskID() {
        return this.writingTaskID;
    }

    public void setWritingTaskID(Integer writingTaskID) {
        this.writingTaskID = writingTaskID;
    }

    public PaperTitle getPaperTitle() {
        return this.paperTitle;
    }

    public void setPaperTitle(PaperTitle paperTitle) {
        this.paperTitle = paperTitle;
    }

    public Date getWritingTaskStartTime() {
        return this.writingTaskStartTime;
    }

    public void setWritingTaskStartTime(Date writingTaskStartTime) {
        this.writingTaskStartTime = writingTaskStartTime;
    }

    public Date getWritingTaskEndTime() {
        return this.writingTaskEndTime;
    }

    public void setWritingTaskEndTime(Date writingTaskEndTime) {
        this.writingTaskEndTime = writingTaskEndTime;
    }

    public String getWritingTaskContent() {
        return this.writingTaskContent;
    }

    public void setWritingTaskContent(String writingTaskContent) {
        this.writingTaskContent = writingTaskContent;
    }

    public String getWritingTaskReference() {
        return this.writingTaskReference;
    }

    public void setWritingTaskReference(String writingTaskReference) {
        this.writingTaskReference = writingTaskReference;
    }

    public Integer getWritingTaskFlag() {
        return this.writingTaskFlag;
    }

    public void setWritingTaskFlag(Integer writingTaskFlag) {
        this.writingTaskFlag = writingTaskFlag;
    }

    public String getWritingTaskcol() {
        return this.writingTaskcol;
    }

    public void setWritingTaskcol(String writingTaskcol) {
        this.writingTaskcol = writingTaskcol;
    }

    public String getWritingTaskcol1() {
        return this.writingTaskcol1;
    }

    public void setWritingTaskcol1(String writingTaskcol1) {
        this.writingTaskcol1 = writingTaskcol1;
    }

    public Set getPaperPlans() {
        return this.paperPlans;
    }

    public void setPaperPlans(Set paperPlans) {
        this.paperPlans = paperPlans;
    }
}