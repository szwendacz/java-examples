public class Samochod {
    private int predkosc; // (1)
    private String kolor; // (2)
    public void ustawPredkosc(int nowaPredkosc) {
      predkosc = nowaPredkosc; // (3)
    }
    public void ustawKolor(String nowyKolor) {
      kolor = nowyKolor; // (4)
    }
    public void wypiszInformacje() {
      System.out.println("Jestem samochodem! Moj kolor to " + kolor +
          ", jade z predkoscia " + predkosc); // (5)
    }
}
