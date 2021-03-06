package com.way.member.friend.service;

import com.way.common.result.ServiceResult;
import com.way.member.friend.dto.FriendsInfoDto;
import com.way.member.friend.dto.GroupInfoDto;

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
     * @param invitationCode
     * @return
     */
    List<FriendsInfoDto> getFriendsInfoBeforeExit(String invitationCode);

    /**
     * 根据组ID获取好友信息
     * @param phoneNo
     * @param groupId
     * @return
     */
    List<FriendsInfoDto> getRealtimePositionByGroupId(String phoneNo, String groupId);

    /**
     * 更新好友是否退出前查看状态
     * @param invitationCode
     * @param groupId
     * @param state
     */
    void updateIsCheckBeforeExitByGroupId(String invitationCode, String groupId, Integer state);

    /**
     * 取消查看好友实时坐标
     * @param invitationCode
     * @param friendInvitationCodes
     * @param state
     */
    void updateIsCheckBeforeExitByFriendPhoneNos(String invitationCode, List<String> friendInvitationCodes, Integer state);

    /**
     * 查询好友信息
     * @param invitationCode
     * @param friendInvitationCode
     * @return
     */
    ServiceResult<FriendsInfoDto> getFriendInfo(String invitationCode, String friendInvitationCode);

    /**
     * 查询好友列表
     * @param invitationCode
     * @return
     */
    List<FriendsInfoDto> getFriendList(String invitationCode);

    /**
     * 修改好友信息
     * @param invitationCode
     * @param dto
     */
    void modifyFriendInfo(String invitationCode, FriendsInfoDto dto);

    /**
     * 修改被授权人好友信息
     * @param phoneNo
     * @param dto
     */
    void modifyAuthorizedFriendInfo(String phoneNo, FriendsInfoDto dto);

    /**
     * 删除好友
     * @param invitationCode
     * @param friendInvitationCode
     */
    void deleteFriend(String invitationCode, String friendInvitationCode);

    /**
     * 根据组ID获取好友信息
     * @param groupId
     * @return
     */
    List<FriendsInfoDto> getFriendListByGroupId(String groupId);

    /**
     * 将好友组信息清空
     * @param invitationCode
     * @param groupId
     */
    void updateFriendsGroupInfo(String invitationCode, String groupId);

    /**
     * 将好友添加到分组
     * @param friendInvitationCodes
     * @param groupInfoDto
     */
    void moveFriendToGroup(String friendInvitationCodes, GroupInfoDto groupInfoDto);

    /**
     * 将好友从分组中移除
     * @param invitationCode
     * @param friendInvitationCodes
     * @return
     */
    ServiceResult<Object> removeFriendFromGroup(String invitationCode, String friendInvitationCodes);

    /**
     * 添加好友
     * @param dto
     */
    ServiceResult<Object> addFriendInfo(FriendsInfoDto dto);

    /**
     * 查询是否被好友授权可见
     * @param invitationCode
     * @param friendInvitationCode
     * @return
     */
    FriendsInfoDto checkIsAuthorizedVisible(String invitationCode, String friendInvitationCode);

    /**
     * 设置好友为退出前可见
     * @param invitationCode
     * @param setInvisibleFriendsList
     * @param setVisibleFriendsList
     */
    void setFriendsVisibleBeforeExiting(String invitationCode, List<String> setInvisibleFriendsList, List<String> setVisibleFriendsList);

}
