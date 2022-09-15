// Deklaracja - tutaj określamy typ i nazwę zmiennej -> typ nazwaZmiennej 
// Inicjalizacja - nadanie wartości zmiennej -> nazwaZmiennej = wartość
// typ nazwaZmiennej = wartość;

// Java Keywords - https://www.w3schools.com/java/java_ref_keywords.asp

public class Zmienna {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = number1;
        System.out.println(number1 + number2); //10
        number1 = 10;
        System.out.println(number2); //5   
    }
}


// Zmienne "globalne" w obrębie klasy charakteryzują się tym, że są widoczne w obrębie całej klasy, w której je utworzono.
// Zmienne "lokalne" utworzone są w ramach metod i tam są widoczn 