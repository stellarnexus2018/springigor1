package ru.master.igor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
    mp.PlaySound();

    context.close();
  }
}