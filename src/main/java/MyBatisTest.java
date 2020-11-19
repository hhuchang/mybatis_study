import com.c2.mapper.RoleMapper;
import com.c2.model.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
/**
用来测试中古
 */
public class MyBatisTest {
    public static void main(String[] args) {

        String resource="mybatis-config.xml";
        InputStream inputStream=null;
        try {
            inputStream= Resources.getResourceAsStream(resource);

        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory=null;
        sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=null;
        SqlSession sqlSession1=null;
        try {
            sqlSession=sqlSessionFactory.openSession();
            sqlSession1=sqlSessionFactory.openSession();

            RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
            Role role=roleMapper.getRole(1L);
            //Role role=roleMapper.findRole("张三");
            Role newRole=new Role();
            newRole.setId(1L);
            newRole.setRoleName("张三的歌");
            roleMapper.updateRole(newRole);
            System.out.println(role.getId()+":"+role.getRoleName()+":"+role.getNote());
//            RoleMapper roleMapper1=sqlSession1.getMapper(RoleMapper.class);
//
//            Role role2=roleMapper1.getRole(1L);
            Role role1=roleMapper.getRole(1L);
            System.out.println(role1);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
