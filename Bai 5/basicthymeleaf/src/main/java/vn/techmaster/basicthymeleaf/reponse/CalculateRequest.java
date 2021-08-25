package vn.techmaster.basicthymeleaf.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculateRequest {
    private float x;
    private float y;
}
