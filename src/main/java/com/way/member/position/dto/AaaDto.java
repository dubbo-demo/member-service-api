package com.way.member.position.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString(callSuper = true)
public class AaaDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<PositionInfoDto> positionInfoDtos;
}
