/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By 臻希
* 注意：
* 本软件为臻希开发研制
*/
package co.zhenxi.modules.shop.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.io.Serializable;

/**
* @author Guoxm
* @date 2020-07-16
*/
@Data
public class ZbLinkDto implements Serializable {

    /** 编号 */
    private Integer id;

    /** 标题 */
    private String title;

    /** 链接名称 */
    private String content;

    /** 添加时间 */
    private Timestamp addtime;

    /** 状态 */
    private Integer status;

    /** 排序 */
    private Integer sort;

    private String pic;
}
