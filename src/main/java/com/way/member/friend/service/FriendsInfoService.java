package com.way.member.friend.service;

import com.way.common.result.ServiceResult;
import com.way.member.friend.dto.FriendsInfoDto;

import java.util.List;

/**
 * @ClassName: FriendsInfoService
 * @Description: 好友信息Service
 * @author xinpei.xu
 * @date 2017/08/23 19:12
 *
 */
public interface FriendsInfoService {

    /**
     * 出退出前查看的好友信息
     * @param phoneNo
     * @return
     */
    List<FriendsInfoDto> getFriendsInfoBeforeExit(String phoneNo);

    /**
     * 根据组ID获取好友信息
     * @param phoneNo
     * @param groupId
     * @return
     */
    List<FriendsInfoDto> getRealtimePositionByGroupId(String phoneNo, String groupId);

    /**
     * 更新好友是否退出前查看状态
     * @param phoneNo
     * @param groupId
     * @param state
     */
    void updateIsCheckBeforeExitByGroupId(String phoneNo, String groupId, Integer state);

    /**
     * 取消查看好友实时坐标
     * @param phoneNo
     * @param friendPhoneNo
     * @param state
     */
    void updateIsCheckBeforeExitByFriendPhoneNo(String phoneNo, String friendPhoneNo, Integer state);

    /**
     * 查询好友信息
     * @param phoneNo
     * @param friendPhoneNo
     * @return
     */
    ServiceResult<FriendsInfoDto> getFriendInfo(String phoneNo, String friendPhoneNo);

    /**
     * 查询好友列表
     * @param phoneNo
     * @return
     */
    List<FriendsInfoDto> getFriendList(String phoneNo);

}
