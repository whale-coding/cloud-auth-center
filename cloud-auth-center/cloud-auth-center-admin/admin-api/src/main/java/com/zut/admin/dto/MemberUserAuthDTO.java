package com.zut.admin.dto;

import lombok.Data;

import java.util.List;

/**
 * @Date 2023-03-09 11:06 星期四
 * @Author: 聂建强
 * @Description:
 */
@Data
public class MemberUserAuthDTO {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态：1-有效；0-禁用
     */
    private Integer status;

    /**
     * 用户角色编码集合 ["ROOT","ADMIN"]
     */

    private List<String> roles;
}
