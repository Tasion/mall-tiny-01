package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.mbg.model.UmsRole;
import com.macro.mall.tiny.service.PmsBrandService;
import com.macro.mall.tiny.service.UmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 商品角色管理Controller
 * Created by macro on 2019/4/19.
 */
@Api(tags = "umsRoleController", description = "商品角色管理")
@Controller
@RequestMapping("/role")
public class UmsRoleController {
    @Autowired
    private UmsRoleService umsRoleService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsRoleController.class);

    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsRole>> getBrandList() {
        return CommonResult.success(umsRoleService.listAllBrand());
    }

}
