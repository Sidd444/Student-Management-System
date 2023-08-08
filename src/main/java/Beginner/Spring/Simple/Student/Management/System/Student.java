package Beginner.Spring.Simple.Student.Management.System;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    int id;
    String name;
    int age;
    String course;
}
