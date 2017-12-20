package com.way.member.withdrawal.service;

import com.way.member.withdrawal.dto.WithdrawalInfoDto;

import java.util.List;

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

    /**
     * 查询总页数
     * @param phoneNo
     * @return
     */
    Integer getWithdrawalRewardScoreCount(String phoneNo);

    /**
     * 获取积分提现记录
     * @param phoneNo
     * @param pageNumber
     * @return
     */
    List<WithdrawalInfoDto> getWithdrawalRewardScoreInfo(String phoneNo, int pageNumber);
}
