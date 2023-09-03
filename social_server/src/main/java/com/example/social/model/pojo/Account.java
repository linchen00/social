package com.example.social.model.pojo;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class Account {
    private int id;
    private String uin;
    private int state;
    private Timestamp createTimestamp;
}
