package com.way.member.valueAdded.service;

import com.way.member.valueAdded.dto.MemberValueAddedInfoDto;

/**
 * @Description: 用户增值服务信息Service
 * @author: xinpei.xu
 */
public interface MemberValueAddedInfoService {

    /**
     * 根据增值服务类型获取用户增值服务信息
     *
     * @param invitationCode
     * @param type
     * @return
     */
    MemberValueAddedInfoDto getMemberValueAddedInfoByType(String invitationCode, String type);

    /**
     * 新增用户增值服务信息
     * @param memberValueAddedInfoDto
     */
    void saveMemberValueAddedInfo(MemberValueAddedInfoDto memberValueAddedInfoDto);

    /**
     * 更新用户增值服务信息
     * @param memberValueAddedInfoDto
     */
    void updateMemberValueAddedInfo(MemberValueAddedInfoDto memberValueAddedInfoDto);
}
