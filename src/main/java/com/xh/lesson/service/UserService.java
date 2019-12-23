package com.xh.lesson.service;

import com.xh.lesson.entity.SysUser;
import com.xh.lesson.vo.req.*;
import com.xh.lesson.vo.resp.LoginRespVO;
import com.xh.lesson.vo.resp.PageVO;
import com.xh.lesson.vo.resp.UserOwnRoleRespVO;

import java.util.List;

/**
 * @ClassName: UserService
 */
public interface UserService {

    String register(RegisterReqVO vo);

    LoginRespVO login(LoginReqVO vo);


    String refreshToken(String refreshToken,String accessToken);

    void updateUserInfo(UserUpdateReqVO vo,String operationId);


    PageVO<SysUser> pageInfo(UserPageReqVO vo);

    SysUser detailInfo(String userId);

    PageVO<SysUser> selectUserInfoByDeptIds(int pageNum, int pageSize,List<String> deptIds);

    void addUser(UserAddReqVO vo);

    void logout(String accessToken,String refreshToken);

    void updatePwd(UpdatePasswordReqVO vo,String userId,String accessToken, String refreshToken);

    List<SysUser> getUserListByDeptId(String deptId);

    List<SysUser> getUserListByDeptIds(List<String> deptIds);

    void deletedUsers(List<String> userIds,String operationId);

    UserOwnRoleRespVO getUserOwnRole(String userId);

    void setUserOwnRole(String userId,List<String> roleIds);
}
