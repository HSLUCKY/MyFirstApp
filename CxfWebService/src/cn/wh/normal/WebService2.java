package cn.wh.normal;


import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;



@WebService
public class WebService2 {
	@WebMethod
	public String sayHello(String name){
		System.out.println("欢迎"+name);
		return "hello world " + name;
	}
	
	public static void main(String[] args) {
		//Endpoint.publish("http://10.177.10.232:8888/hello", new MyService());//寮�杈熷绾跨▼
		ServerFactoryBean sfb=new ServerFactoryBean();
		sfb.setAddress("http://10.177.10.253:8081/hello");
		
		sfb.setServiceClass(WebService2.class);
		
		//鎷︽埅娑堟伅
		sfb.getInInterceptors().add(new LoggingInInterceptor());
		
		sfb.getOutInterceptors().add(new LoggingOutInterceptor());
		sfb.create();
	}

}
