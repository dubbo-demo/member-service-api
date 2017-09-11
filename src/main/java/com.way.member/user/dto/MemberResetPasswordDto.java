package com.way.member.user.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @ClassName: MemberResetPasswordFailVO
 * @Description: 记录用户重置密码信息
 * @author: xinpei.xu
 * @date: 2017/08/17 22:01
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MemberResetPasswordDto extends BaseEntity {

	private static final long serialVersionUID = -8135079050909522661L;

	/** 重置密码失败次数 */
	private int resetPasswordFailTimes;
	/** 最后一次重置密码失败时间 */
	private long lastResetPasswordFailTime;
	/** 当前密码 */
	private String curPasssword;
	/** 新登录密码 */
	private String newPassword;
	/** 会员编号 */
	private Long memberId;
}
