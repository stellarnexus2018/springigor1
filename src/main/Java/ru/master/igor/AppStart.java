package ru.master.igor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "app_context.xml"
    );


    TranceMusic tm1 = context.getBean("musicBean", TranceMusic.class);
    TranceMusic tm2 = context.getBean("musicBean", TranceMusic.class);

    System.out.println(tm1.getSong());
    System.out.println(tm2.getSong());



    /*MusicPlayer mp1 = context.getBean("musicPlayer", MusicPlayer.class);
    MusicPlayer mp2 = context.getBean("musicPlayer", MusicPlayer.class);

    System.out.println(mp1==mp2);
    System.out.println(mp1);
    System.out.println(mp2);

    mp1.setName("tutu");

    System.out.println(mp1.getName());
    System.out.println(mp2.getName());
*/


    //mp.PlaySound();
    //System.out.println(mp.getName());
    //System.out.println(mp.getVolume());
    //System.out.println(mp.isIs_now());

    context.close();

  }

}
