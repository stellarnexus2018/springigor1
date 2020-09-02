package ru.master.igor;

public class TranceMusic implements IMusic {

  private TranceMusic(){}

  public static TranceMusic obtainNewInstance(){
    return new TranceMusic();
  }

  public void doMyInit() {
    System.out.println("Doing my initialization");
  }

  public void doMyDestroy() {
    System.out.println("Doing my destroy");
  }



  @Override
  public String getSong() {
    return "Mars4";
  }
}
