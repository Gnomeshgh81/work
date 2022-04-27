package com.example.demo.Entity;

import lombok.*;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class dd {
    menu m;
    Integer count;

    public dd(menu m, Integer count) {
        this.m = new menu();
        this.m.setId(m.getId());
        this.m.setImg(m.getImg());
        this.m.setIntroduction(m.getIntroduction());
        this.m.setName(m.getName());
        this.m.setPrice(m.getPrice());
        this.count = count;
    }
}
