package com.xh.lesson.service;

import com.xh.lesson.vo.resp.HomeRespVO;

/**
 * @ClassName: HomeService
 */
public interface HomeService {

    HomeRespVO getHomeInfo(String userId);
}
