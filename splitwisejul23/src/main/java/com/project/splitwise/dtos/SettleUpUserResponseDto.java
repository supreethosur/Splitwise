package com.project.splitwise.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SettleUpUserResponseDto {
    String message;
    String status;
    List<String> transactions;
}
