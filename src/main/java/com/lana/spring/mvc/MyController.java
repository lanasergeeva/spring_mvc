package com.lana.spring.mvc;

import com.lana.spring.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "viewS";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDet(Model model) {
        model.addAttribute("employee", new Employee());
        return "askEmployee";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDet(@Valid @ModelAttribute("employee") Employee employee, BindingResult br) {
        if (br.hasErrors()) {
            return "askEmployee";
        }
        return "showEmployee";
    }
}
