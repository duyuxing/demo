package com.example.demo.controller;


import com.example.demo.entity.LoginUser;
import com.example.demo.entity.SysRoleAccount;
import com.example.demo.entity.SysRoleAccountRegion;
import com.example.demo.entity.vo.SysRoleAccountRegionVo;
import com.example.demo.service.SysRoleAccountService;
import com.example.demo.service.SysRoleService;
import com.example.demo.util.R;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("/roleAccount")
public class SysRoleAccountController {

    private static final Logger log = LogManager.getLogger(SysRoleAccountController.class);

    @Autowired
    SysRoleAccountService roleAccountService;

    @Autowired
    SysRoleService roleService;

    /*
     * 根据账号获取鉴权范围
     * @author yx_du
     * @date  2021/1/27 13:45
     */
    @RequestMapping(value = "/queryRoleRangeByAccountCode")
    public List<Map> queryRoleAccountByAccountCode(@RequestParam("accountCode") String accountCode){
        List<Map>  resultList = new ArrayList<>();
        //获取所有角色信息
        List<SysRoleAccountRegionVo> regionVos =  roleService.queryRoleAllByAccountCode(accountCode);
        if(regionVos != null && regionVos.size()>0){
            for(SysRoleAccountRegionVo s:regionVos){
                Map<String,Object> map = new HashMap<>();
                map.put("roleId",s.getRoleId()); //角色id
                map.put("roleName",s.getRoleName()); //角色名称
                //获取角色对应的权限范围
                List<SysRoleAccountRegion> regionList = roleAccountService.queryRangeByAccountAndRoleId(accountCode,s.getRoleId());
                if(regionList != null && regionList.size()>0){
                    map.put("regionList",regionList); //角色名称
                    resultList.add(map);
                }
            }
        }
        return resultList;
    }
}
