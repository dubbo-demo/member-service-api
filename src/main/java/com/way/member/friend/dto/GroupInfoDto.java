package com.way.member.friend.dto;

import com.way.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @ClassName: GroupInfoDto
 * @Description: 组信息Dto
 * @author xinpei.xu
 * @date 2017/08/29 21:26
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class GroupInfoDto extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 组id */
    private String groupId;

    /** 组名称 */
    private String groupName;

    /** 手机号 */
    private String phoneNo;

    /** 授权开始时间 yyyy-MM-dd HH:mm */
    private String accreditStartTime;

    /** 授权结束时间 yyyy-MM-dd HH:mm */
    private String accreditEndTime;

    /** 是否授权可见 1:是,2:否 */
    private Integer isAccreditVisible;

    /** 授权日期 */
    private String accreditWeeks;

    /** 是否退出前查看 1:是,2:否 */
    private Integer isCheckBeforeExit;

    /** 组好友信息 */
    List<FriendsInfoDto> friends;
}
