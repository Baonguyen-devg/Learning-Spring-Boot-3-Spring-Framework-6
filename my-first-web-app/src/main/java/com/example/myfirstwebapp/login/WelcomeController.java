package com.example.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap mode) {
		mode.put("name", getLoggedInUsername());
		return "welcome";
	}
	
	private String getLoggedInUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	/*
	 * private AuthenticationService authenticationService; private Logger logger =
	 * LoggerFactory.getLogger(getClass());
	 * 
	 * public LoginController(AuthenticationService authenticationService) {
	 * super(); this.authenticationService = authenticationService; }
	 */
	
	//http://localhost:8080/login
	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.GET) public String
	 * gotoLoginPage() { return "login"; }
	 */
	
	//http://localhost:8080/login-with-para?name="ThaiBao"
	/*
	 * @RequestMapping(value = "/login-with-para", method = RequestMethod.GET)
	 * public String gotoLoginPageWithPara(@RequestParam String name, ModelMap
	 * modelMap) { modelMap.put("name", name); logger.info("Request parameter: {}",
	 * name); logger.debug("I want this printed at debug level");
	 * logger.warn("I want this printed at warn level");
	 * //System.out.println("request parameter: " + name); return "login"; }
	 * 
	 * @RequestMapping(value = "/login", method = RequestMethod.GET) public String
	 * gotoLoginPage() { return "login"; }
	 * 
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public String
	 * gotoWelcomePage(@RequestParam String name,
	 * 
	 * @RequestParam String password, ModelMap model) {
	 * 
	 * if (authenticationService.authenticate(name, password)) { model.put("name",
	 * name); return "welcome"; } model.put("errorMassenge",
	 * "Your name and password is not correct, please try again!"); return "login";
	 * }
	 */
}
