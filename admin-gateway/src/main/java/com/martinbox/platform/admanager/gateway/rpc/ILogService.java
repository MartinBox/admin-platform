package com.martinbox.platform.admanager.gateway.rpc;

import com.martinbox.platform.admanager.log.LogInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-07-01 15:16
 */
@FeignClient("admin-back")
public interface ILogService {
    @RequestMapping(value = "/api/log/save3", method = RequestMethod.POST)
    public void saveLog(LogInfo info);
}
