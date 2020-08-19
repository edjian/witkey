/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co

 */
package co.zhenxi.tools.service;

import co.zhenxi.tools.service.dto.QiniuContentDto;
import co.zhenxi.tools.service.dto.QiniuQueryCriteria;
import co.zhenxi.common.service.BaseService;
import co.zhenxi.tools.domain.QiniuContent;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
* @author hupeng
* @date 2020-05-13
*/
public interface QiniuContentService  extends BaseService<QiniuContent> {

/**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(QiniuQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<QiniuContentDto>
    */
    List<QiniuContent> queryAll(QiniuQueryCriteria criteria);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<QiniuContentDto> all, HttpServletResponse response) throws IOException;
}
