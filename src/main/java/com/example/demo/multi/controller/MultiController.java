package com.example.demo.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.multi.service.MultiService;

@Controller
public class MultiController {

    @Autowired
    private MultiService multiService;

    @GetMapping("/multiply")
    public String multiply(Model model) {
        // 10と3の掛け算を行う
        int result = multiService.multiply(10, 3);
        model.addAttribute("result", result); // 'result' をモデルに追加
        return "multi"; // multi.htmlを表示
    }
}
