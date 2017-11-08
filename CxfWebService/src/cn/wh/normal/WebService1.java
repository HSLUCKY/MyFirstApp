package cn.wh.normal;

public class WebService1 implements WebServiceInterface{

	@Override
	public String sayHello(String name){
		System.out.println("欢迎"+name);
		return "hello world2 " + name;
	}
	
//	public static void main(String[] args) {
//		//Endpoint.publish("http://10.177.10.232:8888/hello", new MyService());//寮�杈熷绾跨▼
//		JaxWsServerFactoryBean sfb=new JaxWsServerFactoryBean();
//		sfb.setAddress("http://10.177.10.232:7777/hello");
//		sfb.setServiceClass(WebServiceInterface.class);;
//		sfb.setServiceBean(new WebService1());
//		sfb.create();
//		
//	}

}
