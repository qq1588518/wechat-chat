package com.redrock.wechatchat.netty.been;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String nickname;
    private String openid;
    private String headUrl;
}
