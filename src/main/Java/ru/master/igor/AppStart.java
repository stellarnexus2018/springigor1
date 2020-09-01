package ru.master.igor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "app_context.xml"
    );

    IMusic misic = context.getBean("musicBean", IMusic.class);

    MusicPlayer mp = new MusicPlayer(misic);
    mp.PlaySound();

    context.close();

  }

}
