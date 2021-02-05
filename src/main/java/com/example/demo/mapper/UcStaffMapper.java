package com.example.demo.mapper;

import com.example.demo.entity.UcStaff;
import com.example.demo.vo.ucstaffvo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UcStaffMapper {

    public List<UcStaff> selectList();

    public List<ucstaffvo> getStaffAccount();

    public List<UcStaff> getUcStaffByStaffCode(String staffName);

    public List<UcStaff> getUcStaffMoreParams(@Param("staffName") String staffName,@Param("sex") Integer sex);

    public List<UcStaff> getUcStaffByMap(Map map);

    public List<UcStaff> queryParams(Object[] arr);

    public Page<UcStaff> findByPaging(Map param);

    @Select("select * from uc_staff where staff_code = #{staffCode} ")
    List<UcStaff> findAll(String staffCode);

}
