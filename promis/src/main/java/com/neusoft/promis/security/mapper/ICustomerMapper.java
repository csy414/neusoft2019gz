package com.neusoft.promis.security.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.neusoft.promis.security.model.CustomerModel;


//客户的Mapper接口
@Mapper
public interface ICustomerMapper {
	//C方法-增加
	public void create(CustomerModel customer) throws Exception;
	//U方法-修改
	public void update(CustomerModel customer) throws Exception;
	//D方法-删除
	public void delete(CustomerModel customer) throws Exception;
	//R方法-查询
	public List<CustomerModel> selectListByAll() throws Exception;
	//R方法-查询  取得列表,有分页, start: 起始的记录号， rows: 取得个数
	public List<CustomerModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//R方法-查询  查询返回单个对象，一般根据表的主键字段值获取
	public CustomerModel selectByCustomerNo(int customerNo) throws Exception;
	
}
