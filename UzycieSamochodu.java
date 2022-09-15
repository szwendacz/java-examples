public class UzycieSamochodu {
    public static void main(String[] args) {
      Samochod samochod1 = new Samochod(); 
      samochod1.ustawKolor("Zielony");
      samochod1.ustawPredkosc(50);
      Samochod samochod2 = new Samochod(); 
      samochod2.ustawKolor("Niebieski");
      samochod2.ustawPredkosc(60);
      samochod1.wypiszInformacje();
      samochod2.wypiszInformacje();
    }
  }


  // każda obiekt ma swój własny stan, oddzielony od innych instancji tej samej klasy