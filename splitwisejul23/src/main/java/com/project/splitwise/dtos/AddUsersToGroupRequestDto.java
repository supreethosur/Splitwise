package com.project.splitwise.dtos;

import lombok.Data;

import java.util.List;

@Data
public class AddUsersToGroupRequestDto {
    List<Long> ids;
}
