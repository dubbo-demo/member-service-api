package com.way.member.member.service;

import com.way.common.result.ServiceResult;
import com.way.member.member.dto.MemberDto;
import com.way.member.valueAdded.dto.MemberValueAddedInfoDto;
import com.way.member.withdrawal.dto.WithdrawalInfoDto;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: MemberService
 * @Description: 会员登录Service
 * @author: xinpei.xu
 * @date: 2017/08/20 21:31
 *
 */
public interface MemberInfoService {

	/**
	 *
	 * @param memberDto
	 * @return 会员Dto
	 * @Description:保存用户信息
	 */
	void saveMemberInfo(MemberDto memberDto);

	/**
	 * @Title: loadMapByMobile
	 * @Description: 根据手机号查询用户信息
	 * @return: Map<String,Object>
	 */
	ServiceResult<MemberDto> loadMapByMobile(String phoneNo);

	/**
	 * @Title: queryMemberInfo
	 * @Description: 根据手机号查询会员信息
	 * @return: ServiceResult<MemberDto>
	 */
	public ServiceResult<MemberDto> queryMemberInfo(String phoneNo);


	/**
	 * @Title: updatePassword
	 * @Description: 修改密码
	 * @return: void
	 */
	public void updatePassword(String invitationCode, String newPassword);

	/**
	 * 用户注册数据保存
	 * @param memberDto
	 * @param invitationCode
	 * @param nextLevelInvitationCode
	 * @return
	 */
	public void memberRegist(MemberDto memberDto, String invitationCode, String nextLevelInvitationCode);

	/**
	 * 根据手机号更新用户头像id
	 * @param invitationCode
	 * @param headPicId
	 */
	void updateHeadPicIdByInvitationCode(String invitationCode, String headPicId);

	/**
	 * 根据手机号搜索用户
	 * @param phoneNo
	 * @return
	 */
	ServiceResult<MemberDto> searchUserByPhoneNo(String phoneNo);

	/**
	 * 查看个人信息
	 * @param invitationCode
	 * @return
	 */
	ServiceResult<MemberDto> getMemberInfo(String invitationCode);

	/**
	 * 修改个人信息
	 * @param dto
	 * @return
	 */
	ServiceResult<Object> modifyMemberInfo(MemberDto dto);

	/**
	 * 积分购买会员
	 * @param phoneNo
	 * @param memberDto
	 * @param rewardScore
	 * @param startTime
	 * @param endTime
	 * @param name
	 */
	void buyMemberByRewardScore(String phoneNo, MemberDto memberDto, Double rewardScore, Date startTime, Date endTime, String name);

	/**
	 * 积分购买增值服务
	 * @param phoneNo
	 * @param memberDto
	 * @param rewardScore
	 * @param startTime
	 * @param endTime
	 * @param name
	 * @param type
	 * @param memberValueAddedInfoDto
	 */
	void buyValueAddedServiceByRewardScore(String phoneNo, MemberDto memberDto, Double rewardScore, Date startTime, Date endTime, String name, String type, MemberValueAddedInfoDto memberValueAddedInfoDto);

	/**
	 * 积分转增
	 * @param invitationCode
	 * @param rewardScore
	 * @param friendInvitationCode
	 * @param phoneNo
	 * @param friendPhoneNo
	 */
	void transferRewardScoreToFriend(String invitationCode, Double rewardScore, String friendInvitationCode, String phoneNo, String friendPhoneNo);

	/**
	 * 积分提现
	 * @param withdrawalInfoDto
	 */
	void withdrawalRewardScore(WithdrawalInfoDto withdrawalInfoDto);

	/**
	 * 查询总页数
	 * @param invitationCode
	 * @return
	 */
	Integer getWithdrawalRewardScoreCount(String invitationCode);

	/**
	 * 获取积分提现记录
	 * @param invitationCode
	 * @param pageNumber
	 * @return
	 */
	List<WithdrawalInfoDto> getWithdrawalRewardScoreInfo(String invitationCode, int pageNumber);

	/**
	 * 充值购买会员/增值服务
	 * @param phoneNo
	 * @param type
	 * @param memberDto
	 * @param amount
	 * @param startTime
	 * @param endTime
	 * @param name
	 */
	void buyServiceByRecharge(String phoneNo, String type, MemberDto memberDto, Double amount, Date startTime, Date endTime, String name);

	/**
	 * 根据邀请码查邀请人信息
	 * @param invitationCode
	 * @return
	 */
	ServiceResult<MemberDto> loadMapByInvitationCode(String invitationCode);
}
