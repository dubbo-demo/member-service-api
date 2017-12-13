package com.way.member.valueAdded.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @Description: 用户增值服务信息Dto
 * @author: xinpei.xu
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MemberValueAddedInfoDto extends BaseEntity {

    private static final long serialVersionUID = 471748461910962534L;

    private String phoneNo;// 手机号

    private Integer type;// 增值服务类型:1:轨迹回放,2:电子围栏

    private Integer isOpen;// 是否开启:1:是,2:否

    private Date startTime;// 开始时间

    private Date endTime;// 结束时间

}
