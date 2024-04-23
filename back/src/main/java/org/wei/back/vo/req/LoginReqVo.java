package org.wei.back.vo.req;

import lombok.Data;

/**
 * @Author Liuchuwei
 * @Date 2024-04-22 19:57
 * @Description: packaging post message when user login
 */
@Data
public class LoginReqVo {

    /**
     * username
     */
    private String username;
    /**
     * password
     */
    private String password;

}
