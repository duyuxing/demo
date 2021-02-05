package com.example.demo.mapper;

import com.example.demo.entity.User;
import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    /*
     * @Author du.yx
     * @Description  插入数据并返回主键
     * @Date 2020/12/22 14:19
     */
    @Insert("insert into user(user,name) " +
            "values (#{user},#{name})")
    //@SelectKey(statement="select last_insert_id()",keyProperty="id", resultType=int.class, before=true)
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int insertUser(User user) throws Exception;


    /*
     * @Author du.yx
     * @Description  在注解sql中，使用if语句   并且判断空字符串
     * @Date 2020/12/22 14:27
     */
    @Select({"<script>",
            "SELECT * FROM user",
            "WHERE 1=1",
            "<when test='name !=null and name !=&apos;&apos;'>",
            "AND name = #{name}",
            "</when>",
            "</script>"})
    List<User> findUserByName(String name);

    @Update("<script>" +
            "UPDATE user  " +
            "<set>" +
            "   <if test='user!=null and user!=&apos;&apos;'> user=#{user}, </if>" +
            "   <if test='name!=null and name!=&apos;&apos;'> name=#{name}, </if>" +
            "   <if test='tel!=null and tel!=&apos;&apos;'> tel=#{tel}, </if>" +
            "   <if test='addr!=null and addr!=&apos;&apos;'> addr=#{addr}, </if>" +
            "   <if test='duty!=null and duty!=&apos;&apos;'> duty=#{duty}, </if>" +
            "</set>" +
            " where id=#{id}" +
            "</script>")
    void updateUser(User user);


    @Delete("<script>"
            + "DELETE FROM user"
            + "<where>"
            + "<if test='id!=null and id!=&apos;&apos;'>"
            + "   and id=#{id}"
                    + "</if>"
                    + "</where>"
                    + "</script>"
    )
    void deleteUser(Integer id);

}
