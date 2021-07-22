package cn.hulingfeng.mapper;

import cn.hulingfeng.domain.Role;
import cn.hulingfeng.domain.RoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * RoleMapper继承基类
 */
@Mapper
@Repository
public interface RoleMapper extends MyBatisBaseDao<Role, Integer, RoleExample> {
}