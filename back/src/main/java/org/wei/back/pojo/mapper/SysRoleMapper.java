package org.wei.back.pojo.mapper;

import org.wei.back.pojo.entity.SysRole;

/**
* @author liuch
* @description 针对表【sys_role(角色表)】的数据库操作Mapper
* @createDate 2024-04-22 21:56:47
* @Entity org.wei.back.pojo.entity.SysRole
*/
public interface SysRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

}
