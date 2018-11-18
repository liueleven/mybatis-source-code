package cn.liueleven.mybatis;

import cn.liueleven.mybatis.domain.User;
import cn.liueleven.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-18 09:18
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> all = userMapper.findAll();
            System.out.println(all.size());
        } finally {
            sqlSession.close();
        }
    }


}
