package vn.techmaster.multilanguage.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import vn.techmaster.multilanguage.exception.StorageException;
import vn.techmaster.multilanguage.model.Person;
import vn.techmaster.multilanguage.service.StorageService;

@Controller
public class MainController {
  @Autowired
  private StorageService storageService;

  @Autowired
  private MessageSource messageSource;

  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("person", new Person());
    return "home";
  }

  @PostMapping(value = "/", consumes = { "multipart/form-data" })
  public String upload(@Valid @ModelAttribute Person person, BindingResult result, Model model) {
    Locale locale = LocaleContextHolder.getLocale();

    if (person.getPhoto().getOriginalFilename().isEmpty()) {
      result.addError(new FieldError("person", "photo",
          messageSource.getMessage("photo.required", null, "Photo required", locale)));
    }
    if (result.hasErrors()) {
      return "home";
    }

    storageService.uploadFile(person.getPhoto());
    model.addAttribute("name", person.getName());
    model.addAttribute("photo", person.getPhoto().getOriginalFilename());
    return "success";
  }

  @ExceptionHandler(StorageException.class)
  public String handleStorageFileNotFound(StorageException e, Model model) {
    model.addAttribute("errorMessage", e.getMessage());
    return "fail";
  }

  @GetMapping("/success")
  public String success() {
    return "success";
  }

  @GetMapping("/fail")
  public String failure() {
    return "fail";
  }
}
