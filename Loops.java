// pętla while

// while(warunek){
//   instrukcje do wykonania
// }

// int licznik = 10;

// while (licznik < 10){
// 	System.out.println("To jest petla");
// 	licznik++;
// }


public class Loops{
    public static void main(String[] args){
		// PETLA WHILE
		// while(warunek){
 		// instrukcje do wykonania}
		 int licznik = 0;

		 while(licznik<5){
			 System.out.println("To jest petla pierwsza");
			 licznik++;
		 }
			 System.out.println("Koniec pętli");
		// PETLA DO WHILE 
		// do{instrukcje do wykonania}
		// while(warunek); 
		int cyfra = 0;

		do{
			System.out.println("To jest petla druga");
			cyfra++;
		}
		while(cyfra<10);
		System.out.println("Koniec pętli drugiej");

		// PETLA FOR
		// for(wyrażenie początkowe ; warunek ; modyfikator_licznika){
		//  instrukcje do wykonania}
		for(int i=0; i<10; i++){
			System.out.println("To jest pętla trzecia");
		}
		System.out.println("Koniec pętli trzeciej");	
		}	   
}