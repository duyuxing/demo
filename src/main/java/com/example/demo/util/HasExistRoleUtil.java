package com.example.demo.util;

import com.example.demo.entity.SysRole;
import com.example.demo.entity.SysRoleAccount;

import java.util.List;
import java.util.Set;

/*
 * 判断是否存在某一角色
 * @author yx_du
 * @date  2021/1/27 14:13
 */
public class HasExistRoleUtil {
    public boolean isExistSuperAdmin(Set<String> roleList, String roleKey) {
        boolean flag = false;
        if (roleList != null && roleList.size() > 0 && roleKey != null) {
            for (String str: roleList) {
                if (str.equals(roleKey)) {
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }
}
