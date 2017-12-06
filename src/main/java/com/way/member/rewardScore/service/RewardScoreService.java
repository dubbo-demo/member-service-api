package com.way.member.rewardScore.service;

import com.way.member.rewardScore.dto.RewardScoreDto;

/**
 * 功能描述：积分Service
 *
 * @Author：xinpei.xu
 * @Date：2017/10/14 10:09
 */
public interface RewardScoreService {

    /**
     * 增加积分记录
     * @param rewardScoreDto
     */
    void saveRewardScore(RewardScoreDto rewardScoreDto);
}
