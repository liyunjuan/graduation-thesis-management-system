package net.dqsy.papermg.sysmanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *  
 * <p>
 * Description: 用户
 * </p>
 * <p>
 * Company: net.dqsy.web
 * </p>
 * 创建时间：2015年12月22日 下午3:35:59
 *
 * @author King-Bao
 * @version 1.0
 */
@Entity
@Table(name = "paper_user")
public class PaperUser implements Serializable {
    @Id
    @Column(name = "UserId")
    private Integer userId;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "PassWord")
    private String passWord;

    @Column(name = "identity")
    private String identity;

    @Column(name = "flag")
    private Integer flag;


    //映射单向 1-n 的关联关系
    //使用 @OneToMany 来映射 1-n 的关联关系
    //使用 @JoinColumn 来映射外键列的名称
    //可以使用 @OneToMany 的 fetch 属性来修改默认的加载策略
    //可以通过 @OneToMany 的 cascade 属性来修改默认的删除策略
    //注意: 若在 1 的一端的 @OneToMany 中使用 mappedBy 属性, 则 @OneToMany 端就不能再使用 @JoinColumn 属性了
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "paperUser")
    private Set<PaperUserRole> paperUserRoles = new HashSet<>(0);

    public PaperUser() {
    }

    public PaperUser(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public PaperUser(String userName, String passWord, String identity) {
        this.userName = userName;
        this.passWord = passWord;
        this.identity = identity;
    }

    public PaperUser(String userName, String passWord, String identity, Integer flag) {
        this.userName = userName;
        this.passWord = passWord;
        this.identity = identity;
        this.flag = flag;
    }

    public PaperUser(Integer userId, String userName, String passWord, String identity, Integer flag) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
        this.identity = identity;
        this.flag = flag;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getIdentity() {
        return this.identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Set getPaperUserRoles() {
        return this.paperUserRoles;
    }

    public void setPaperUserRoles(Set paperUserRoles) {
        this.paperUserRoles = paperUserRoles;
    }
}