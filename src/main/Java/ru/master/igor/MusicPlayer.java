package ru.master.igor;

public class MusicPlayer {
  private IMusic imuse;
  public MusicPlayer(IMusic imuse) {
    this.imuse = imuse;
  }

  public void PlaySound(){
    System.out.println("Playing music: " + imuse.getSong());




  }



}
