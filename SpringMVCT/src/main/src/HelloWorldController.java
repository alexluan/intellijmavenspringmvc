import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// Spring MVC 框架搭建及入门详解
public class HelloWorldController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {

        // 设置参数
//        String user = httpServletRequest.getParameter("user");
//        System.out.println("hello spring mvc:"+user);
        // 回显 参数
        httpServletRequest.setAttribute("msg","hello srping mvc");
//        httpServletRequest.getRequestDispatcher("/WEB-INF/view/hello.jsp").forward(httpServletRequest,httpServletResponse);
        ModelAndView mv = new ModelAndView();
        // 没有回显到界面
        mv.addObject("msg","hello world!!!");
        mv.setViewName("/WEB-INF/views/hello.jsp");
        return mv;
    }
}
