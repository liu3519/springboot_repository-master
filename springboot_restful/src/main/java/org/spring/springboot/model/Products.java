package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Products {
    private Integer id;

    private String name;

    private Integer num;

    private Integer price;

    private String picture;
}