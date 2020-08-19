/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co

 */
package co.zhenxi.tools.service.mapper;

import co.zhenxi.common.mapper.CoreMapper;
import co.zhenxi.tools.domain.QiniuConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
* @author hupeng
* @date 2020-05-13
*/
@Repository
@Mapper
public interface QiniuConfigMapper extends CoreMapper<QiniuConfig> {


    @Update("update qiniu_config set type = #{type} ")
    void updateType(@Param("type") String type);
}
