package org.wei.back.pojo.mapper;

import org.wei.back.pojo.entity.SysRolePermission;

/**
* @author liuch
* @description 针对表【sys_role_permission(角色权限表)】的数据库操作Mapper
* @createDate 2024-04-22 21:56:47
* @Entity org.wei.back.pojo.entity.SysRolePermission
*/
public interface SysRolePermissionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);

}
