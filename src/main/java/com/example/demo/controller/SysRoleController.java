package com.example.demo.controller;


import com.example.demo.entity.LoginUser;
import com.example.demo.service.SysRoleService;
import com.example.demo.util.R;
import com.example.demo.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("/role")
public class SysRoleController {

    @Autowired
    SysRoleService roleService;

    /*
     * 获取登录人的角色和权限范围
     * @author yx_du
     * @date  2021/1/27 13:25
     */
    @RequestMapping(value = "/queryLoginRoleByAccountCode")
    public R<LoginUser> queryLoginRoleByAccountCode(@RequestParam("accountCode") String accountCode){
        Set<String> permsSet = roleService.queryRoleByAccountCode(accountCode);
        if(permsSet != null && permsSet.size()>0){
            for(String ra:permsSet){
                if (StringUtils.isEmpty(ra)){
                    permsSet.addAll(Arrays.asList(ra.trim().split(",")));
                }
            }
        }
        LoginUser sysUserVo = new LoginUser();
        sysUserVo.setRoles(permsSet);
        return R.ok(sysUserVo);
    }
}
