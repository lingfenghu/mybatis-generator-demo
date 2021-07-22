package cn.hulingfeng.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Role implements Serializable {
    /**
     * 主键从1开始自增
     */
    private Integer roleId;

    /**
     * 角色编码不允许重复
     */
    private String roleCode;

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 角色类型1系统角色（不允许删除、并且不显示默认分配给超级管理员）2普通角色
     */
    private String roletypeSl;

    /**
     * 所属系统0通用1内管2客户3代理商
     */
    private String systemSl;

    /**
     * 排序值建议间隔5升序展现
     */
    private Integer sortno;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作者（包含创建者和修改者）
     */
    private String oprCode;

    /**
     * 操作日期（包含创建时间和修改时间）
     */
    private String oprdate;

    private static final long serialVersionUID = 1L;
}