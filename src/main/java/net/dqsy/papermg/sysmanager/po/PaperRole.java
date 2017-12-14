package net.dqsy.papermg.sysmanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * Description: 角色  
 * </p>
 * <p>
 * Company: net.dqsy.web
 * </p>
 * 创建时间：2015年12月22日 下午3:26:01
 *
 * @author King-Bao
 * @version 1.0
 */
@Entity
@Table(name = "paper_role")
public class PaperRole implements Serializable {

    /**
     * 角色ID
     */
    @Id
    @Column(name = "RoleId")
    private Integer roleId;
    /**
     * 角色名称
     */
    @Column(name = "RoleName")
    private String roleName;
    /**
     * 角色描述
     */
    @Column(name = "description")
    private String description;
    /**
     * 逻辑删除标记，1正常（默认），0屏蔽
     */
    @Column(name = "flag")
    private Integer flag;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "paperRole")
    private Set<PaperUserRole> paperUserRoles = new HashSet<>(0);

    //@OneToMany(mappedBy = "paperRole")
    @OneToMany
    @JoinColumn(name = "role_id")
    private Set<PaperRolePermission> paperRolePermissions = new HashSet<>(0);

    public PaperRole() {
    }

    public PaperRole(String roleName, String description, Integer flag) {
        this.roleName = roleName;
        this.description = description;
        this.flag = flag;
    }

    public PaperRole(Integer roleId, String roleName, String description) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.description = description;
    }

    public PaperRole(String roleName, String description, Integer flag, Set paperUserRoles, Set paperRolePermissions) {
        this.roleName = roleName;
        this.description = description;
        this.flag = flag;
        this.paperUserRoles = paperUserRoles;
        this.paperRolePermissions = paperRolePermissions;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public Set getPaperUserRoles() {
        return this.paperUserRoles;
    }

    public void setPaperUserRoles(Set paperUserRoles) {
        this.paperUserRoles = paperUserRoles;
    }

    public Set getPaperRolePermissions() {
        return this.paperRolePermissions;
    }

    public void setPaperRolePermissions(Set paperRolePermissions) {
        this.paperRolePermissions = paperRolePermissions;
    }
}