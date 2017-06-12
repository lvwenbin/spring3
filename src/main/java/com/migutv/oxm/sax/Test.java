package com.migutv.oxm.sax;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.migutv.oxm.entity.Student;

public class Test {

	public static void main(String[] args) {
		 SAXParser parser = null;  
	        try {  
	            //构建SAXParser  
	            parser = SAXParserFactory.newInstance().newSAXParser();  
	            //实例化  DefaultHandler对象  
	            SaxParseXml parseXml=new SaxParseXml();  
	            //加载资源文件 转化为一个输入流  
	            //InputStream stream=SaxParseXml.class.getClassLoader().getResourceAsStream("D:\\workspace\\spring3Demo\\src\\main\\java\\com\\migutv\\oxm\\sax\\Student.xml");  
	            InputStream stream=new FileInputStream("D:\\workspace\\spring3Demo\\src\\main\\java\\com\\migutv\\oxm\\sax\\Student.xml");
	            //调用parse()方法  
	            parser.parse(stream, parseXml);  
	            //遍历结果  
	            List<Student> list=parseXml.getList();  
	            for(Student student:list){  
	                System.out.println("id:"+student.getId()+"\tgroup:"+student.getGroup()+"\tname:"+student.getName()+"\tsex:"+student.getSex()+"\tage:"+student.getAge()+"\temail:"+student.getEmail()+"\tbirthday:"+student.getBirthday()+"\tmemo:"+student.getMemo());  
	            }  
	        } catch (ParserConfigurationException e) {  
	            e.printStackTrace();  
	        } catch (SAXException e) {  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  

	}

}
