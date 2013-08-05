package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView handleRequest() {
		String contentString = "Hello World";
		
		/* "hello" gets taken by spring and gets .jsp added to the end to make
		 * hello.jsp, as defined by our spring-servelet.xml file 
		 * Spring looks in web-inf/jsp for a file called hello.jsp, adds this ModelAndView
		 * object to the jsp, and serves it to the user.
		 */
		ModelAndView mav = new ModelAndView("hello");
		
	   /* in the jsp, we will have access to String object called contentString, but we have
		* to refer to it in JSTL tag syntax and call it by content, see hello.jsp
		*/
		mav.addObject("content", contentString); 
		
		return mav;
	}


}
