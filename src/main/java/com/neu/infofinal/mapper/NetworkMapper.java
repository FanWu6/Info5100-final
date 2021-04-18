package com.neu.infofinal.mapper;

import com.neu.infofinal.bean.Network;
import com.neu.infofinal.bean.NetworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetworkMapper {
    long countByExample(NetworkExample example);

    int deleteByExample(NetworkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Network record);

    int insertSelective(Network record);

    List<Network> selectByExample(NetworkExample example);

    Network selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Network record, @Param("example") NetworkExample example);

    int updateByExample(@Param("record") Network record, @Param("example") NetworkExample example);

    int updateByPrimaryKeySelective(Network record);

    int updateByPrimaryKey(Network record);

    List<Network> selectCondition(@Param("example") NetworkExample example, @Param("fields") String fields);
}