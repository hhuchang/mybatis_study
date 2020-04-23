package com.c2.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyStringHandler implements TypeHandler<String> {

    public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {

        System.out.println("使用我的TypeHandler");
        ps.setString(i,parameter);
    }

    public String getResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println("使用我的TypeHandler,ResultSet列名获取字符串");
        return rs.getString(columnName);
    }

    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
        System.out.println("使用我的TypeHandler,ResultSet下标获取字符串");
        return rs.getString(columnIndex);
    }

    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
        System.out.println("使用我的TypeHandler,CallableStatement下标获取字符串");
        return cs.getString(columnIndex);
    }
}
