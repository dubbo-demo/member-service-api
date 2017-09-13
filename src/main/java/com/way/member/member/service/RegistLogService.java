package com.way.member.member.service;

import com.way.member.member.dto.MemberDto;

/**
 * @ClassName: MemberService
 * @Description: 会员注册日志Service
 * @author xinpei.xu
 * @date 2017/08/19 19:54
 * 
 */
public interface RegistLogService {
	
	/**
     * 
     * @param memberDto
     * @return 会员ID
     * @Description:注册接口
     */
	Long saveRegistLog(MemberDto memberDto);
}
