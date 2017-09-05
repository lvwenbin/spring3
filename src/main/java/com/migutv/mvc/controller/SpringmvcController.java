package com.migutv.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.migutv.mvc.annotation.Controller;
import com.migutv.mvc.annotation.Quatifier;
import com.migutv.mvc.annotation.RequestMapping;
import com.migutv.mvc.service.MyService;
import com.migutv.mvc.service.impl.SpringmvcServiceImpl;

@Controller("chaoyue")
public class SpringmvcController {
	@Quatifier("MyServiceImpl")  
    MyService myService;  
    @Quatifier("SpringmvcServiceImpl")  
    SpringmvcServiceImpl smService;  
  
    @RequestMapping("insert")  
    public String insert(HttpServletRequest request, HttpServletResponse response, String param) {  
        myService.insert(null);  
        smService.insert(null);  
        return null;  
    }  
  
    @RequestMapping("delete")  
    public String delete(HttpServletRequest request, HttpServletResponse response, String param) {  
        myService.delete(null);  
        smService.delete(null);  
        return null;  
    }  
  
    @RequestMapping("update")  
    public String update(HttpServletRequest request, HttpServletResponse response, String param) {  
        myService.update(null);  
        smService.update(null);  
        return null;  
    }  
  
    @RequestMapping("select")  
    public String select(HttpServletRequest request, HttpServletResponse response, String param) {  
        myService.select(null);  
        smService.select(null);  
        return null;  
    }  
}
