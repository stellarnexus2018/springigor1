package ru.master.igor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "app_context.xml"
    );


    MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);


    mp.PlaySound();
    System.out.println(mp.getName());
    System.out.println(mp.getVolume());

    context.close();

  }

}
