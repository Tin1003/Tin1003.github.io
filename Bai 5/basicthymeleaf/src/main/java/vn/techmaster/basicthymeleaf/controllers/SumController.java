package vn.techmaster.basicthymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.techmaster.basicthymeleaf.reponse.CalculateRequest;
import vn.techmaster.basicthymeleaf.reponse.CalculateResponse;

@Controller
@RequestMapping("calculate")
public class SumController {
    @GetMapping("math")
    public ModelAndView calculate(){
        ModelAndView mav = new ModelAndView("calculate");
        mav.addObject("calculate" , new CalculateRequest());
        mav.addObject("response" , null);
       return mav;
    }

    @PostMapping("math")
    public ModelAndView handleBMIForm(@ModelAttribute("calculate") CalculateRequest calculate, BindingResult bindingResult) {
        calculate.getX();
        calculate.getY();
        ModelAndView mav = new ModelAndView("calculate");
        if (! bindingResult.hasErrors()) {
            float sum = calculate.getX() + calculate.getY();
            CalculateResponse response = new CalculateResponse(sum);
            //
            mav.addObject("calculate", calculate);
            mav.addObject("response", response);
        }
        return mav; 
    }

}
