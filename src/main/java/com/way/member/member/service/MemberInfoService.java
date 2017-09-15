package com.way.member.member.service;

import com.way.common.result.ServiceResult;
import com.way.member.member.dto.MemberDto;

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
	 * @return 会员ID
	 * @Description:注册接口
	 */
	Long saveMemberInfo(MemberDto memberDto);

	/**
	 * @Title: loadMapByMobile
	 * @Description: 根据手机号查询用户信息
	 * @return: Map<String,Object>
	 */
	ServiceResult<MemberDto> loadMapByMobile(String mobile);

	/**
	 * @Title: queryMemberInfo
	 * @Description: 根据手机号查询会员信息
	 * @return: ServiceResult<MemberDto>
	 */
	public ServiceResult<MemberDto> queryMemberInfo(String mobile);

	/**
	 * @Title: saveMemberLoginInfo
	 * @Description: 保存用户登录信息
	 * @return: void
	 */
	public void saveMemberLoginInfo(MemberDto memberDto);

	/**
	 * @Title: updatePassword
	 * @Description: 修改密码
	 * @return: void
	 */
	public void updatePassword(Long memberId, String newPassword);

	/**
	 * 用户注册数据保存
	 * @param memberDto
	 * @return
	 */
	public ServiceResult<MemberDto> memberRegist(MemberDto memberDto);

	/**
	 * 根据手机号更新用户头像id
	 * @param phoneNo
	 * @param headPicId
	 */
	void updateHeadPicIdByPhoneNo(String phoneNo, String headPicId);
}
