package com.example.demo.service;


import com.example.demo.entity.SysMenu;
import com.example.demo.entity.UcStaff;
import com.example.demo.entity.vo.RouterVo;
import com.example.demo.vo.ucstaffvo;

import java.util.List;
import java.util.Map;

public interface SysMenuService {

    public List<SysMenu> queryMenuListByAccountCode(String accountCode);

    public List<RouterVo> buildMenus(List<SysMenu> menus);
}
