package com.junfeng.tobacco.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * AllTableMapper
 */
@Mapper
public interface AllTableMapper {

    List<String> selectAllTableName () throws Exception;

}
