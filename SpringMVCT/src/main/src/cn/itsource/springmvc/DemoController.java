package cn.itsource.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class DemoController {
@RequestMapping(value="/demo1")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
    System.out.println("/demo1");
        return  null;
    }
    @RequestMapping(value="/demo2")
    public ModelAndView handleRequest1(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("demo1");
        return  null;
    }
    @RequestMapping(value="/demo3")
    public ModelAndView handleRequest2(HttpServletResponse response,HttpServletRequest request) throws Exception{
        System.out.println("demo3");
        request.getParameter("");
        return  null;
    }
    @RequestMapping(value="/demo3")
    public ModelAndView handleRequest3(HttpServletResponse response, HttpServletRequest request, HttpSession session) throws Exception{
        System.out.println("demo3");
        request.getParameter("");
        return  null;
    }
}
