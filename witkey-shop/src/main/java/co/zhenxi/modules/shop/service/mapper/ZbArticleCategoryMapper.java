/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By 臻希
* 注意：
* 本软件为臻希开发研制
*/
package co.zhenxi.modules.shop.service.mapper;

import co.zhenxi.common.mapper.CoreMapper;
import co.zhenxi.modules.shop.domain.ZbArticleCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author guoke
* @date 2020-07-30
*/
@Repository
@Mapper
public interface ZbArticleCategoryMapper extends CoreMapper<ZbArticleCategory> {


    @Select("select id from zb_article_category where pid = ${id}")
    List<Integer> selectByPid(Integer id);
}
