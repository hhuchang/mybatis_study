import org.apache.ibatis.binding.MapperRegistry;
import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.builder.xml.XMLIncludeTransformer;
import org.apache.ibatis.builder.xml.XMLStatementBuilder;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.ognl.OgnlContext;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;

public class study {

    MapperRegistry mapperRegistry;

    public static void main(String[] args) {


        Class<Long> l1=Long.TYPE;
        Class<Long> l2=long.class;
        Class<Long> l3=Long.class;

        int i1 = l1.hashCode();
        int i2 = l2.hashCode();
        int i3 = l3.hashCode();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("---------------------------");
        System.out.println(l1.isPrimitive());
        System.out.println(l2.isPrimitive());
        System.out.println(l3.isPrimitive());



        Genic<String> genic=new Genic<String>();
        List<Integer> session = genic.<Integer>getSession();


    }

    public <K> void testMentod(Genic genic){
        List session = genic.getSession();
        List<K> session1 = genic.<K>getSession();
        WeakReference weakReference;
        SoftReference softReference;
        ReferenceQueue queue;
        WeakHashMap map;
        PhantomReference phantomReference;
        SqlSessionFactoryBuilder builder;

        XMLIncludeTransformer transformer;
        XMLStatementBuilder builder1;


        SqlSource sqlSource;
        OgnlContext ognl;

        SqlSourceBuilder builder2;

        ResultSetHandler handler;





    }
}
