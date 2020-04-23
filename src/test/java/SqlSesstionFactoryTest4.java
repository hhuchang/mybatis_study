import com.c2.mapper.UserMapper;
import com.c2.model.User;
import org.apache.ibatis.binding.MapperRegistry;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlSesstionFactoryTest4 {

    public static void main(String[] args) throws IOException {
        String resource="mybatis-config.xml";
        InputStream is= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        Configuration configuration = sqlSessionFactory.getConfiguration();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MapperRegistry mapperRegistry = configuration.getMapperRegistry();

        UserMapper user_mapper = mapperRegistry.getMapper(UserMapper.class, sqlSession);

        User user = user_mapper.selectUserDetail("2145894739");



        /*List<Object> list=null;
        try {

            Map<String, Object> param = new HashMap<>();
            param.put("userId", "2145894739");
            list = sqlSession.selectList("com.c2.mapper.UserMapper.selectUserDetail", param);

            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }*/
        System.out.println("--------------------------------------------------");
        Cache cache;
        CacheKey key;


    }
}
