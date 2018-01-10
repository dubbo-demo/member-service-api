package com.way.member.position.service;

import com.way.common.result.ServiceResult;
import com.way.member.position.dto.PositionInfoDto;

import java.util.List;

/**
 * 功能描述：定位信息Service
 *
 * @Author：xinpei.xu
 * @Date：2017/08/28 21:09
 */
public interface PositionInfoService {

    /**
     * 上传坐标
     * @param positionInfoDto
     * @param flag
     */
    void savePosition(PositionInfoDto positionInfoDto, String flag);

    /**
     * 更新用户坐标
     * @param positionInfoDto
     * @param id
     */
    void updatePosition(PositionInfoDto positionInfoDto, Long id);

    /**
     * 根据手机号获取用户实时坐标
     *
     * @param phoneNo
     * @param modifyTime
     * @return
     */
    ServiceResult<PositionInfoDto> getRealtimePositionByPhoneNo(String phoneNo, String modifyTime);

    /**
     * 查询用户历史轨迹坐标
     * @param phoneNo
     * @param startTime
     * @param endTime
     * @return
     */
    List<PositionInfoDto> getMemberHistoryPositions(String phoneNo, String startTime, String endTime);
}
