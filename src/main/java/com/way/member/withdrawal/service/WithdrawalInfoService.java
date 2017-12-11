package com.way.member.withdrawal.service;

import com.way.member.withdrawal.dto.WithdrawalInfoDto;

/**
 * 功能描述：提现信息Service
 *
 * @Author：xinpei.xu
 */
public interface WithdrawalInfoService {

    /**
     * 增加积分提现记录
     * @param withdrawalInfoDto
     */
    void withdrawalRewardScore(WithdrawalInfoDto withdrawalInfoDto);

}
