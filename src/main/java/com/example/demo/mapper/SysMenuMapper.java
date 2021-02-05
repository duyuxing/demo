package com.example.demo.mapper;

import com.example.demo.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface SysMenuMapper {

    List<SysMenu> queryMenuListByAccountCode(String accountCode);

    @Select("select DISTINCT * from sys_menu")
    List<SysMenu> queryMenuAll();

}
