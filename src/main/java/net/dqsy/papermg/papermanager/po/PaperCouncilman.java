package net.dqsy.papermg.papermanager.po;

import net.dqsy.papermg.sysmanager.po.PaperTeacher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paper_councilman")
public class PaperCouncilman {
    @Id
    @Column(name = "councilmanId")
    private Integer councilmanId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CouncilId")
    private PaperCouncil paperCouncil;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TeacherId")
    private PaperTeacher paperTeacher;
    @Column(name = "GroupMember")
    private String groupMember;
    @Column(name = "Chair")
    private Integer chair;

    public PaperCouncilman() {
    }

    public PaperCouncilman(PaperCouncil paperCouncil, PaperTeacher paperTeacher, String groupMember, Integer chair) {
        this.paperCouncil = paperCouncil;
        this.paperTeacher = paperTeacher;
        this.groupMember = groupMember;
        this.chair = chair;
    }

    public PaperCouncilman(Integer councilmanId, PaperCouncil paperCouncil, PaperTeacher paperTeacher, String groupMember, Integer chair) {
        this.councilmanId = councilmanId;
        this.paperCouncil = paperCouncil;
        this.paperTeacher = paperTeacher;
        this.groupMember = groupMember;
        this.chair = chair;
    }

    public Integer getCouncilmanId() {
        return this.councilmanId;
    }

    public void setCouncilmanId(Integer councilmanId) {
        this.councilmanId = councilmanId;
    }

    public PaperCouncil getPaperCouncil() {
        return this.paperCouncil;
    }

    public void setPaperCouncil(PaperCouncil paperCouncil) {
        this.paperCouncil = paperCouncil;
    }

    public PaperTeacher getPaperTeacher() {
        return this.paperTeacher;
    }

    public void setPaperTeacher(PaperTeacher paperTeacher) {
        this.paperTeacher = paperTeacher;
    }

    public String getGroupMember() {
        return this.groupMember;
    }

    public void setGroupMember(String groupMember) {
        this.groupMember = groupMember;
    }

    public Integer getChair() {
        return this.chair;
    }

    public void setChair(Integer chair) {
        this.chair = chair;
    }
}