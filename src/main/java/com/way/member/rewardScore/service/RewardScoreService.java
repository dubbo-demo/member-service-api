package com.way.member.rewardScore.service;

import com.way.member.rewardScore.dto.RewardScoreDto;

import java.util.List;

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

    /**
     * 查询总页数
     * @param phoneNo
     * @return
     */
    Integer getRewardScoreDetailCount(String phoneNo);

    /**
     * 分页查询
     * @param phoneNo
     * @param pageNumber
     * @return
     */
    List<RewardScoreDto> getRewardScoreDetailList(String phoneNo, Integer pageNumber);
}
