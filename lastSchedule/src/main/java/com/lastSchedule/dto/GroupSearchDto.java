package com.lastSchedule.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GroupSearchDto {
    private String group_searchDateType;
    private String group_searchBy;
    private String group_searchQuery;
    private String group_searchGroupName;
    private String group_searchMember;

    private Long groupId;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
