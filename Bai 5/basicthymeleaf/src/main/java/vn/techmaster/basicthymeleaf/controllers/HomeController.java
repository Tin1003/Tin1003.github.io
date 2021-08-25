package vn.techmaster.basicthymeleaf.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.techmaster.basicthymeleaf.model.Person;
import vn.techmaster.basicthymeleaf.repository.IMemoryRepository;



@Controller
@RequestMapping("")
public class HomeController {
    @Autowired
    private IMemoryRepository iRepository;

    @GetMapping("")
    public String about(){
        return "index";
    }

    //
    @GetMapping("show")
    public ModelAndView  showListPerson(){
        List<Person> people = iRepository.getPeople();
        ModelAndView mav = new ModelAndView("showListPerson");
        mav.addObject("people", people);
        return mav;
    }

    //
    @GetMapping("showWith2Columns")
    public ModelAndView showWith2Columns(){

        List<Person> people = iRepository.getPeople();
        ModelAndView mav = new ModelAndView("showWith2columns");
        mav.addObject("people", people);
        return mav;
    }


}
