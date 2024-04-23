package org.wei.back.pojo.mapper;

import org.wei.back.pojo.entity.StockBusiness;

/**
* @author liuch
* @description 针对表【stock_business(主营业务表)】的数据库操作Mapper
* @createDate 2024-04-22 21:56:47
* @Entity org.wei.back.pojo.entity.StockBusiness
*/
public interface StockBusinessMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StockBusiness record);

    int insertSelective(StockBusiness record);

    StockBusiness selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StockBusiness record);

    int updateByPrimaryKey(StockBusiness record);

}
