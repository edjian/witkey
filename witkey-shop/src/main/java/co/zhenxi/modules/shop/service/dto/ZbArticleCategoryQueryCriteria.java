/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By 臻希
* 注意：
* 本软件为臻希开发研制
*/
package co.zhenxi.modules.shop.service.dto;

import co.zhenxi.annotation.Query;
import lombok.Data;

/**
* @author guoke
* @date 2020-07-30
*/
@Data
public class ZbArticleCategoryQueryCriteria{

    /** 精确 */
    @Query
    private Integer catId;
}
