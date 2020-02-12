package com.yuan.oa.controller;

import com.yuan.oa.biz.GlobalBiz;
import com.yuan.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller("globalController")

public class GlobalController {
    @Autowired
    private GlobalBiz globalBiz;

    @RequestMapping("/to_login")
    public String toLogin(){
         return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam String sn,@RequestParam String password){
        Employee employee = globalBiz.login(sn,password);
        if(employee==null){
            return "redirect:to_login";
        }
        session.setAttribute("Employee",employee);
        return "redirect:self";
    }
    @RequestMapping("/self")
    public String self(){
        return "self";
    }

    @RequestMapping("/quit")
    public String logout(HttpSession session){
        session.setAttribute("Employee",null);
        return "redirect:to_login";
    }

    @RequestMapping("/to_change_password")
    public String toChangePassword() {
        return "change_password";
    }

    @RequestMapping("/change_password")
    public String changePassword(HttpSession session,@RequestParam String old,@RequestParam String new1,@RequestParam String new2){
        Employee employee = (Employee)session.getAttribute("Employee");
        if(employee.getPassword().equals(old)){
            if(new1.equals(new2)){
                employee.setPassword(new1);
                globalBiz.changePassword(employee);
                return "redirect:self";
            }
        }
        return "redirect:to_change_password";
    }
}
