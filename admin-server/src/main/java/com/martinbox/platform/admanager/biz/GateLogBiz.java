package com.martinbox.platform.admanager.biz;

import com.martinbox.platform.admanager.entity.GateLog;
import com.martinbox.platform.admanager.mapper.GateLogMapper;
import com.martinbox.platform.admanager.biz.BaseBiz;
import com.martinbox.platform.admanager.entity.GateLog;
import com.martinbox.platform.admanager.mapper.GateLogMapper;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-07-01 14:36
 */
@Service
public class GateLogBiz extends BaseBiz<GateLogMapper,GateLog> {

    @Override
    public void insert(GateLog entity) {
        mapper.insert(entity);
    }

    @Override
    public void insertSelective(GateLog entity) {
        mapper.insertSelective(entity);
    }
}
