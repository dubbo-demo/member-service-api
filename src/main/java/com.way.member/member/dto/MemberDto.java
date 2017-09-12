package com.way.member.member.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
	/** 会员手机号 */
	private String phone;
	/** 会员密码 */
	private String password;
	/** 员工编号 */
	private String employeeId;
	/** 设备号 */
	private String deviceNo;
	/** 版本号 */
	private String version;
	/** 推广渠道来源 */
	private String promotionSource;
	/** 终端渠道 */
	private String terminalChannel;
	/** app应用渠道 */
	private String appSource;
	/** 经度 */
	private String lng;
	/** 纬度 */
	private String lat;
	/** 图片验证码 */
	private String imgCode;
	/** 发送短信验证码类型 */
	private String type;
	/** 短信验证码 */
	private String verificationCode;
	/** 老客户  线下老会员-1 */
	private String memberType;
	/** 会员编号 */
	private Long memberId;
	/** 登录IP */
	private String sIp;
	/** 城市 */
	private String city;
	/** token */
	private String token;
	/** 客户来源 0:线下 1:App*/
	private int memberSource;
	/** 用户头像 */
	private String headPhoto;
	/** 资料完善度 */
	private String dataCompletValues;
	/** 资料明细完成步骤 */
	private String datadetailcompletvalues;
	/** 身份证号 **/
	private String idCarNo;
}