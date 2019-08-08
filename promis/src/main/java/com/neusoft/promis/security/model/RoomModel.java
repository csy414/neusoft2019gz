package com.neusoft.promis.security.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;
//客户房间的Model类
@Alias("Room")
@Data
public class RoomModel implements Serializable {
	private int roomNo=0;
	private int houseTypeNo=0;
	private int buildingNo=0;
	private String departmentCode=null; 
	private String floor=null; 
	private String roomCode=null; 
	private BigDecimal buildingArea=null;
	private BigDecimal feeArea=null;
	private String roomStatus=null; 
	private String roomType=null; 
}
