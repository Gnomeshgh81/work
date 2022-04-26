package com.example.demo.Entity;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class menu {
    Integer id;
    String name;
    String img;
    Integer price;
    String introduction;

}
