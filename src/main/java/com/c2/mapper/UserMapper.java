package com.c2.mapper;

import com.c2.model.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public User selectUserDetail(String userId);
    @Select("select * from tf_f_user where user_id=#{USER_ID}")
    public List<Map<String,Object>> queryUser(Map<String,?> param);

    public static class UserSqlProvider{
        public String getQuerySql(){
            return "select * from ${databaseName} u where u.user_id=#{USER_ID}";
        }
    }
    @SelectProvider(type = UserSqlProvider.class,method = "getQuerySql")
    public List<Map<String,Object>> queryUser_2(Map<String,?> param);

    @SelectProvider(type = UserSqlProvider.class,method = "getQuerySql")
    public User queryUser_3(Map<String,?> param);



}
