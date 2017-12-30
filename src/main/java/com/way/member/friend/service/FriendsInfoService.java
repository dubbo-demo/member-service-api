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
     * @param friendPhoneNoList
     * @param state
     */
    void updateIsCheckBeforeExitByFriendPhoneNos(String phoneNo, List<String> friendPhoneNoList, Integer state);

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

    /**
     * 修改好友信息
     * @param phoneNo
     * @param dto
     */
    void modifyFriendInfo(String phoneNo, FriendsInfoDto dto);

    /**
     * 修改被授权人好友信息
     * @param phoneNo
     * @param dto
     */
    void modifyAuthorizedFriendInfo(String phoneNo, FriendsInfoDto dto);

    /**
     * 删除好友
     * @param phoneNo
     * @param friendPhoneNo
     */
    void deleteFriend(String phoneNo, String friendPhoneNo);

    /**
     * 根据组ID获取好友信息
     * @param groupId
     * @return
     */
    List<FriendsInfoDto> getFriendListByGroupId(String groupId);

    /**
     * 将好友组信息清空
     * @param phoneNo
     * @param groupId
     */
    void updateFriendsGroupInfo(String phoneNo, String groupId);

    /**
     * 将好友添加到分组
     * @param friendPhoneNo
     * @param groupInfoDto
     */
    void moveFriendToGroup(String friendPhoneNo, GroupInfoDto groupInfoDto);

    /**
     * 将好友从分组中移除
     * @param phoneNo
     * @param friendPhoneNo
     * @return
     */
    ServiceResult<Object> removeFriendFromGroup(String phoneNo, String friendPhoneNo);

    /**
     * 添加好友
     * @param dto
     */
    ServiceResult<Object> addFriendInfo(FriendsInfoDto dto);

    /**
     * 查询是否被好友授权可见
     * @param phoneNo
     * @param friendPhoneNo
     * @return
     */
    FriendsInfoDto checkIsAuthorizedVisible(String phoneNo, String friendPhoneNo);

    /**
     * 设置好友为退出前可见
     * @param phoneNo
     * @param setVisibleFriendsList
     * @param setInvisibleFriendsList
     */
    void setFriendsVisibleBeforeExiting(String phoneNo, List<String> setVisibleFriendsList, List<String> setInvisibleFriendsList);

}
