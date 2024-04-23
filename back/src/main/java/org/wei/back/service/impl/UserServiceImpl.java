package org.wei.back.service.impl;

import org.wei.back.pojo.entity.SysUser;
import org.wei.back.pojo.mapper.SysUserMapper;
import org.springframework.stereotype.Service;
import org.wei.back.service.UserService;
import org.wei.back.vo.req.LoginReqVo;
import org.wei.back.vo.resp.LoginRespVo;
import org.wei.back.vo.resp.R;
import org.wei.back.vo.resp.ResponseCode;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author Liuchuwei
 * @Date 2024-04-22 21:23
 * @Description:
 */

@Service("userService")
public class UserServiceImpl implements UserService {


    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    @Override
    public SysUser getUserByUserName(String userName) {
        SysUser user = new SysUser();
        user.setUsername(userName);
        return user;
    }

    @Override
    public R<LoginRespVo> login(LoginReqVo reqVo) {
        //判断输入参数的合法性
        if (reqVo==null || StringUtils.isBlank(reqVo.getUsername()) || StringUtils.isBlank(reqVo.getPassword())) {
            return R.error(ResponseCode.USERNAME_OR_PASSWORD_ERROR);
        }
        //根据用户名查询用户信息
//        SysUser dbUser = SysUserMapper.getUserByUserName(reqVo.getUsername());

        //构建响应相对
        //我们发现respVo与dbUser下具有相同的属性，所以直接复制即可

        return null;
    }
}
