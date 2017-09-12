package com.way.member.member.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName: MemberLoginFailInfoVO
 * @Description: 记录用户登录失败信息
 * @author xinpei.xu
 * @date 2017/08/20 19:31
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MemberLoginFailInfoDto extends BaseEntity {
	/**  */
	private static final long serialVersionUID = 1L;

	/** 登录失败次数 */
	private int loginFailTimes;
	/** 最后一次登录失败时间 */
	private long lastLoginFailTime;
}
