package com.bobby.protobuf.javabean;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class User {

    private int id;
    private String code;
    private String name;
    private NickName nickName;
    private List<String> strList;
    private List<Role> roleList;
    private Map<String,String> map;
    private Map<String,MapVauleObject> mapObject;

}
