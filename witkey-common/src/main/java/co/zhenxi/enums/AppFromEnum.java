/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co

 */
package co.zhenxi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author gxm
 * 应用来源相关枚举
 */
@Getter
@AllArgsConstructor
public enum AppFromEnum {

	WEIXIN_H5("weixinh5","weixinh5"),
	H5("h5","H5"),
	WECHAT("wechat","公众号"),
	APP("app","APP"),
	ROUNTINE("routine","小程序");


	private String value;
	private String desc;


}
