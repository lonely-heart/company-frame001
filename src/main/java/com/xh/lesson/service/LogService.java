package com.xh.lesson.service;

import com.xh.lesson.entity.SysLog;
import com.xh.lesson.vo.req.SysLogPageReqVO;
import com.xh.lesson.vo.resp.PageVO;

import java.util.List;

/**
 * @ClassName: LogService
 */
public interface LogService {

    PageVO<SysLog> pageInfo(SysLogPageReqVO vo);

    void deleted(List<String> logIds);
}
