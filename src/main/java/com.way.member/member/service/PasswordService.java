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
     * @return 会员ID
     * @Description:注册接口
     */
	Long savePasswordInfo(MemberDto memberDto);
	
	/**
	 * @Title: queryCurPasswdById
	 * @Description: 查询当前登录密码是否正确
	 * @return: String 返回mobile
	 */
	public ServiceResult<String> queryCurPasswdById(Long memberId, String curPasssword);
	
	/**
	 * @Title: queryPasswdById
	 * @Description: 根据会员编号查询信息
	 * @return: String 返回会员编号
	 */
	public ServiceResult<String> queryPasswdById(Long memberId);
}
