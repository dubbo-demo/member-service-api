package com.way.member.friend.service;

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
}
