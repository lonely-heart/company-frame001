package com.xh.lesson.service;

import com.xh.lesson.vo.req.RolePermissionOperationReqVO;

import java.util.List;

/**
 * @ClassName: RolePermissionService
 */
public interface RolePermissionService {

    int removeByRoleId(String roleId);

    List<String> getPermissionIdsByRoles(List<String> roleIds);

    void addRolePermission(RolePermissionOperationReqVO vo);

    int removeByPermissionId(String permissionId);

    List<String> getRoleIds(String permissionId);
    List<String> getPermissionIdsByRoleId(String roleId);

}
