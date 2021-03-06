package com.way.member.withdrawal.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 功能描述：提现信息Dto
 *
 * @Author：xinpei.xu
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class WithdrawalInfoDto extends BaseEntity {

    private static final long serialVersionUID = 4853860207056454943L;

    private String bankName;// 银行名称

    private String bankNumber;// 银行卡号

    private String name;// 开户人姓名

    private String bankBranch;// 开户行支行

    private Double rewardScore;// 积分

    private String remark;// 备注

    private Integer status;// 状态 0:待处理,1:提醒成功,2:提现失败

    private String invitationCode;// 邀请码

}
