package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pictures {
    /**
    * 自增id，不要动
    */
    private Integer id;

    /**
    * name表的ID，标记这张图属于哪个哥哥的
    */
    private Integer nameId;

    /**
    * 文件路径，会手把手的！
    */
    private String filePath;
}