package com.martinbox.platform.admanager.rpc;

import com.martinbox.platform.admanager.biz.GateLogBiz;
import com.martinbox.platform.admanager.entity.GateLog;
import com.martinbox.platform.admanager.log.LogInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-07-01 14:39
 */
@RequestMapping("api")
@Controller
public class LogService {
    @Autowired
    private GateLogBiz gateLogBiz;

    @RequestMapping(value = "/log/save", method = RequestMethod.POST)
    public
    @ResponseBody
    void saveLog(@RequestBody LogInfo info) {
        GateLog log = new GateLog();
        BeanUtils.copyProperties(info, log);
        gateLogBiz.insertSelective(log);
    }
}
