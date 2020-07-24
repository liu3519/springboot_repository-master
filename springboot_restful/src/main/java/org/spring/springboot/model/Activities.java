package org.spring.springboot.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Activities {
    private Integer id;

    private String name;

    private String city;

    private String location;

    private Date time;

    private String pictureName;

    private String picturePath;

    private String pictureUuid;
}