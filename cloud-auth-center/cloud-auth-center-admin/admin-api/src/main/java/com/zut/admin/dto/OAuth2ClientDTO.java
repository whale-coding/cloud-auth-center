package com.zut.admin.dto;

import lombok.Data;

/**
 * @Date 2023-03-09 10:41 星期四
 * @Author: 聂建强
 * @Description: 客户端DTO
 */
@Data
public class OAuth2ClientDTO {

    /**
     * 客户端ID
     */
    private String clientId;

    /**
     * 客户端密钥
     */
    private String clientSecret;

    /**
     * 资源id列表
     */
    private String resourceIds;

    /**
     * 授权范围
     */
    private String scope;

    /**
     * 授权方式
     */
    private String authorizedGrantTypes;

    /**
     * 回调地址
     */
    private String webServerRedirectUri;

    /**
     * 权限列表
     */
    private String authorities;

    /**
     * 认证令牌时效
     */
    private Integer accessTokenValidity;

    /**
     * 刷新令牌时效
     */
    private Integer refreshTokenValidity;

    /**
     * 扩展信息
     */
    private String additionalInformation;

    /**
     * 是否自动放行
     */
    private String autoapprove;
}
