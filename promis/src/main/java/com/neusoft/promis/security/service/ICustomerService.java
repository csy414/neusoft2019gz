package com.neusoft.promis.security.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.neusoft.promis.security.model.CustomerModel;


//客户的业务接口
public interface ICustomerService {
	public void create(CustomerModel customer) throws Exception;
	public void update(CustomerModel customer) throws Exception;
	public void delete(CustomerModel customer) throws Exception;
	public List<CustomerModel> getListByAll() throws Exception;
	public CustomerModel getByCustomerNo(int customerNo) throws Exception;
	public List<CustomerModel> getListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
}
