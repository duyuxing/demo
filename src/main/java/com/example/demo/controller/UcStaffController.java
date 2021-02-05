package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.UcStaff;
import com.example.demo.mapper.UcStaffMapper;
import com.example.demo.service.UcStaffService;
import com.example.demo.vo.ucstaffvo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UcStaffController {

    @Autowired
    UcStaffService ucStaffService;

    @Autowired
    UcStaffMapper ucStaffMapper;

    /*
     * @Author du.yx
     * @Description 单表
     * @Date 2020/12/21 14:05
     **/
    @PostMapping("/selectList")
    public List<UcStaff> selectList() {
        return ucStaffService.selectList();
    }

    /*
     * @Author du.yx
     * @Description 联表一对一   返回值 Map 或 实体类
     * @Date 2020/12/21 14:23
     **/
    @PostMapping("/getStaffAccount")
    public List<ucstaffvo> getStaffAccount() {
        List<ucstaffvo> ucstaffvoList = ucStaffService.getStaffAccount();
        System.out.println(ucstaffvoList.get(0).getStaffName() + "===================" + ucstaffvoList.get(0).getAccountCode());
        return ucStaffService.getStaffAccount();
    }

    /*
     * @Author du.yx
     * @Description  多条件查询
     * @Date 2020/12/21 16:02
     **/
    @PostMapping("/getUcStaffByStaffCode")
    public List<UcStaff> getUcStaffByStaffCode(
            @RequestParam(value = "staffName", required = false) String staffName,
            HttpServletRequest request) {
        //System.out.println("===============" + staffName);
        //String staffName = request.getParameter("staffname");
        return ucStaffService.getUcStaffByStaffCode(staffName);
    }

    /*
     * @Author du.yx
     * @Description  多参数 查询
     * @Date 2020/12/21 16:34
     **/
    @PostMapping("/getUcStaffMoreParams")
    public List<UcStaff> getUcStaffMoreParams(String staffName, Integer sex) {
        return ucStaffService.getUcStaffMoreParams(staffName, sex);
    }

    /*
     * @Author du.yx
     * @Description  map 传参
     * @Date 2020/12/21 16:40
     **/

    @PostMapping("/getUcStaffByMap")
    public List<UcStaff> getUcStaffByMap(@RequestBody Map map) {
        System.out.println("======" + map.toString());
        return ucStaffService.getUcStaffByMap(map);
    }

    /*
     * @Author du.yx
     * @Description  In 语法
     * @Date 2020/12/22 8:56
     **/
    @PostMapping("/getSubNode")
    public List<UcStaff> getSubNode() {
        List<String> list = new ArrayList<>();
        list.add("杨林");
        list.add("王宏");
        return ucStaffService.queryParams(list.toArray());
    }

    /*
     * @Author du.yx
     * @Description  分页
     * @Date 2020/12/22 9:11
     **/
    @PostMapping("/findByPaging")
    public JSONObject findByPaging(Integer age,Integer pageNum, Integer pageSize){
        PageHelper.startPage(1,2);
        Map param = new HashMap();
        param.put("age",age);
        Page<UcStaff> data = ucStaffMapper.findByPaging(param);
        JSONObject result = new JSONObject();
        result.put("list",data);
        result.put("pages",data.getPages());
        result.put("total",data.getTotal());
        return result;
    }

    /*
     * @Author du.yx
     * @Description
     * @Date 2020/12/22 13:39
     **/
    @PostMapping("/findAll")
    public List<UcStaff> findAll() {
        return ucStaffService.findAll("10025414");
    }
}
