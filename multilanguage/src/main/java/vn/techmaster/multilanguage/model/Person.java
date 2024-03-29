package vn.techmaster.multilanguage.model;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
  
  @Size(min = 5, max = 30, message = "{name_size_between_5_30}")
  private String name;

  private String job;

  private boolean gender;

  @NotBlank(message = "{birthday.required}")
  private String birthDay;

  private MultipartFile photo;
}