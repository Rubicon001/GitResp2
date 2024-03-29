package com.al.controller;

import com.al.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {

    @GetMapping("/literal")
    public String literal(Model model) {
        model.addAttribute("name", "Larry");
        model.addAttribute("age", 22);
        return "03_literal";
    }

//    @GetMapping("/comment")
//    public String comment() {
//        return "02_comment";
//    }

    @GetMapping("/helloworld")
    public String helloworld(Model model) {
        model.addAttribute("name", "Larry");
        model.addAttribute("age", 22);
        model.addAttribute("msg", "<h1>msg</h1>");

        return "01_helloworld";
    }

    @GetMapping("/selection")
    public String selection(Model model) {
        model.addAttribute("person", new Person(10, "MJ"));
        return "04_selection";
    }

//    @GetMapping("/i18n")
//    public String i18n(String name, Integer age) {
//        System.out.println(name);
//        System.out.println(age);
//        return "05_i18n";
//    }

    @GetMapping("/url")
    public String url(Model model) {
        model.addAttribute("id", 6);
        return "06_url";
    }

    @GetMapping("/for")
    public String _for(Model model) {
        model.addAttribute("persons", List.of(
                new Person(11, "MJ11"),
                new Person(22, "MJ22"),
                new Person(33, "MJ33"),
                new Person(44, "MJ44")
        ));
        return "07_for";
    }

    @GetMapping("/attr")
    public String attr(Model model) {
        model.addAttribute("id", 6);
        model.addAttribute("name", "MJ");
        return "08_attr";
    }

    @GetMapping("/object")
    public String object(HttpServletRequest request, HttpSession session) {
        request.setAttribute("birthday", new Date());
        request.setAttribute("name", "request_mj");
        session.setAttribute("name", "session_mj");
        session.getServletContext().setAttribute("name", "ctx_mj");
        return "09_object";
    }

//    @GetMapping("/testIndex")
//    public String testIndex(HttpServletRequest request) {
//        // prefix: classpath:/templates/
//        // suffix: .html
//        // classpath:/templates/01_helloworld.html
//        request.setAttribute("name", "MJ");
//        request.setAttribute("age", 20);
//        return "index";
//    }

//    public ModelAndView testIndex() {
//        // prefix: classpath:/templates/
//        // suffix: .html
//        // classpath:/templates/01_helloworld.html
//        ModelAndView mv = new ModelAndView("index");
//        mv.addObject("name", "MJ");
//        mv.addObject("age", 20);
//        return mv;
//    }

}
