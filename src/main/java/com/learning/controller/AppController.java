/**
 * 
 */
package com.learning.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author SACHIN
 *
 */
@RestController
@RequestMapping("/api")
public class AppController {
	
	@Value("${app.welcomeMessage}")
	private String welcomeMsg;
	
	
	@RequestMapping(path="/access", produces = "application/json")
	 public String getAccess(){
	    //String welcomeMsg = "Welcome to SpringBoot and REST API demo"; 
		return welcomeMsg;
	   }
	
	
	 @RequestMapping("/")
	 public String index() {
		return "Greetings!!!!";
	 }


}
