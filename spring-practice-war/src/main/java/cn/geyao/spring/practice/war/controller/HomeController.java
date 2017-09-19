package cn.geyao.spring.practice.war.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.geyao.spring.practice.war.model.User;
import cn.geyao.spring.practice.war.service.IUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private IUserService userService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		User user = userService.selectByPrimaryKey(1);
		LOGGER.error("Welcome home! The client locale is {},user:{}", locale, user.getName());

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}
}
