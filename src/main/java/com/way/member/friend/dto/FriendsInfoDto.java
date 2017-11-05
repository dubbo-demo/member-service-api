package com.way.member.friend.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @ClassName: FriendsInfoDto
 * @Description: 好友信息Dto
 * @author xinpei.xu
 * @date 2017/08/23 19:17
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FriendsInfoDto extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 手机号 */
    private String phoneNo;

    /** 好友手机号 */
    private String friendPhoneNo;

    /** 好友备注名 */
    private String friendRemarkName;

    /** 好友昵称 */
    private String friendNickName;
    
    /** 是否授权可见 1:是,2:否 */
    private Integer isAccreditVisible;

    /** 授权开始时间 */
    private String accreditStartTime;

    /** 授权结束时间 */
    private String accreditEndTime;

    /** 授权日期 */
    private String accreditWeeks;

    /** 是否被授权可见 1:是,2:否 */
    private Integer isAuthorizedVisible;

    /** 被授权开始时间 */
    private String authorizedAccreditStartTime;

    /** 被授权结束时间 */
    private String authorizedAccreditEndTime;

    /** 被授权日期 */
    private String authorizedWeeks;

    /** 组id */
    private String groupId;

    /** 组名称 */
    private String groupName;

    /** 组创建时间 */
    private Date groupCreateTime;

    /** 是否退出前查看 1:是,2:否 */
    private Integer isCheckBeforeExit;

    /** 头像ID */
    private String headPic;

    /** 首字母 */
    private String remarkFirstLetter;

    /** 是否同意，0：申请中、1：是、2：否 */
    private String isApprove;
}
