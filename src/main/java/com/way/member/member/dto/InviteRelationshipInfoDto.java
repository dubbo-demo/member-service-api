package com.way.member.member.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName: InviteRelationshipInfoDto
 * @Description: 邀请码关系信息Dto
 * @author: xinpei.xu
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class InviteRelationshipInfoDto extends BaseEntity {

    private static final long serialVersionUID = 6897486258202620677L;

    private String invitationCode; // 自己的邀请码

    private String nextLevelInvitationCode; // 下一级用户邀请码

    private String underNextLevelInvitationCode; // 下下级用户邀请码

}
