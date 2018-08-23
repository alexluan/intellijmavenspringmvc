package cn.itsource.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/user")
    public ModelAndView excute(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("userController.....!!!!!");
        return null;
    }
}
