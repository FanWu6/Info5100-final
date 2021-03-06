package com.neu.infofinal.mapper;

import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.EmployeeExample;
import com.neu.infofinal.bean.UserAccount;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> selectCondition(@Param("example") EmployeeExample example, @Param("fields") String fields);
    
    List<Employee> queryuseraccount();
}