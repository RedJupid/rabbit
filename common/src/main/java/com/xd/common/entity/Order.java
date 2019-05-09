package com.xd.common.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {


    private static final long serialVersionUID = -6628788496491984509L;

    private String id;

    private String name;

    private String messageId; //存储消息发送的唯一标识

}
