package ru.master.igor;

public class MusicPlayer {
  private IMusic imuse;
  private String name;
  private int volume;

  public boolean isIs_now() {
    return is_now;
  }

  public void setIs_now(boolean is_now) {
    this.is_now = is_now;
  }

  private boolean is_now;


  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getVolume() {
    return volume;
  }
  public void setVolume(int volume) {
    this.volume = volume;
  }

  public MusicPlayer(IMusic imuse) {
    this.imuse = imuse;
  }
  public MusicPlayer(){};

  public void setImuse(IMusic imuse){this.imuse = imuse;}

  public void PlaySound(){
    System.out.println("Playing music: " + imuse.getSong());
  }
}