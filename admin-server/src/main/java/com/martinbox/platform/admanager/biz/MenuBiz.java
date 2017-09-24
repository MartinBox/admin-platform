package com.martinbox.platform.admanager.biz;

import com.martinbox.platform.admanager.constant.CommonConstant;
import com.martinbox.platform.admanager.entity.Menu;
import com.martinbox.platform.admanager.mapper.MenuMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-12 8:48
 */
@Service
public class MenuBiz extends BaseBiz<MenuMapper, Menu> {
    @Override
    public void insertSelective(Menu entity) {
        if (CommonConstant.ROOT == entity.getParentId()) {
            entity.setPath("/" + entity.getCode());
        } else {
            Menu parent = this.selectById(entity.getParentId());
            entity.setPath(parent.getPath() + "/" + entity.getCode());
        }
        super.insertSelective(entity);
    }

    @Override
    public void updateById(Menu entity) {
        if (CommonConstant.ROOT == entity.getParentId()) {
            entity.setPath("/" + entity.getCode());
        } else {
            Menu parent = this.selectById(entity.getParentId());
            entity.setPath(parent.getPath() + "/" + entity.getCode());
        }
        super.updateById(entity);
    }

    /**
     * 获取用户可以访问的菜单
     *
     * @param id
     * @return
     */
    public List<Menu> getUserAuthorityMenuByUserId(int id) {
        return mapper.selectAuthorityMenuByUserId(id);
    }

    /**
     * 根据用户获取可以访问的系统
     *
     * @param id
     * @return
     */
    public List<Menu> getUserAuthoritySystemByUserId(int id) {
        return mapper.selectAuthoritySystemByUserId(id);
    }
}
