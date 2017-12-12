package com.way.member.recharge.service;

import com.way.member.recharge.dto.RechargeInfoDto;

import java.util.List;

/**
 * 功能描述：充值Service
 *
 * @Author：xinpei.xu
 */
public interface RechargeInfoService {

    /**
     * 查询总页数
     * @param phoneNo
     * @return
     */
    Integer getRechargeInfoCount(String phoneNo);

    /**
     * 分页查询
     * @param phoneNo
     * @param pageNumber
     * @return
     */
    List<RechargeInfoDto> getRechargeInfoList(String phoneNo, int pageNumber);
}
