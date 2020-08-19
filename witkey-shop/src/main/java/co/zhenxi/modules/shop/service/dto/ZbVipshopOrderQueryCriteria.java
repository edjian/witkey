/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By 臻希
* 注意：
* 本软件为臻希开发研制
*/
package co.zhenxi.modules.shop.service.dto;

import lombok.Data;
import java.util.List;
import co.zhenxi.annotation.Query;

/**
* @author guoke
* @date 2020-07-27
*/
@Data
public class ZbVipshopOrderQueryCriteria{

    /** 模糊 */
    @Query(type = Query.Type.INNER_LIKE)
    private String title;

    /** 精确 */
    @Query
    private Integer uid;

    /** 精确 */
    @Query
    private Integer packageId;

    /** 精确 */
    @Query
    private Integer shopId;

    /** 精确 */
    @Query
    private Integer status;
}
