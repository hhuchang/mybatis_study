package com.c2.plugins;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy {

    public static void main(String[] args) {
        class AshanInvocationHandler implements InvocationHandler{
            private Object target;

            public AshanInvocationHandler(Object target) {
                this.target = target;
            }

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before-------");
                Object ret=method.invoke(this.target,args);
                System.out.println("after---------");
                return ret;
            }
        }


        AshenService service=new AshenServiceImpl();
        AshanInvocationHandler handler=new AshanInvocationHandler(service);
        AshenService serviceProxy= (AshenService) Proxy.newProxyInstance(service.getClass().getClassLoader(),service.getClass().getInterfaces(),handler);
        serviceProxy.service("jdk dynamic proxy");


        //SqlSessionFactoryBean sqlSessionFactoryBean;















    }
}
