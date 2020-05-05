package com.druid.demo;
import com.druid.demo.entity.TbUser;
import com.druid.demo.mapper.master.MasterTbUserMapper;
import com.druid.demo.mapper.second.SecondTbUserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private MasterTbUserMapper masterTbUserMapper;
    @Autowired
    private SecondTbUserMapper secondTbUserMapper;
    @Test
    void contextLoads() {
        List<TbUser> users=masterTbUserMapper.selectAll();
        System.out.println("masterTbUserMapper ----"+ users);
        List<TbUser> users2=secondTbUserMapper.selectAll();
        System.out.println("secondTbUserMapper---"+users2);
    }

}
