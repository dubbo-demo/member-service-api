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
     * @param invitationCode
     * @return
     */
    Integer getRechargeInfoCount(String invitationCode);

    /**
     * 分页查询
     * @param invitationCode
     * @param pageNumber
     * @return
     */
    List<RechargeInfoDto> getRechargeInfoList(String invitationCode, int pageNumber);

    /**
     * 更新充值记录表
     * @param dto
     */
    void addRechargeInfoDto(RechargeInfoDto dto);
}
