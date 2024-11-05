package org.example.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    private Integer id;
    private String name;
    private String age;
}
