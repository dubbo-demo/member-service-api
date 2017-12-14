package com.way.member.order.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 功能描述：用户订单信息Dto
 *
 * @Author：xinpei.xu
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MemberOrderInfoDto extends BaseEntity {

    private static final long serialVersionUID = -8683643003380188825L;

    private String orderNumber;// 订单编号

    private String phoneNo;// 手机号

    private Integer type;// 增值服务类型:0:购买会员,1:轨迹回放,2:电子围栏

    private Integer validityDurationType;// 会员有效期类型 1:一个季度,2:半年,3:一年

    private Double amount;// 金额

    private Integer status;// 状态 0:待处理,1:成功,2:失败
}
