package net.dqsy.papermg.sysmanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *  
 * <p>
 * Description: 权限
 * </p>
 * <p>
 * Company: net.dqsy.web
 * </p>
 * 创建时间：2015年12月22日 下午3:10:34
 *
 * @author King-Bao
 * @version 1.0
 */
@Entity
@Table(name = "paper_permission")
public class PaperPermission implements Serializable {
    private static final long serialVersionUID = 2348399199824539313L;
    /**
     * 权限ID
     */
    @Id
    @Column(name = "id")
    private Integer id;
    /**
     * 网页链接
     */
    @Column(name = "permission")
    private String permission;
    /**
     * 权限描述
     */
    @Column(name = "description")
    private String description;
    /**
     * 逻辑删除标记，1正常（默认），0屏蔽
     */
    @Column(name = "flag")
    private Integer flag;
    /**
     * 状态标记，默认值999
     */
    @Column(name = "state")
    private Integer state;

    //@OneToMany(mappedBy = "paperPermission")
    @OneToMany
    @JoinColumn(name = "permission_id")
    private Set<PaperRolePermission> paperRolePermissions = new HashSet<PaperRolePermission>(0);

    public PaperPermission() {
    }

    public PaperPermission(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public PaperPermission(Integer id, String permission, String description) {
        this.id = id;
        this.permission = permission;
        this.description = description;
    }

    public PaperPermission(String permission, String description, Integer flag) {
        this.permission = permission;
        this.description = description;
        this.flag = flag;
    }

    public PaperPermission(String permission, String description, Integer flag, Set paperRolePermissions) {
        this.permission = permission;
        this.description = description;
        this.flag = flag;
        this.paperRolePermissions = paperRolePermissions;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Set getPaperRolePermissions() {
        return this.paperRolePermissions;
    }

    public void setPaperRolePermissions(Set paperRolePermissions) {
        this.paperRolePermissions = paperRolePermissions;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}