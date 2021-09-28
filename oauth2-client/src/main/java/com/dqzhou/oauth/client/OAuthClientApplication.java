package com.dqzhou.oauth.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * 单点登录服务客户端
 *
 * @Author: ZhouDongqi
 * @Create 2021/9/28 下午3:52
 **/
@EnableOAuth2Sso
@SpringBootApplication
public class OAuthClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuthClientApplication.class, args);
    }

}
