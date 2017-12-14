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
@Table(name = "paper_plan")
public class PaperPlan implements Serializable {
    @Id
    @Column(name = "PlanId")
    private Integer planId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PlanWritingTaskId", nullable = false)
    private PaperWritingTask paperWritingTask;




    @Column(name = "planTask")
    private String planTask;
    @Column(name = "planStartTime")
    private Date planStartTime;
    @Column(name = "planEndTime")
    private Date planEndTime;
    @Column(name = "planFlag")
    private Integer planFlag;
    @Column(name = "plancol")
    private String plancol;

    public PaperPlan() {
    }

    public PaperPlan(String planTask, Date planStartTime, Date planEndTime) {
        this.planTask = planTask;
        this.planStartTime = planStartTime;
        this.planEndTime = planEndTime;
    }

    public Date getPlanStartTime() {
        return this.planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Integer getPlanId() {
        return this.planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public PaperWritingTask getPaperWritingTask() {
        return this.paperWritingTask;
    }

    public void setPaperWritingTask(PaperWritingTask paperWritingTask) {
        this.paperWritingTask = paperWritingTask;
    }

    public String getPlanTask() {
        return this.planTask;
    }

    public void setPlanTask(String planTask) {
        this.planTask = planTask;
    }

    public Date getPlanEndTime() {
        return this.planEndTime;
    }

    public void setPlanEndTime(Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    public Integer getPlanFlag() {
        return this.planFlag;
    }

    public void setPlanFlag(Integer planFlag) {
        this.planFlag = planFlag;
    }

    public String getPlancol() {
        return this.plancol;
    }

    public void setPlancol(String plancol) {
        this.plancol = plancol;
    }
}