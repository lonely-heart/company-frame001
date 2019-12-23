package com.xh.lesson.service;

import com.xh.lesson.vo.req.UserRoleOperationReqVO;

import java.util.List;

/**
 * @ClassName: UserRoleService
 */
public interface UserRoleService {

    int removeByRoleId(String roleId);

    List<String> getRoleIdsByUserId(String userId);


    void addUserRoleInfo(UserRoleOperationReqVO vo);

    int removeByUserId(String userId);


    List<String> getUserIdsByRoleIds(List<String> roleIds);

}
