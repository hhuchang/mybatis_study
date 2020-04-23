package com.c2.interceptor;


import org.apache.ibatis.executor.Executor;

import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;
@Intercepts({@Signature(            type= Executor.class,
        method="query",
        args={MappedStatement.class,Object.class, RowBounds.class, ResultHandler.class})})
public class SpliteDataSourceInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //耗时
        long start=System.currentTimeMillis();
        Object proceedReslut=invocation.proceed();
        long end=System.currentTimeMillis();
        System.out.println("<====sql 耗时："+(end-start));
        return proceedReslut;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
