package com.jonas;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class UserController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<User> users = new ArrayList<>();
        User user1 = new User("张三", 20);
        User user2 = new User("李四", 30);
        users.add(user1);
        users.add(user2);
        String myData = (String) getServletContext().getAttribute("name");
        User user3 = new User(myData, 40);
        users.add(user3);

        return new ModelAndView("userlist", "users", users);
    }
}
