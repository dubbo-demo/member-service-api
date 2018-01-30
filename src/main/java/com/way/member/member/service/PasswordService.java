package com.way.member.member.service;

import com.way.common.result.ServiceResult;
import com.way.member.member.dto.MemberDto;

/**
 * @ClassName: PasswordService
 * @Description: 会员密码处理类
 * @author xinpei.xu
 * @date 2017/08/19 19:50
 * 
 */
public interface PasswordService {
	
	/**
     * 
     * @param memberDto
     * @return 会员Dto
     * @Description:保存密码
     */
	void savePasswordInfo(MemberDto memberDto);
	
	/**
	 * @Title: checkCurPassword
	 * @Description: 查询当前登录密码是否正确
	 * @return: String 返回mobile
	 */
	public ServiceResult<String> checkCurPassword(String invitationCode, String curPasssword);

}
