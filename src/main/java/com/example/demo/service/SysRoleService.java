package com.example.demo.service;


import com.example.demo.entity.SysMenu;
import com.example.demo.entity.SysRole;
import com.example.demo.entity.vo.RouterVo;
import com.example.demo.entity.vo.SysRoleAccountRegionVo;

import java.util.List;
import java.util.Set;

public interface SysRoleService {

    /*
     * 通过账号获取所有角色的role_key
     * @author yx_du
     * @date  2021/1/27 16:35
     */
    Set<String> queryRoleByAccountCode(String accountCode);

    /*
     * 通过账号获取所有角色信息
     * @author yx_du
     * @date  2021/1/27 16:36
     */
    List<SysRoleAccountRegionVo> queryRoleAllByAccountCode(String accountCode);
}
