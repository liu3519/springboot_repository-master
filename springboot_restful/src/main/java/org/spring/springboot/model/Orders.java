package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Orders {
    /**
    * 自增id，不要动哦
    */
    private Integer id;

    /**
    * name表的id
    */
    private Integer userId;

    /**
    * 商品的id
    */
    private Integer goodsId;

    /**
    * 件数
    */
    private Integer count;

    /**
    * 状态根据需要可以自己定义啦
    */
    private Byte status;
}