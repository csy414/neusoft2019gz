package com.neusoft.promis.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


//客户的Model类
@Alias("Customer")
@Data
public class CustomerModel implements Serializable {
	private int customerNo=0;      //客户序号
	private int typeNo=0;          //客户类型序号
	private String ccode=null;     //客户编码
	private String cname=null;     //客户名称
	private String contact=null;   //联系人姓名
	private String cardCode=null;  //身份证号码
	private String mobile=null;    //手机号
	private String tel=null;       //电话
	private String fax=null;       //传真
	private String qq=null;        //QQ
	private String weiXin=null;    //微信
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date feeStartDate=null;        //收费开始日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date feeEndDate=null;          //收费截止日期
	private String cstatus=null;           //客户状态
}
