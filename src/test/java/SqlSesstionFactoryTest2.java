import org.apache.ibatis.io.Resources;
import org.apache.ibatis.io.VFS;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;

public class SqlSesstionFactoryTest2 {

    public static void main(String[] args) throws IOException {
        String path="H:\\proj\\new\\ibatisTest\\src\\main\\java\\com\\c2\\mapper";
        /*ArrayList<URL> list = Collections.list(Thread.currentThread().getContextClassLoader().getResources(path));
        for (URL url:list
             ) {
            System.out.println(url);
        }*/
        List<String> list = VFS.getInstance().list(path);
        for (String s:list
             ) {
            System.out.println(s);
        }
    }

}
