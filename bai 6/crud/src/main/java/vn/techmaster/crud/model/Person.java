package vn.techmaster.crud.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private String job;
    private boolean gender;
    private String birthDay;

    public boolean getGender() {
        return gender;
    }
    public boolean matchWithKeyword(String keyword) {
        String keywordLowerCase = keyword.toLowerCase();
        String nameLowerCase = name.toLowerCase();
        String jobLowerCase = job.toLowerCase();

        return (nameLowerCase.contains(keywordLowerCase) || jobLowerCase.contains(keywordLowerCase));
    }

}
