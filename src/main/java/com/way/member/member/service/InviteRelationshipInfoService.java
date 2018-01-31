package com.way.member.member.service;

import com.way.common.result.ServiceResult;
import com.way.member.member.dto.InviteRelationshipInfoDto;

/**
 * @ClassName: InviteRelationshipInfoService
 * @Description: 邀请码关系信息Service
 * @author: xinpei.xu
 *
 */
public interface InviteRelationshipInfoService {

    /**
     * 根据邀请码查出邀请人上级用户邀请码
     * @param invitationCode
     * @return
     */
    ServiceResult<InviteRelationshipInfoDto> queryInviteRelationshipInfoByUnderNextLevelInvitationCode(String invitationCode);

    /**
     * 保存推荐人层级关系
     * @param inviteRelationshipInfoDto
     */
    void addInviteRelationshipInfo(InviteRelationshipInfoDto inviteRelationshipInfoDto);

    /**
     * 查询用户下级用户数
     * @param invitationCode
     * @return
     */
    Integer getNextLevelCount(String invitationCode);

    /**
     * 查询用户下下级用户数
     * @param invitationCode
     * @return
     */
    Integer getUnderNextLevelCount(String invitationCode);
}
