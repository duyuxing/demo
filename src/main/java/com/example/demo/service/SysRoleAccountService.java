package com.example.demo.service;



import com.example.demo.entity.SysRoleAccount;
import com.example.demo.entity.SysRoleAccountRegion;

import java.util.List;
import java.util.Set;

public interface SysRoleAccountService {

    List<SysRoleAccountRegion> queryRangeByAccountAndRoleId(String accountCode,Integer roleId);
}
