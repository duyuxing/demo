package com.example.demo.service.Impl;


import com.example.demo.entity.SysRole;
import com.example.demo.entity.vo.SysRoleAccountRegionVo;
import com.example.demo.mapper.SysRoleMapper;
import com.example.demo.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    SysRoleMapper roleMapper;


    @Override
    public Set<String> queryRoleByAccountCode(String accountCode) {
        return roleMapper.queryRoleByAccountCode(accountCode);
    }

    @Override
    public List<SysRoleAccountRegionVo> queryRoleAllByAccountCode(String accountCode) {
        return roleMapper.queryRoleAllByAccountCode(accountCode);
    }
}
