import com.c2.hanzi.ReaderMy;
import com.c2.mapper.UserMapper;
import com.c2.model.User;
import org.apache.ibatis.builder.xml.XMLMapperEntityResolver;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlSesstionFactoryTest1 {

    public static void main(String[] args) throws IOException {
        String resource="mybatis-config.xml";
        InputStream is= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper);
        Map<String,Object> param=new HashMap<>();
        param.put("USER_ID","1");
        System.out.println(mapper.queryUser(param));
        List<Map<String, Object>> maps = mapper.queryUser_2(param);
        System.out.println(maps);

        User user = mapper.queryUser_3(param);
        System.out.println(user);
        XMLMapperEntityResolver resolver;

        Reflector reflector;



    }
}
