package com.c2.reflect;

import org.apache.ibatis.binding.MapperRegistry;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.io.ClassLoaderWrapper;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.io.VFS;
import org.apache.ibatis.logging.jdbc.BaseJdbcLogger;
import org.apache.ibatis.logging.jdk14.Jdk14LoggingImpl;
import org.apache.ibatis.reflection.MetaClass;
import org.apache.ibatis.reflection.TypeParameterResolver;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeAliasRegistry;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;

import java.lang.reflect.Field;

import java.lang.reflect.Proxy;
import java.lang.reflect.Type;

public class Test {
    //ParameterizedType clazz=
    public static void main(String[] args) throws NoSuchFieldException {
        Class clazz=A.class;
        Field fieldName=clazz.getDeclaredField("appname");
        Type type = TypeParameterResolver.resolveFieldType(fieldName, clazz);
        System.out.println(type);


        //clazz.getDeclaredField();
        ObjectFactory objectFactory;

        MetaClass metaClass;

        ObjectWrapper wrapper;
        ObjectWrapperFactory factory;
        //JdbcType.VARCHAR.TYPE_CODE;
        TypeHandler handler;
        TypeHandlerRegistry registry;
        TypeAliasRegistry aliasRegistry;
        Jdk14LoggingImpl logging;
        Proxy proxy;
        BaseJdbcLogger logger;
        ClassLoaderWrapper wrapper1;
        ResolverUtil util;
        VFS vfs;
        DataSourceFactory factory1;
        Transaction transaction;
        TransactionFactory transactionFactory;

        MapperRegistry mapperRegistry;




    }

}
