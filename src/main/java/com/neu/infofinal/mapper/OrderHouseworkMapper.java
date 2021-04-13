package com.neu.infofinal.mapper;

import com.neu.infofinal.bean.OrderHousework;
import com.neu.infofinal.bean.OrderHouseworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHouseworkMapper {
    long countByExample(OrderHouseworkExample example);

    int deleteByExample(OrderHouseworkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderHousework record);

    int insertSelective(OrderHousework record);

    List<OrderHousework> selectByExample(OrderHouseworkExample example);

    OrderHousework selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderHousework record, @Param("example") OrderHouseworkExample example);

    int updateByExample(@Param("record") OrderHousework record, @Param("example") OrderHouseworkExample example);

    int updateByPrimaryKeySelective(OrderHousework record);

    int updateByPrimaryKey(OrderHousework record);

    List<OrderHousework> selectCondition(@Param("example") OrderHouseworkExample example, @Param("fields") String fields);
}