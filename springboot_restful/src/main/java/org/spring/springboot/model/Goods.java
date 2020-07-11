package org.spring.springboot.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Goods {
    /**
    * 自增ID，不要动呀
    */
    private Integer id;

    /**
    * name表中的id
    */
    private Integer nameId;

    /**
    * 商品名称在这里
    */
    private String goods;

    /**
    * 这是价格哦
    */
    private BigDecimal price;

    /**
    * 商品图片的路径，怎么用会手把手的啦
    */
    private String filePath;
}