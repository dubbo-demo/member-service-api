package com.way.member.position.service;

import com.way.common.result.ServiceResult;
import com.way.member.position.dto.PositionInfoDto; /**
 * 功能描述：定位信息Service
 *
 * @Author：xinpei.xu
 * @Date：2017/08/28 21:09
 */
public interface PositionInfoService {

    /**
     * 上传坐标
     * @param positionInfoDto
     */
    void savePosition(PositionInfoDto positionInfoDto);

    /**
     * 更新用户坐标
     * @param positionInfoDto
     * @param id
     */
    void updatePosition(PositionInfoDto positionInfoDto, Integer id);

    /**
     * 根据手机号获取用户实时坐标
     * @param phoneNo
     * @return
     */
    ServiceResult<PositionInfoDto> getRealtimePositionByPhoneNo(String phoneNo);
}
