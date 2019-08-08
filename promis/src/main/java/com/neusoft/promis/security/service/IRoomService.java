package com.neusoft.promis.security.service;

import java.util.List;

import com.neusoft.promis.security.model.CustomerModel;
import com.neusoft.promis.security.model.RoomModel;

//房间的业务接口
public interface IRoomService {
	public void create(RoomModel room) throws Exception;
	public void update(RoomModel room) throws Exception;
	public void delete(RoomModel room) throws Exception;
	public List<RoomModel> getListByAll() throws Exception;
	public RoomModel getByCcode(String roomNo) throws Exception;
}
