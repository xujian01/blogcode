package mybatisplugin;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author xujian
 * 2021-05-11 15:51
 **/
public class PluginTest {
    @Test
    public void testPlugin() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        List<Object> list = sqlSession.selectList("nameinfo.findByName", "xujian01");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
