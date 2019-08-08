package com.neusoft.promis.security.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.promis.security.mapper.IRoomMapper;
import com.neusoft.promis.security.model.RoomModel;
import com.neusoft.promis.security.service.IRoomService;

//房间的业务实现类
@Service("RoomService")
@Transactional(rollbackFor=Exception.class)
public class RoomServiceImpl implements IRoomService {
	@Autowired
	private IRoomMapper roomMapper =null;
	
	@Override
	public void create(RoomModel room) throws Exception {
		roomMapper.create(room);

	}

	@Override
	public void update(RoomModel room) throws Exception {
		roomMapper.update(room);

	}

	@Override
	public void delete(RoomModel room) throws Exception {
		roomMapper.delete(room);

	}

	@Override
	public List<RoomModel> getListByAll() throws Exception {
		
		return roomMapper.selectListByAll();
	}

	@Override
	public RoomModel getByCcode(String roomNo) throws Exception {
		
		return roomMapper.selectByRoomNo(roomNo);
	}

}
