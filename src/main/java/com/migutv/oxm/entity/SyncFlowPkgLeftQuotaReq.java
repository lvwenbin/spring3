//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.05 时间 05:49:08 PM GMT+08:00 
//


package com.migutv.oxm.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "MsgType",
    "Version",
    "OrderID",
    "UserPseudoCode",
    "ProductId",
    "Threshold",
    "ResultTime",
    "sign"
})
@XmlRootElement(name = "SyncFlowPkgLeftQuotaReq")
public class SyncFlowPkgLeftQuotaReq {

    @XmlElement(required = true)
    protected String MsgType;
    @XmlElement(required = true)
    protected String Version;
    @XmlElement(required = true)
    protected String OrderID;
    @XmlElement(required = true)
    protected String UserPseudoCode;
    @XmlElement(required = true)
    protected String ProductId;
    @XmlElement(required = true)
    protected String Threshold;
    @XmlElement(required = true)
    protected String ResultTime;
    @XmlElement(required = true)
    protected String sign;
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	public String getUserPseudoCode() {
		return UserPseudoCode;
	}
	public void setUserPseudoCode(String userPseudoCode) {
		UserPseudoCode = userPseudoCode;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getThreshold() {
		return Threshold;
	}
	public void setThreshold(String threshold) {
		Threshold = threshold;
	}
	public String getResultTime() {
		return ResultTime;
	}
	public void setResultTime(String resultTime) {
		ResultTime = resultTime;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
   

}
