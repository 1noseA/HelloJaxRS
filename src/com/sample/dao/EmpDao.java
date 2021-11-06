package com.sample.dao;

import org.apache.ibatis.annotations.Select;

import com.sample.Employee;

public interface EmpDao {

	@Select("select * from employee where empno = #{empno}")
	public Employee findByPrimarykey(int empno);

}
