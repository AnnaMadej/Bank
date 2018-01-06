package com.aniamadej.bank.Controllers;

import com.aniamadej.bank.Models.CreditQueryModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexGet(Model model){
        return "index";
    }

    @GetMapping("/calculator")
    public String subPage(){
        return "calculator";
    }

    @PostMapping("/calculator")
    public String indexPost(@ModelAttribute("creditQueryModel")CreditQueryModel creditQueryModel, Model model){
        model.addAttribute("possibleInstallments", creditQueryModel.calculatePossibleInstallments());
        model.addAttribute("income", creditQueryModel.getIncome());
        model.addAttribute("amount", creditQueryModel.getAmount());
        model.addAttribute("requestedInstallments", creditQueryModel.getNumberOfInstallments());
        return "calculator";
    }
}
