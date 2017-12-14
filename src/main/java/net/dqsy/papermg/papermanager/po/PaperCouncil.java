package net.dqsy.papermg.papermanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "paper_council")
public class PaperCouncil implements Serializable{

    @Id
    @Column(name = "councilId")
    private Integer councilId;
    @Column(name = "department")
    private String department;
    @Column(name = "major")
    private String major;
    @Column(name = "grade")
    private String grade;
    @Column(name = "deanSug")
    private String deanSug;
    @Column(name = "deanDate")
    private Date deanDate;
    @Column(name = "DeanOfficeSug")
    private String DeanOfficeSug;
    @Column(name = "DeanOfficeDate")
    private Date DeanOfficeDate;
    @OneToMany(cascade = {PERSIST, MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "councilId")
    private Set<PaperCouncilman> councilman;
    @Column(name = "state")
    private Integer state;

    public Integer getCouncilId() {
        return this.councilId;
    }

    public void setCouncilId(Integer councilId) {
        this.councilId = councilId;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Set getCouncilman() {
        return this.councilman;
    }

    public void setCouncilman(Set councilman) {
        this.councilman = councilman;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDeanSug() {
        return this.deanSug;
    }

    public void setDeanSug(String deanSug) {
        this.deanSug = deanSug;
    }

    public Date getDeanDate() {
        return this.deanDate;
    }

    public void setDeanDate(Date deanDate) {
        this.deanDate = deanDate;
    }

    public String getDeanOfficeSug() {
        return this.DeanOfficeSug;
    }

    public void setDeanOfficeSug(String deanOfficeSug) {
        this.DeanOfficeSug = deanOfficeSug;
    }

    public Date getDeanOfficeDate() {
        return this.DeanOfficeDate;
    }

    public void setDeanOfficeDate(Date deanOfficeDate) {
        this.DeanOfficeDate = deanOfficeDate;
    }
}