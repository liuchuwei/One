package org.wei.back.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wei.back.vo.resp.LoginRespVo;

/**
 * @Author Liuchuwei
 * @Date 2024-04-22 19:52
 * @Description: define interface for user login
 */

@RestController
@RequestMapping("/api")
public class UserController {

    /**
     * 根据用户名查询用户信息
     * @param
     * @return
     */
    @GetMapping
    public String hello() {
        return "Hello World";
    }

    /**
     * 用户登录功能
     * @param reqVo
     * @return
     */
    @PostMapping()
    public String hello(@RequestBody LoginRespVo reqVo) {
        return "Hello World";
    }
}
