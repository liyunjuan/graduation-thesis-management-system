package net.dqsy.papermg.sysmanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *  
 * <p>
 * Description: 教师  
 * </p>
 * <p>
 * Company: net.dqsy.web
 * </p>
 * 创建时间：2015年12月22日 下午4:14:31
 *
 * @author King-Bao
 * @version 1.0
 */
@Entity
@Table(name = "paper_teacher")
public class PaperTeacher implements Serializable {
    /**
     * 教师ID
     */
    @Id
    @Column(name = "teacherId")
    private Integer teacherId;
    /**
     * 教师关联到用户
     */
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false, unique = true)
    private PaperUser paperUser;
    /**
     * 姓名
     */
    @Column(name = "teacherName")
    private String teacherName;
    /**
     * 性别
     */
    @Column(name = "teacherSex")
    private String teacherSex;
    /**
     * 年龄
     */
    @Column(name = "teacherAge")
    private Integer teacherAge;
    /**
     * 单位
     */
    @Column(name = "teacherUnits")
    private String teacherUnits;
    /**
     * 专业
     */
    @Column(name = "teacherMajor")
    private String teacherMajor;
    /**
     * 研究方向
     */
    @Column(name = "teacherDirection")
    private String teacherDirection;
    /**
     * 学历
     */
    @Column(name = "teacherEducation")
    private String teacherEducation;
    /**
     * 职称
     */
    @Column(name = "teacherJobTitle")
    private String teacherJobTitle;
    /**
     * 电话
     */
    @Column(name = "teacherPhone")
    private String teacherPhone;
    /**
     * 工号
     */
    @Column(name = "teacherNumber")
    private String teacherNumber;
    /**
     * 逻辑删除标记，1正常（默认），0屏蔽
     */
    @Column(name = "flag")
    private Integer flag;

    public PaperTeacher() {
    }

    public PaperTeacher(Integer teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    public PaperTeacher(PaperUser paperUser, String teacherNumber, String teacherName, String teacherSex,
                        Integer teacherAge, String teacherPhone, String teacherUnits, String teacherMajor, String teacherEducation,
                        String teacherJobTitle, String teacherDirection) {
        this.paperUser = paperUser;
        this.teacherName = teacherName;
        this.teacherSex = teacherSex;
        this.teacherAge = teacherAge;
        this.teacherUnits = teacherUnits;
        this.teacherMajor = teacherMajor;
        this.teacherDirection = teacherDirection;
        this.teacherEducation = teacherEducation;
        this.teacherJobTitle = teacherJobTitle;
        this.teacherPhone = teacherPhone;
        this.teacherNumber = teacherNumber;
    }

    public PaperTeacher(String teacherNumber, String teacherName, String teacherSex, Integer teacherAge,
                        String teacherPhone, String teacherUnits, String teacherMajor, String teacherEducation,
                        String teacherJobTitle, String teacherDirection) {
        this.teacherName = teacherName;
        this.teacherSex = teacherSex;
        this.teacherAge = teacherAge;
        this.teacherUnits = teacherUnits;
        this.teacherMajor = teacherMajor;
        this.teacherDirection = teacherDirection;
        this.teacherEducation = teacherEducation;
        this.teacherJobTitle = teacherJobTitle;
        this.teacherPhone = teacherPhone;
        this.teacherNumber = teacherNumber;
    }

    public PaperTeacher(Integer teacherId, String teacherName, String teacherSex, Integer teacherAge,
                        String teacherUnits, String teacherMajor, String teacherDirection, String teacherEducation,
                        String teacherJobTitle, String teacherPhone, String teacherNumber) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherSex = teacherSex;
        this.teacherAge = teacherAge;
        this.teacherUnits = teacherUnits;
        this.teacherMajor = teacherMajor;
        this.teacherDirection = teacherDirection;
        this.teacherEducation = teacherEducation;
        this.teacherJobTitle = teacherJobTitle;
        this.teacherPhone = teacherPhone;
        this.teacherNumber = teacherNumber;
    }

    public Integer getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public PaperUser getPaperUser() {
        return this.paperUser;
    }

    public void setPaperUser(PaperUser paperUser) {
        this.paperUser = paperUser;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSex() {
        return this.teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Integer getTeacherAge() {
        return this.teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherUnits() {
        return this.teacherUnits;
    }

    public void setTeacherUnits(String teacherUnits) {
        this.teacherUnits = teacherUnits;
    }

    public String getTeacherMajor() {
        return this.teacherMajor;
    }

    public void setTeacherMajor(String teacherMajor) {
        this.teacherMajor = teacherMajor;
    }

    public String getTeacherDirection() {
        return this.teacherDirection;
    }

    public void setTeacherDirection(String teacherDirection) {
        this.teacherDirection = teacherDirection;
    }

    public String getTeacherEducation() {
        return this.teacherEducation;
    }

    public void setTeacherEducation(String teacherEducation) {
        this.teacherEducation = teacherEducation;
    }

    public String getTeacherJobTitle() {
        return this.teacherJobTitle;
    }

    public void setTeacherJobTitle(String teacherJobTitle) {
        this.teacherJobTitle = teacherJobTitle;
    }

    public String getTeacherPhone() {
        return this.teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public String getTeacherNumber() {
        return this.teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}