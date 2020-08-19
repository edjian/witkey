/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By 臻希
* 注意：
* 本软件为臻希开发研制
*/
package co.zhenxi.modules.shop.service;
import co.zhenxi.common.service.BaseService;
import co.zhenxi.modules.shop.domain.ZbRecommendPosition;
import co.zhenxi.modules.shop.service.dto.ZbRecommendPositionDto;
import co.zhenxi.modules.shop.service.dto.ZbRecommendPositionQueryCriteria;
import org.springframework.data.domain.Pageable;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
* @author Guoxm
* @date 2020-07-16
*/
public interface ZbRecommendPositionService  extends BaseService<ZbRecommendPosition>{

/**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(ZbRecommendPositionQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<ZbRecommendPositionDto>
    */
    List<ZbRecommendPosition> queryAll(ZbRecommendPositionQueryCriteria criteria);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<ZbRecommendPositionDto> all, HttpServletResponse response) throws IOException;
}
