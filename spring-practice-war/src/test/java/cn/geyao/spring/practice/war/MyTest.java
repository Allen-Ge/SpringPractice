package cn.geyao.spring.practice.war;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import cn.geyao.spring.practice.war.model.User;
import cn.geyao.spring.practice.war.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/*.xml")
@WebAppConfiguration
public class MyTest {

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	IUserService userService;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}

	@Test
	public void testHome() {
		try {
			mockMvc.perform(get("/home/")).andExpect(status().isOk()).andExpect(view().name("home"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("testHome..");
	}

	@Test
	public void test() {
		User user = userService.selectByPrimaryKey(1);
		System.out.println(user.getName());
	}

	@Test
	public void testUserWithLevel() {
		User user = userService.selectUserWithLevelByPrimarykey(1);
		System.out.println(user);
	}
}
