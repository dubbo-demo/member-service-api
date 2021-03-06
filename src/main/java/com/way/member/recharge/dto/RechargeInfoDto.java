package com.way.member.recharge.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RechargeInfoDto extends BaseEntity {

    private static final long serialVersionUID = -1199323993803169292L;

    private String invitationCode;// 邀请码

    private String type;// 增值服务类型:0:购买会员,1:轨迹回放,2:电子围栏

    private Double amount;// 金额

    private Integer status;// 状态 0:待处理,1:成功,2:失败

    private String orderNumber;
}
