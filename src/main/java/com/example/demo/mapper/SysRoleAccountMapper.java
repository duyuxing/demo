package com.example.demo.mapper;

import com.example.demo.entity.SysRole;
import com.example.demo.entity.SysRoleAccount;
import com.example.demo.entity.SysRoleAccountRegion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface SysRoleAccountMapper {

    @Select("select * from sys_role_account_region ar where 1=1  and ar.account_code = #{accountCode} and ar.role_id = #{roleId}")
    List<SysRoleAccountRegion> queryRangeByAccountAndRoleId(String accountCode, Integer roleId);
}
