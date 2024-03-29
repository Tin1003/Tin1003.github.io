package vn.techmaster.book.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.techmaster.book.model.Book;

@Controller
@RequestMapping(value ="/")
public class FlimController {
  @GetMapping("/")
  public String showHomePage() {
    return "index";
  }
  @GetMapping("/Flims")
  public String listFlims(Model model) {
    List<Flim> Flims = List.of(
      new Film("Gone with the Wind", " Victor Fleming, David O. Selznick ", 1939),
                new Film("Bố Già", " Trấn Thành", 2020), new Film("Parasite", " Bong Joon-ho", 2019),
                new Film("Money Heist", " Álex Pina", 2018)
    );
    model.addAttribute("Flims", Flims);
    return "Flim";
  }
}


