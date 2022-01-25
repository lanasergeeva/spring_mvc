package com.lana.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "viewS";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDet() {
        return "askEmployee";
    }

   /* @RequestMapping("/showDetails")
    public String showEmployeeDet() {
        return "showEmployee";
    }*/

    @RequestMapping("/showDetails")
    public String showEmployeeDet(HttpServletRequest request, Model model) {
        String empName = request.getParameter("empName");
        empName = "Name is:  " + empName;
        model.addAttribute("nameAttr", empName);
        return "showEmployee";
    }
}
