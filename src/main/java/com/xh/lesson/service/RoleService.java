package com.xh.lesson.service;

import com.xh.lesson.entity.SysRole;
import com.xh.lesson.vo.req.RoleAddReqVO;
import com.xh.lesson.vo.req.RolePageReqVO;
import com.xh.lesson.vo.req.RoleUpdateReqVO;
import com.xh.lesson.vo.resp.PageVO;

import java.util.List;

/**
 * @ClassName: RoleService
 */
public interface RoleService {

    SysRole addRole(RoleAddReqVO vo);

    void updateRole(RoleUpdateReqVO vo,String accessToken);

    SysRole detailInfo(String id);

    void deletedRole(String id);

    PageVO<SysRole> pageInfo(RolePageReqVO vo);

    List<SysRole> getRoleInfoByUserId(String userId);

    List<String> getRoleNames(String userId);

    List<SysRole> selectAllRoles();
}
