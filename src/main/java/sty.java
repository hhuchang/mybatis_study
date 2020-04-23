import com.c2.utils.zhUtil;
import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.ognl.Ognl;
import org.apache.ibatis.parsing.GenericTokenParser;
import org.apache.ibatis.parsing.TokenHandler;
import org.apache.ibatis.scripting.xmltags.SqlNode;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

public class sty {


    public static void main(String[] args) {
        //Ognl.getValue()

        /*SqlNode sqlNode;
        String name=null;

        GenericTokenParser parser=new GenericTokenParser("#{", "}", new TokenHandler() {
            public String handleToken(String content) {
                System.out.println("content:"+content);
                return content;
            }
        });
        String parse = parser.parse("rytretueru rete#{changcan}");
        System.out.println("parse:"+parse);

        System.out.println("====================================");
        StringBuilder sb=new StringBuilder();
        sb.append("from ass;");
        sb.insert(0," ");
        sb.insert(0,"insert");
        System.out.println(sb);
        DefaultSqlSessionFactory factory;
        */
        System.out.println("\ud852\udeeb");
        System.out.println("\ud841\udf86");

        //System.out.println(zhUtil.decodeUnicode("\ud841\udf86"));
        System.out.println("--------");

        System.out.println(zhUtil.decodeUnicode("\u25c7"));
        System.out.println(zhUtil.decodeUnicode("\udeeb"));


        SqlNode sqlNode;
        SqlSource sqlSource;

        XMLMapperBuilder xmlMapperBuilder;




    }
}
