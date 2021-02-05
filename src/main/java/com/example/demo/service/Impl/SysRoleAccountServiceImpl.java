package com.example.demo.service.Impl;

import com.example.demo.entity.SysRoleAccountRegion;
import com.example.demo.mapper.SysRoleAccountMapper;
import com.example.demo.service.SysRoleAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SysRoleAccountServiceImpl implements SysRoleAccountService {

    @Autowired
    SysRoleAccountMapper roleAccountMapper;


    @Override
    public List<SysRoleAccountRegion> queryRangeByAccountAndRoleId(String accountCode, Integer roleId) {
        return roleAccountMapper.queryRangeByAccountAndRoleId(accountCode,roleId);
    }
}
