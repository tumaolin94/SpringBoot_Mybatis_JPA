package com.maolintu.matisplusjpa;

import com.maolintu.matisplusjpa.mapper.UserMapper;
import com.maolintu.matisplusjpa.model.StockCode;
import com.maolintu.matisplusjpa.model.User;
import com.maolintu.matisplusjpa.repostory.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(value = "com.maolintu.matisplusjpa.mapper")
public class MatisplusjpaApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userJPA;

    @Autowired
    private DataSource dataSource;
    @Test
    public void testDruid() throws SQLException{
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void contextLoads() {
        System.out.println(userMapper.selectByPrimaryKey(1).getName());
        //构通Example查找
        User user = new User();
        user.setId(1);
        Example<User> example = Example.of(user);
        System.out.println(userJPA.findOne(example));
    }

}
