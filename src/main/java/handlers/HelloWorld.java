package handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	/*
	 * hello�����Ϸ���һ��@RequestMapping�� ������ƥ�������·������������ƥ�������·�����ǡ�http://localhost:8080/springTest/springmvc/helloworld��������tomcat������������������������urlʱ����������������ϵ��ˣ��ͻ�����÷�����
	 */
    /**
     * 1. ʹ��RequestMappingע����ӳ�������URL
     * 2. ����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ, ����InternalResourceViewResolver��ͼ���������������½���
     * ͨ��prefix+returnVal+suffix �����ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ���ת������
     * "/WEB-INF/views/success.jsp"
     * @return
     */
    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        /*
         * ���return�Ľ��������д�ģ�������ص��ַ�������������springmvc.xml��line15-18������ϵģ�springmvc.xml��������prefix��suffix��������������֮��ľ������ﷵ�ص��ַ���������ִ����������������ǿ��Եõ�������������Դ·����/WEB-INF/views/success.jsp�������success.jsp����Ҫ�����½���
         */
        return "success";
    }
}