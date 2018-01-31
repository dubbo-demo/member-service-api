package com.way.member.friend.service;

import com.way.common.result.ServiceResult;
import com.way.member.friend.dto.GroupInfoDto;

import java.util.List;

/**
 * @ClassName: GroupInfoService
 * @Description: 组信息Service
 * @author xinpei.xu
 * @date 2017/08/29 21:17
 *
 */
public interface GroupInfoService {

    /**
     * 新建组
     * @param invitationCode
     * @param groupName
     * @return
     */
    ServiceResult<Object> addGroupInfo(String invitationCode, String groupName);

    /**
     * 查出组信息
     * @param groupId
     * @return
     */
    GroupInfoDto getGroupInfo(String groupId);

    /**
     * 修改组信息
     * @param dto
     */
    void modifyGroupInfo(GroupInfoDto dto);

    /**
     * 删除组信息
     * @param groupId
     */
    void deleteGroupInfo(String groupId);

    /**
     * 查询组信息
     * @param invitationCode
     * @return
     */
    List<GroupInfoDto> getGroupInfoListByInvitationCode(String invitationCode);
}
