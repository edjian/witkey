/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By 臻希
* 注意：
* 本软件为臻希开发研制
*/
package co.zhenxi.modules.shop.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @author guoke
* @date 2020-07-27
*/
@Data
public class ZbUserDetailDto implements Serializable {

    /** 用户详情编号 */
    private Integer id;

    /** 用户编号 */
    private Integer uid;

    /** 真实姓名 */
    private String realname;

    /** 表示真实姓名是否公开 0表示不公开 1表示公开 */
    private Integer realnameStatus;

    /** 0表示女 1表示男 */
    private Integer sex;

    /** 手机号码 */
    private String mobile;

    /** 0表示不公开 1表示公开 */
    private Integer mobileStatus;

    /** app端用户昵称 */
    private String nickname;

    /** 用户qq */
    private String qq;

    /** qq是否公开 0表示不公开 1表示公开 */
    private Integer qqStatus;

    /** 用户微信号 */
    private String wechat;

    /** qq是否公开 0表示不公开 1表示公开 */
    private Integer wechatStatus;

    /** 身份证号码 */
    private String cardNumber;

    /** 用户省份 */
    private Integer province;

    /** 用户城市 */
    private Integer city;

    /** 用户地区 */
    private Integer area;

    /** 用户头像 */
    private String avatar;

    /** 个人签名 */
    private String autograph;

    /** 个人简介 */
    private String introduce;

    /** 个人标签 */
    private String sign;

    /** 做为服务商的好评数量 */
    private Integer employeePraiseRate;

    /** 做为雇主的好评数量 */
    private Integer employerPraiseRate;

    /** 承接任务数量 */
    private Integer receiveTaskNum;

    /** 发布任务数量 */
    private Integer publishTaskNum;

    /** 店铺状态: -1.管理员禁用店铺 0.未开启店铺 1.开启店铺 2.关闭店铺 */
    private Integer shopStatus;

    /** 用户资产余额 */
    private BigDecimal balance;

    /** 资产冻结 0表示未冻结 1表示资金被冻结 */
    private Integer balanceStatus;

    /** 最后一次登录时间 */
    private Timestamp lastLoginTime;

    /** 空间个人资料背景图片 */
    private String backgroundurl;

    /** 支付提示 0：提示 1：不提示 */
    private Integer alternateTips;

    /** 累计雇佣量 */
    private Integer employeeNum;

    private Timestamp createdAt;

    private Timestamp updatedAt;
}
