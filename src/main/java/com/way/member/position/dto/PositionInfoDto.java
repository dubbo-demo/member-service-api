package com.way.member.position.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 功能描述：定位信息Dto
 *
 * @Author：xinpei.xu
 * @Date：2017/08/28 22:23
 */
@Data
@ToString(callSuper = true)
public class PositionInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String phoneNo;// 手机号

    private String invitationCode;// 邀请码

    private String longitude;// 经度

    private String latitude;// 纬度

    private String headPic; // 头像地址

    private String modifyTime;// 修改时间

    private String isAccreditVisible;// 是否授权可见 1:是,2:否
}
