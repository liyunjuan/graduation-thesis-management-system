package net.dqsy.papermg.sysmanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "paper_student")
public class PaperStudent implements Serializable {
    /**
     * 学生ID
     */
    @Id
    @Column(name = "studentId")
    private Integer studentId;
    /**
     * 学生关联到一个用户
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId",nullable = false)
    private PaperUser paperUser;
    /**
     * 姓名
     */
    @Column(name = "studentName")
    private String studentName;
    /**
     * 性别
     */
    @Column(name = "studentSex")
    private String studentSex;
    /**
     * 院系
     */
    @Column(name = "studentFaculty")
    private String studentFaculty;
    /**
     * 专业
     */
    @Column(name = "studentMajor")
    private String studentMajor;
    /**
     * 研究方向
     */
    @Column(name = "studentDirection")
    private String studentDirection;
    /**
     * 年级
     */
    @Column(name = "studentGrade")
    private String studentGrade;
    /**
     * 年龄
     */
    @Column(name = "studentAge")
    private Integer studentAge;
    /**
     * 电话
     */
    @Column(name = "studentPhone")
    private String studentPhone;
    /**
     * 学号
     */
    @Column(name = "studentNumber")
    private String studentNumber;
    /**
     * 逻辑删除标记，1正常（默认），0屏蔽
     */
    @Column(name = "flag")
    private Integer flag;

    public PaperStudent() {
    }

    public PaperStudent(PaperUser paperUser, String studentName, String studentSex, String studentFaculty,
                        String studentMajor, String studentPhone, String studentNumber) {
        this.paperUser = paperUser;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentFaculty = studentFaculty;
        this.studentMajor = studentMajor;
        this.studentPhone = studentPhone;
        this.studentNumber = studentNumber;
    }

    public PaperStudent(String studentNumber, String studentName, String studentSex, String studentGrade,
                        String studentFaculty, String studentMajor, String studentDirection) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentGrade = studentGrade;
        this.studentFaculty = studentFaculty;
        this.studentMajor = studentMajor;
        this.studentDirection = studentDirection;
    }

    public PaperStudent(Integer studentId, String studentName, String studentSex, String studentFaculty,
                        String studentMajor, String studentDirection, String studentGrade, Integer studentAge, String studentPhone,
                        String studentNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentFaculty = studentFaculty;
        this.studentMajor = studentMajor;
        this.studentDirection = studentDirection;
        this.studentGrade = studentGrade;
        this.studentAge = studentAge;
        this.studentPhone = studentPhone;
        this.studentNumber = studentNumber;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public PaperUser getPaperUser() {
        return this.paperUser;
    }

    public void setPaperUser(PaperUser paperUser) {
        this.paperUser = paperUser;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return this.studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentFaculty() {
        return this.studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }

    public String getStudentMajor() {
        return this.studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentDirection() {
        return this.studentDirection;
    }

    public void setStudentDirection(String studentDirection) {
        this.studentDirection = studentDirection;
    }

    public String getStudentGrade() {
        return this.studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public Integer getStudentAge() {
        return this.studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentPhone() {
        return this.studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}