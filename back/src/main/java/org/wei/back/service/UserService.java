package org.wei.back.service;
import org.wei.back.pojo.entity.SysUser;
import org.wei.back.vo.req.LoginReqVo;
import org.wei.back.vo.resp.LoginRespVo;
import org.wei.back.vo.resp.R;

/**
 * @Author Liuchuwei
 * @Date 2024-04-22 21:12
 * @Description:定义操纵用户的服务接口
 */

public interface UserService {

    SysUser getUserByUserName(String userName);

    /**
     * 用户登录功能
     * @param reqVo
     * @return
     */
    R<LoginRespVo> login(LoginReqVo reqVo);

}
