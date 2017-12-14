package com.way.member.order.service;

import com.way.member.order.dto.MemberOrderInfoDto;

/**
 * 功能描述：用户订单信息Service
 *
 * @Author：xinpei.xu
 */
public interface MemberOrderInfoService {

    /**
     * 保存订单信息
     * @param memberOrderInfoDto
     */
    void saveMemberOrderInfo(MemberOrderInfoDto memberOrderInfoDto);
}
