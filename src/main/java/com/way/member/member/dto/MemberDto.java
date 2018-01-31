package com.way.member.member.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @ClassName: MemberDto
 * @Description: 会员信息Dto
 * @author: xinpei.xu
 * @date: 2017/08/17 22:09
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MemberDto extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	private String token;
	/** 版本号 */
	private String version;
	/** 设备号 */
	private String deviceNo;
	/** 图片验证码 */
	private String imgCode;
	/** 短信验证码 */
	private String verificationCode;
	/** 发送短信验证码类型 */
	private String type;
	/** 会员密码 */
	private String password;
	/** 客户手机号 */
	private String phoneNo;
	/** 客户姓名 */
	private String nickName;
	/** 昵称拼音 */
	private String nickSpell;
	/** 性别1男,2女 */
	private String gender;
	/** 会员类型 1:非会员,2:正式会员,3:试用期会员 */
	private String memberType;
	/** 是否开通轨迹回放服务1是,2否,3试用 */
	private String trajectoryService;
	/** 是否开通电子围栏服务1是,2否,3试用 */
	private String fenceService;
	/** 年龄 */
	private String age;
	/** 头像ID */
	private String headPic;
	/** 会员开始时间 */
	private Date memberStartTime;
	/** 会员结束时间 */
	private Date memberEndTime;
	/** 积分 */
	private Double rewardScore;
	/** 邀请码 */
	private String invitationCode;
	/** 是否为好友*/
	private String isFriend;
	/** 下级数 */
	private Integer nextLevelCount;
	/** 下下级数 */
	private Integer underNextLevelCount;

}