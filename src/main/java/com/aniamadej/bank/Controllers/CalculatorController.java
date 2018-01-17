package com.aniamadej.bank.Controllers;

import com.aniamadej.bank.Models.CreditResponseModel;
import com.aniamadej.bank.Models.Forms.CreditQueryForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String calculatorGet(Model model){
        model.addAttribute("creditQueryForm", new CreditQueryForm());
        model.addAttribute("creditResponseModel", new CreditResponseModel());
        return "calculator";
    }

    @PostMapping("/calculator")
    public String calculatorPost(@ModelAttribute()CreditQueryForm form, Model model){
        CreditResponseModel response = new CreditResponseModel(form);
        model.addAttribute("creditResponseModel", response);
        form.setNumberOfInstallments(response.getPossibleInstallments());
        model.addAttribute("creditQueryForm", form);
        return "calculator";
    }
}
