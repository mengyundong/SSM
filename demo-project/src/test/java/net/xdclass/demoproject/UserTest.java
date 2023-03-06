package net.xdclass.demoproject;


import junit.framework.TestCase;
import net.xdclass.demoproject.controller.UserController;
import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.utils.JsonData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //底层用junit SpringJUnit4ClassRunner
@SpringBootTest(classes = {DemoProjectApplication.class})//启动整个springboot工程
public class UserTest {

    @Autowired
    private UserController userController;

    @Test
    public void loginTest(){

        User user = new User();
        user.setUsername("jack");
        user.setPwd("1234");

        JsonData jsonData = userController.login(user);
        System.out.println(jsonData.toString());
        TestCase.assertEquals(0,jsonData.getCode());
    }
}
