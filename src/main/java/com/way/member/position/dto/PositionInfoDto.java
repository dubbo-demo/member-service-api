package com.way.member.position.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 功能描述：定位信息Dto
 *
 * @Author：xinpei.xu
 * @Date：2017/08/28 22:23
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PositionInfoDto extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String phoneNo;// 手机号

    private String longitude;// 经度

    private String latitude;// 纬度

    private String headPic; // 头像地址

    private String updateTime;// 更新时间
}
