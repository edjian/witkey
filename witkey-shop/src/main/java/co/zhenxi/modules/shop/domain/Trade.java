package co.zhenxi.modules.shop.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Author: Jia Hao Hao
 * @Date: 2020-09-19 10:58
 * @Description: Trade
 **/
@Data
@TableName("trade")
public class Trade {


    /**主键*/
    @TableId
    private long id;

    /** （必填）商品描述 */
    @NotBlank
    private String body;

    /** （必填）商品名称 */
    @NotBlank
    private String subject;

    /** （必填）商户订单号，应该由后台生成 */
    @ApiModelProperty(hidden = true)
    private String outTradeNo;

    /** （必填）第三方订单号 */
    @ApiModelProperty(hidden = true)
    private String tradeNo;

    /** （必填）价格 */
    @NotBlank
    private String totalAmount;

    /** 订单状态,已支付，未支付，作废 */
    @ApiModelProperty(hidden = true)
    private String status;

    /** 创建时间，存入数据库时需要 */
    @ApiModelProperty(hidden = true)
    private Timestamp createTime;

    /** 作废时间，存入数据库时需要 */
    @ApiModelProperty(hidden = true)
    private Date cancelTime;

    /**支付方式*/
    @NotBlank
    private Integer payStatus;
}
