package com.project.splitwise.dtos;

import java.util.List;

import lombok.Data;

@Data
public class AddExpenseRequestDto {
    private double totalAmount;
    private List<Long> paidBy;
    private  List<Double> paidByAmount;
    private List<Long> dividedAmong;
    private Long addedBy;
    private Long groupId;
    private String description;
}


/*
    private int amount;
    private String description;

    @Enumerated(EnumType.ORDINAL)
    private ExpenseType expenseType;

    @ManyToOne
    private User createdBy;

    @ManyToOne
    private Group group;

    @OneToMany(mappedBy = "expense")
    List<expenseUser> expenseUsers;
 */