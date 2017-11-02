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
     * 增加被申请记录
     * @param phoneNo
     * @param friendPhoneNo
     * @param applyInfo
     */
    void applyForAddFriend(String phoneNo, String friendPhoneNo, String applyInfo);

    /**
     * 获取被申请好友记录
     * @param phoneNo
     * @return
     */
    List<FriendsInfoDto> getApplicationRecordOfFriend(String phoneNo);

    /**
     * 同意/拒绝添加好友申请
     * @param phoneNo
     * @param friendPhoneNo
     * @param isApprove
     * @param applicationId
     * @return
     */
    ServiceResult<Object> agreeToAddFriend(String phoneNo, String friendPhoneNo, String isApprove, String applicationId);
}