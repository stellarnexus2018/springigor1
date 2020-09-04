package ru.master.igor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "app_context.xml"
    );




    /*MusicPlayer mp = context.getBean("mus_pl", MusicPlayer.class);
    mp.PlaySound();
*/



//    IMusic mus1 = context.getBean("metalMusic", MetalMusic.class);
    IMusic mus2 = context.getBean("tranceMusic", TranceMusic.class);

//    System.out.println(mus1.getSong());
    System.out.println(mus2.getSong());





    context.close();

  }

}
