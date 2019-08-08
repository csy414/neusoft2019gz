package com.neusoft.promis.security.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.neusoft.promis.security.model.CustomerModel;
import com.neusoft.promis.security.service.ICustomerService;

@RestController
//@ResponseBody
@RequestMapping("/api/customer")
//@CrossOrigin
public class CustomerAPIController {
	
	@Autowired
	private ICustomerService cs=null;
	
	//异常处理方法
	/*
	@ExceptionHandler
	public ResponseEntity<String> handle(Exception ex) {
		return new ResponseEntity<String>(ex.getMessage(),null,HttpStatus.EXPECTATION_FAILED);
	}
	*/
	@PostMapping(value="add01")
	public String add(int customerNo,int typeNo, String ccode,String cname) throws Exception{
		
		
		return "OK";
		
	}
	@PostMapping(value="add02")
	public String add(@RequestBody CustomerModel cm) throws Exception{
		
		System.out.println(cm.getCustomerNo());
		System.out.println(cm.getTypeNo());
		return "OK";
		
	}
	
	@RequestMapping(path="/get/{customerNo}",method = {RequestMethod.POST,RequestMethod.GET})
	public CustomerModel getUser(@PathVariable int customerNo,@RequestHeader("token") String token,@CookieValue("JSESSIONID") String ssno, @SessionAttribute("customerNo") String cno)  throws Exception{
		System.out.println(token);
		System.out.println(ssno);
		return cs.getByCustomerNo(customerNo);
	}
	@RequestMapping(path="/get01/{customerNo}",method = {RequestMethod.POST,RequestMethod.GET})
	public ResponseEntity<CustomerModel> getUser01(@PathVariable int customerNo)  throws Exception{
		
		CustomerModel cm=cs.getByCustomerNo(customerNo);
		//设定响应头
		MultiValueMap<String, String> headersMap=new LinkedMultiValueMap<String,String>();
		headersMap.add("token", "9999");
		headersMap.add("cname", "LHD");
		headersMap.add("Content-Type", "image/jpeg");
		
		
		
		
		ResponseEntity<CustomerModel> resultEntity=new ResponseEntity<CustomerModel>(cm,headersMap,HttpStatus.OK);
		
		
		return resultEntity;
		
	}
	
	@RequestMapping(value="/list")	
	public List<CustomerModel> getCustomerList() throws Exception{
		return cs.getListByAll();
	}
	
	public void sendInfo(HttpServletResponse response,HttpSession session) throws Exception{
		
		
		
	}
	
	//编程练习: 参数：用户的ID， 功能：下载用的图像。
	public ResponseEntity<Byte[]> downPhoto(String id) throws Exception{
		
		return null;
	}

}
