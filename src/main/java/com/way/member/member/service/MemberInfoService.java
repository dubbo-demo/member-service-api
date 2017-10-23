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
	public void updatePassword(String phoneNo, String newPassword);

	/**
	 * 用户注册数据保存
	 * @param memberDto
	 * @return
	 */
	public void memberRegist(MemberDto memberDto);

	/**
	 * 根据手机号更新用户头像id
	 * @param phoneNo
	 * @param headPicId
	 */
	void updateHeadPicIdByPhoneNo(String phoneNo, String headPicId);

	/**
	 * 根据手机号搜索用户
	 * @param phoneNo
	 * @return
	 */
	ServiceResult<MemberDto> searchUserByPhoneNo(String phoneNo);

	/**
	 * 查看个人信息
	 * @param phoneNo
	 * @return
	 */
	ServiceResult<MemberDto> getMemberInfo(String phoneNo);

	/**
	 * 修改个人信息
	 * @param dto
	 * @return
	 */
	ServiceResult<Object> modifyMemberInfo(MemberDto dto);
}
