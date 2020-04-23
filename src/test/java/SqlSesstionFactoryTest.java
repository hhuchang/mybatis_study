
import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlSesstionFactoryTest {

    public static void main(String[] args) throws IOException {
        String resource="mybatis-config.xml";
        InputStream is= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //Configuration configuration = sqlSessionFactory.getConfiguration();
        SqlSession sqlSession = sqlSessionFactory.openSession();


        //System.out.println(configuration);
        //System.out.println(sqlSession);
        //BaseBuilder baseBuilder;
        List<Object> list=null;
        try {

            Map<String, Object> param = new HashMap<>();
            param.put("userId", "2145894739");
            list = sqlSession.selectList("com.c2.mapper.UserMapper.selectUserDetail", param);

            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        System.out.println("--------------------------------------------------"+list);

    }
}
