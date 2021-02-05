package com.example.demo.controller;

import com.example.demo.entity.SysMenu;
import com.example.demo.service.SysMenuService;
import com.example.demo.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class SysMenuController {

    @Autowired
    SysMenuService menuService;

    /*
     * 登录获取菜单路由
     * @author yx_du
     * @date  2021/1/27 9:26
     */
    @GetMapping("/getRouters/{accountCode}")
    public AjaxResult getRouters(@PathVariable String accountCode,HttpServletRequest request){
        List<SysMenu> menus = menuService.queryMenuListByAccountCode(accountCode);
        return AjaxResult.success(menuService.buildMenus(menus));
    }
}
