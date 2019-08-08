package com.neusoft.promis.security.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.promis.security.model.RoomModel;



//房间的Mapper接口
@Mapper
public interface IRoomMapper {
	//C方法-增加
	public void create(RoomModel room) throws Exception;
	//U方法-修改
	public void update(RoomModel room) throws Exception;
	//D方法-删除
	public void delete(RoomModel room) throws Exception;
	//R方法-查询
	public List<RoomModel> selectListByAll() throws Exception;
	//R方法-查询  查询返回单个对象，一般根据表的主键字段值获取
	public RoomModel selectByRoomNo(String roomNo) throws Exception;
}
