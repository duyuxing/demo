package com.example.demo.mapper;

import com.example.demo.entity.SysRole;
import com.example.demo.entity.vo.SysRoleAccountRegionVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface SysRoleMapper {

    Set<String> queryRoleByAccountCode(String accountCode);

    List<SysRoleAccountRegionVo> queryRoleAllByAccountCode(String accountCode);
}
