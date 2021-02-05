package com.example.demo.service.Impl;

import com.example.demo.entity.UcStaff;
import com.example.demo.mapper.UcStaffMapper;
import com.example.demo.service.UcStaffService;
import com.example.demo.vo.ucstaffvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UcStaffServiceImpl implements UcStaffService {

    @Autowired
    UcStaffMapper ucStaffMapper;

    @Override
    public List<UcStaff> selectList() {
        return ucStaffMapper.selectList();
    }

    @Override
    public List<ucstaffvo> getStaffAccount() {
        return ucStaffMapper.getStaffAccount();
    }

    @Override
    public List<UcStaff> getUcStaffByStaffCode(String staffName) {
        return ucStaffMapper.getUcStaffByStaffCode(staffName);
    }

    @Override
    public List<UcStaff> getUcStaffMoreParams(String staffName, Integer sex) {
        return ucStaffMapper.getUcStaffMoreParams(staffName,sex);
    }

    @Override
    public List<UcStaff> getUcStaffByMap(Map map) {
        Integer a = (Integer)map.get("sex");
        return ucStaffMapper.getUcStaffByMap(map);
    }

    @Override
    public List<UcStaff> queryParams(Object[] arr) {
        return ucStaffMapper.queryParams(arr);
    }

    @Override
    public List<UcStaff> findAll(String staffCode) {
        return ucStaffMapper.findAll(staffCode);
    }

}
