package com.migutv.oxm.jaxb;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.migutv.oxm.entity.LoginLog;
import com.migutv.oxm.entity.SyncFlowPkgLeftQuotaReq;
import com.migutv.oxm.entity.User;

public class Test {
   
	
	public void xmlToObject() throws JAXBException, FileNotFoundException
	{
		JAXBContext jaxbContext=JAXBContext.newInstance(User.class);
		Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
		FileReader fileReader=new FileReader("D:\\workspace\\spring3Demo\\src\\main\\java\\com\\migutv\\oxm\\xml\\sync.xml");
		//FileReader fileReader=new FileReader("D:\\workspace\\spring3Demo\\src\\main\\java\\com\\migutv\\oxm\\jaxb\\user.xsd");
		User user=(User) unmarshaller.unmarshal(fileReader);
		List<LoginLog> loginLog=user.getLogs().getLoginLog();
	  for (LoginLog loginLog2 : loginLog) {
		System.out.println("访问的ip为："+loginLog2.getIp());
		System.out.println("访问的时间为："+loginLog2.getLoginDate().getTime());
	}
		
	  
	}
	
	public void xmlToObject1() throws JAXBException, FileNotFoundException
	{
		JAXBContext jaxbContext=JAXBContext.newInstance(SyncFlowPkgLeftQuotaReq.class);
		Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
		FileReader fileReader=new FileReader("D:\\workspace\\spring3Demo\\src\\main\\java\\com\\migutv\\oxm\\xml\\sync.xml");
		//FileReader fileReader=new FileReader("D:\\workspace\\spring3Demo\\src\\main\\java\\com\\migutv\\oxm\\jaxb\\user.xsd");
		SyncFlowPkgLeftQuotaReq syncFlowPkgLeftQuotaReq=(SyncFlowPkgLeftQuotaReq) unmarshaller.unmarshal(fileReader);
		
	 System.out.println(syncFlowPkgLeftQuotaReq);
	}
	public static void main(String[] args) throws FileNotFoundException, JAXBException {
		new Test().xmlToObject1();

	}

}
