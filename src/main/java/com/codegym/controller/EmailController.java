package com.codegym.controller;

import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("email/")
public class EmailController {
    @RequestMapping(value = "showForm", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("email", new Email());
        return "email/create";
    }

    @RequestMapping(value = "/addEmail", method = RequestMethod.POST)
    public String submit(@ModelAttribute("email") Email email, ModelMap model) {
        model.addAttribute("language", email.getLanguage());
        model.addAttribute("paperSize", email.getPaperSize());
        model.addAttribute("id", email.getId());
        model.addAttribute("spamsFillter", email.getSpamsFillter());
        model.addAttribute("signature", email.getSignature());
        return "email/info";
    }
}
