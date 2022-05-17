package com.mj.jk.controller;

import com.mj.jk.pojo.query.DictTypeQuery;
import com.mj.jk.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dictTypes")
public class DictTypeController {
    @Autowired
    private DictTypeService service;

    @GetMapping("/list")
    public String list(DictTypeQuery query, Model model) {
//        DictTypeQuery query = new DictTypeQuery(1,2,"321");
        model.addAttribute("data", service.list(query));
        return "pages/dictType";
    }
}
