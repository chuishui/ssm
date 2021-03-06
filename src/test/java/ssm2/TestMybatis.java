package ssm2;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ssm.model.User;
import com.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	@Autowired
	private UserService userService;

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		logger.info(JSON.toJSONString(user));
	}
}
