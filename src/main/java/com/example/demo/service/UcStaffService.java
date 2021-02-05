package com.example.demo.service;


import com.example.demo.entity.UcStaff;
import com.example.demo.vo.ucstaffvo;

import java.util.List;
import java.util.Map;

public interface UcStaffService {

    public List<UcStaff> selectList();

    public List<ucstaffvo> getStaffAccount();

    public List<UcStaff> getUcStaffByStaffCode(String staffName);

    public List<UcStaff> getUcStaffMoreParams(String staffName,Integer sex);

    public List<UcStaff> getUcStaffByMap(Map map);

    public List<UcStaff> queryParams(Object[] arr);

    public List<UcStaff> findAll(String staffCode);
}
