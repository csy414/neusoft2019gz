package com.neusoft.promis.security.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.promis.security.mapper.ICustomerMapper;
import com.neusoft.promis.security.model.CustomerModel;
import com.neusoft.promis.security.service.ICustomerService;

//客户的业务实现类
@Service("CustomerService")
@Transactional(rollbackFor=Exception.class)
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerMapper customerMapper=null;
	
	@Value("${server.port}")
	private String port=null;
	
	@Override
	public void create(CustomerModel customer) throws Exception {
		customerMapper.create(customer);

	}

	@Override
	public void update(CustomerModel customer) throws Exception {
		customerMapper.update(customer);

	}

	@Override
	public void delete(CustomerModel customer) throws Exception {
		customerMapper.delete(customer);

	}

	@Override
	public List<CustomerModel> getListByAll() throws Exception {
		List<CustomerModel> list=customerMapper.selectListByAll();
		System.out.println("服务启动端口:"+port);
		return list;
	}

	@Override
	public CustomerModel getByCustomerNo(int customerNo) throws Exception {

		return customerMapper.selectByCustomerNo(customerNo);
	}

	@Override
	public List<CustomerModel> getListByAllWithPage(int rows, int page) throws Exception {

		return customerMapper.selectListByAllWithPage(rows*(page-1), rows);
	}


}
