package net.dqsy.papermg.sysmanager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "login_view")
public class LoginVO implements Serializable {

    @Id
    @Column(name = "roleid")
    private Integer id;

    @Column(name = "userId")
    private Integer userId;
    @Column(name = "Username")
    private String Username;
    @Column(name = "password")
    private String password;
    @Column(name = "identity")
    private String identity;
    @Column(name = "flag")
    private Integer flag;
    @Column(name = "studentid")
    private Integer studentid;
    @Column(name = "studentname")
    private String studentname;
    @Column(name = "studentsex")
    private String studentsex;
    @Column(name = "studentAge")
    private Integer studentAge;
    @Column(name = "studentPhone")
    private String studentPhone;
    @Column(name = "studentFaculty")
    private String studentFaculty;
    @Column(name = "studentMajor")
    private String studentMajor;
    @Column(name = "studentDirection")
    private String studentDirection;
    @Column(name = "studentGrade")
    private String studentGrade;
    @Column(name = "studentNumber")
    private String studentNumber;
    @Column(name = "teacherid")
    private Integer teacherid;
    @Column(name = "teacherName")
    private String teacherName;

    @Column(name = "teacherAge")
    private Integer teacherAge;
    @Column(name = "teacherPhone")
    private String teacherPhone;
    @Column(name = "teacherSex")
    private String teacherSex;
    @Column(name = "teacherUnits")
    private String teacherUnits;
    @Column(name = "teacherDirection")
    private String teacherDirection;
    @Column(name = "teacherEducation")
    private String teacherEducation;
    @Column(name = "teacherJobTitle")
    private String teacherJobTitle;
    @Column(name = "teacherNumber")
    private String teacherNumber;
    @Column(name = "teacherMajor")
    private String teacherMajor;
    @Column(name = "roleid", insertable = false, updatable = false)
    private Integer roleid;
    @Column(name = "RoleName")
    private String RoleName;
    @Column(name = "description")
    private String description;
    @Column(name = "permission")
    private String permission;
    @Column(name = "pdescription")
    private String pdescription;


    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentity() {
        return this.identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getStudentid() {
        return this.studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return this.studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentsex() {
        return this.studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex;
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

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getTeacherid() {
        return this.teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
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

    public String getTeacherUnits() {
        return this.teacherUnits;
    }

    public void setTeacherUnits(String teacherUnits) {
        this.teacherUnits = teacherUnits;
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

    public String getTeacherNumber() {
        return this.teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getTeacherMajor() {
        return this.teacherMajor;
    }

    public void setTeacherMajor(String teacherMajor) {
        this.teacherMajor = teacherMajor;
    }

    public Integer getRoleid() {
        return this.roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRoleName() {
        return this.RoleName;
    }

    public void setRoleName(String roleName) {
        this.RoleName = roleName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getPdescription() {
        return this.pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription;
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

    public Integer getTeacherAge() {
        return this.teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherPhone() {
        return this.teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }
}