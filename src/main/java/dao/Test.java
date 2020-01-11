package dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring.xml");*/
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        IndexService indexService = (IndexService) context.getBean("indexService");
        indexService.test();
        indexService.test1();
        indexService.test1();
        indexService.test1();
    }
}
