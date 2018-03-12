package com.way.member.friend.service;

import com.way.common.result.ServiceResult;
import com.way.member.friend.dto.FriendsInfoDto;

import java.util.List;

/**
 * @ClassName: ApplyFriendInfoService
 * @Description: 申请好友信息Service
 * @author xinpei.xu
 * @date 2017/09/06 20:17
 *
 */
public interface ApplyFriendInfoService {

    /**
     * 申请添加好友
     * @param invitationCode
     * @param friendInvitationCode
     * @param applyInfo
     */
    void applyForAddFriend(String invitationCode, String friendInvitationCode, String applyInfo);

    /**
     * 获取被申请好友记录
     * @param invitationCode
     * @return
     */
    List<FriendsInfoDto> getApplicationRecordOfFriend(String invitationCode);

    /**
     * 同意/拒绝添加好友申请
     * @param invitationCode
     * @param friendInvitationCode
     * @param isApprove
     * @param applicationId
     * @return
     */
    ServiceResult<Object> agreeToAddFriend(String invitationCode, String friendInvitationCode, String isApprove, String applicationId);
}
