package ru.master.igor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.master.igor")
@PropertySource("classpath:app_props.properties")
public class SpringConfig {
  @Bean
  public TranceMusic tranceMusic(){
    return new TranceMusic();
  }

  @Bean
  public MetalMusic metalMusic(){
    return new MetalMusic();
  }

  @Bean
  public MusicPlayer musicPlayer(){
    return new MusicPlayer(tranceMusic(), metalMusic());
  }

  @Bean
  public MusicPlayer musicPlayer1(){
    return new MusicPlayer(tranceMusic(), metalMusic());
  }
}