package org.wei.back.pojo.mapper;

import org.wei.back.pojo.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
* @author liuch
* @description 针对表【sys_user(用户表)】的数据库操作Mapper
* @createDate 2024-04-22 21:56:47
* @Entity org.wei.back.pojo.entity.SysUser
*/
public interface SysUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 根据用户名查询用户信息
     *
     * @param userName
     * @return
     */
    SysUser getUserByUserName(@Param("userName") String userName);
}
