/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By 臻希
* 注意：
* 本软件为臻希开发研制
*/
package co.zhenxi.modules.shop.rest;
import co.zhenxi.annotation.AnonymousAccess;
import co.zhenxi.dozer.service.IGenerator;
import co.zhenxi.logging.aop.log.Log;
import co.zhenxi.modules.shop.domain.ZbActivity;
import co.zhenxi.modules.shop.service.ZbActivityService;
import co.zhenxi.modules.shop.service.dto.ZbActivityDto;
import co.zhenxi.modules.shop.service.dto.ZbActivityQueryCriteria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
* @author guoke
* @date 2020-07-31
*/
@AllArgsConstructor
@Api(tags = "专题活动管理")
@RestController
@RequestMapping("/api/zbActivity")
public class ZbActivityController {

    private final ZbActivityService zbActivityService;
    private final IGenerator generator;


    @Log("导出数据")
    @ApiOperation("导出数据")
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('admin','zbActivity:list')")
    public void download(HttpServletResponse response, ZbActivityQueryCriteria criteria) throws IOException {
        zbActivityService.download(generator.convert(zbActivityService.queryAll(criteria), ZbActivityDto.class), response);
    }

    @GetMapping("/activityList")
    @Log("查询专题活动")
    @ApiOperation("查询专题活动")
    //@PreAuthorize("@el.check('admin','activityList:list')")
    @AnonymousAccess
    public ResponseEntity<Object> activityList(ZbActivityQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity<>(zbActivityService.queryAll(criteria,pageable),HttpStatus.OK);
    }

    @PostMapping
    @Log("新增专题活动")
    @ApiOperation("新增专题活动")
    @PreAuthorize("@el.check('admin','zbActivity:add')")
    public ResponseEntity<Object> create(@Validated @RequestBody ZbActivity resources){
        return new ResponseEntity<>(zbActivityService.save(resources),HttpStatus.CREATED);
    }

    @PutMapping
    @Log("修改专题活动")
    @ApiOperation("修改专题活动")
    @PreAuthorize("@el.check('admin','zbActivity:edit')")
    public ResponseEntity<Object> update(@Validated @RequestBody ZbActivity resources){
        zbActivityService.updateById(resources);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Log("删除专题活动")
    @ApiOperation("删除专题活动")
    @PreAuthorize("@el.check('admin','zbActivity:del')")
    @DeleteMapping
    public ResponseEntity<Object> deleteAll(@RequestBody Integer[] ids) {
        Arrays.asList(ids).forEach(id->{
            zbActivityService.removeById(id);
        });
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
