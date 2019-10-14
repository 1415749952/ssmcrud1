package cn.ccsu.dao;

import cn.ccsu.bean.Emplovee;
import cn.ccsu.bean.EmploveeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmploveeMapper {
    long countByExample(EmploveeExample example);

    int deleteByExample(EmploveeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Emplovee record);

    int insertSelective(Emplovee record);

    List<Emplovee> selectByExample(EmploveeExample example);

    Emplovee selectByPrimaryKey(Integer empId);

    List<Emplovee> selectByExampleWithDepartment(EmploveeExample example);

    Emplovee selectByPrimaryKeyWithDepartment(Integer empId);

    int updateByExampleSelective(@Param("record") Emplovee record, @Param("example") EmploveeExample example);

    int updateByExample(@Param("record") Emplovee record, @Param("example") EmploveeExample example);

    int updateByPrimaryKeySelective(Emplovee record);

    int updateByPrimaryKey(Emplovee record);
}