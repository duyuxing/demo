package com.example.demo.service.Impl;

import com.example.demo.entity.SysMenu;
import com.example.demo.entity.SysRole;
import com.example.demo.entity.SysRoleAccount;
import com.example.demo.entity.vo.RouterVo;
import com.example.demo.mapper.SysMenuMapper;
import com.example.demo.service.SysMenuService;
import com.example.demo.service.SysRoleAccountService;
import com.example.demo.service.SysRoleService;
import com.example.demo.util.HasExistRoleUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    SysMenuMapper menuMapper;

    @Autowired
    SysRoleService sysRoleService;


    @Override
    public List<SysMenu> queryMenuListByAccountCode(String accountCode){
        List<SysMenu> menuList = new ArrayList<>();
        try{
            if(StringUtils.isNotEmpty(accountCode)){
                //判断是否存在 超级管理员
                Set<String> roleList = sysRoleService.queryRoleByAccountCode(accountCode);
                HasExistRoleUtil hasExistRoleUtil = new HasExistRoleUtil();
                if(hasExistRoleUtil.isExistSuperAdmin(roleList,"admin")){
                    //超级管理员 返回全部菜单
                    menuList = menuMapper.queryMenuAll();
                }else{
                    menuList =  menuMapper.queryMenuListByAccountCode(accountCode);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return  menuList;
    }

    public List<RouterVo> buildMenus(List<SysMenu> menus){
        return null;
    }

}
