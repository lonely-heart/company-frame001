package com.xh.lesson.service;

import com.xh.lesson.entity.SysPermission;
import com.xh.lesson.vo.req.PermissionAddReqVO;
import com.xh.lesson.vo.req.PermissionPageReqVO;
import com.xh.lesson.vo.req.PermissionUpdateReqVO;
import com.xh.lesson.vo.resp.PageVO;
import com.xh.lesson.vo.resp.PermissionRespNode;

import java.util.List;
import java.util.Set;

/**
 * @ClassName: PermissionService
 */
public interface PermissionService {

    List<SysPermission> getPermission(String userId);

    SysPermission addPermission(PermissionAddReqVO vo);

    SysPermission detailInfo(String permissionId);

    void updatePermission(PermissionUpdateReqVO vo);

    void deleted(String permissionId);

    PageVO<SysPermission> pageInfo(PermissionPageReqVO vo);

    List<SysPermission> selectAll();

    Set<String> getPermissionsByUserId(String userId);

    List<PermissionRespNode> permissionTreeList(String userId);

    List<PermissionRespNode> selectAllByTree();

    List<PermissionRespNode> selectAllMenuByTree(String permissionId);

}
