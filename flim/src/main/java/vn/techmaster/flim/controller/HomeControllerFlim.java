package vn.techmaster.flim.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.techmaster.flim.model.Flim;

@Controller
@RequestMapping(value ="/")
public class HomeControllerFlim {
    @GetMapping("/flim")
    public String ListFlim(Model model){
       List <Flim> flims = List.of(
           new Flim ("Titanic", "Lang man", "James Cameron", 1992),
           new Flim("Game of Thrones", "hanh dong", " David Benioff ", 1990),
           new Flim("Toys", "hoat hinh", " David Osspina ", 2000),
           new Flim("Tom and jerry", "cartoon", " David Beckham ", 2000));
           model.addAttribute("flims", flims);
        return "flim";
    }
    
}
