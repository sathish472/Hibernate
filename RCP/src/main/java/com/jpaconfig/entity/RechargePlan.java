package com.jpaconfig.entity;

import lombok.Data;

@Data
public class RechargePlan {
    private  int planNo;
    private String planName;
    private String description;
    private String circle;
    private int validityDays;
    private double rechargeAmount;
}
