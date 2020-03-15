package com.macro.mall.tiny.service.impl;


import com.macro.mall.tiny.mbg.mapper.UmsRoleMapper;
import com.macro.mall.tiny.mbg.model.UmsRole;
import com.macro.mall.tiny.mbg.model.UmsRoleExample;
import com.macro.mall.tiny.service.UmsRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * UmsRoleService实现类
 * Created by macro on 2019/4/19.
 */
@Service
public class UmsRoleServiceImpl implements UmsRoleService {
    @Resource
    private UmsRoleMapper umsRoleMapper;

    @Override
    public List<UmsRole> listAllBrand() {
        return umsRoleMapper.selectByExample(new UmsRoleExample());
    }
}
