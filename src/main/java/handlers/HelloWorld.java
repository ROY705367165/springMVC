package handlers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorld {

    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        
        return "success";
    }
    
    @RequestMapping("/helloworld/aa")
    public String hello2(@RequestParam("sb") String sb, Map<String,Object> model){
    	model.put("sb", sb);
    	return "success";
    }
    
    @RequestMapping(value="/helloworld1/bb/{dd}", method=RequestMethod.GET)
    public String hello3(@PathVariable("dd") String sb, Model model){
    	model.addAttribute("sb", sb);
    	return "success";
    }
    
    @RequestMapping("/helloworld2")
    public String hello4(HttpServletRequest request){
    	String sb = (String)request.getParameter("sb");
    	System.out.println(sb);
    	request.setAttribute("sb", sb);
    	
    	return "success";
    }
}