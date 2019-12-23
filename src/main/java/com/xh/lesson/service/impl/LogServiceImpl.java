package com.xh.lesson.service.impl;

import com.github.pagehelper.PageHelper;
import com.xh.lesson.entity.SysLog;
import com.xh.lesson.mapper.SysLogMapper;
import com.xh.lesson.service.LogService;
import com.xh.lesson.utils.PageUtils;
import com.xh.lesson.vo.req.SysLogPageReqVO;
import com.xh.lesson.vo.resp.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: LogServiceImpl
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public PageVO<SysLog> pageInfo(SysLogPageReqVO vo) {

        PageHelper.startPage(vo.getPageNum(),vo.getPageSize());
        List<SysLog> sysLogs = sysLogMapper.selectAll(vo);
        return PageUtils.getPageVO(sysLogs);
    }

    @Override
    public void deleted(List<String> logIds) {
        sysLogMapper.batchDeletedLog(logIds);
    }
}
