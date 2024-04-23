package org.wei.back.vo.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * @Author Liuchuwei
 * @Date 2024-04-22 19:59
 * @Description: packaging response message
 */

public class LoginRespVo {
    /**
     * user ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    /**
     * phone
     */
    private String phone;
    /**
     * username
     */
    private String username;
    /**
     * nickName
     */
    private String nickName;

}
