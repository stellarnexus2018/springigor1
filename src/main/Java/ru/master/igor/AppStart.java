package ru.master.igor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "app_context.xml"
    );

    TestBean test_bean = context.getBean("testBean", TestBean.class);
    System.out.println(test_bean.getName());

    context.close();

  }

}
