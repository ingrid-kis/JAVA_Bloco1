<<<<<<< HEAD
/* Informar todos os números de 1000 a 1999 que quando divididos por 11
   obtemos resto = 5. (FOR)
 * 
 */

package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	int x;
	
	for (x=1000; x<=1999; x++) {
		if (x%11==5) {
			System.out.println(x);
		}
		
		ler.close();
	}
	}

}
=======
/* Informar todos os números de 1000 a 1999 que quando divididos por 11
   obtemos resto = 5. (FOR)
 * 
 */

package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	int x;
	
	for (x=1000; x<=1999; x++) {
		if (x%11==5) {
			System.out.println(x);
		}
		
		ler.close();
	}
	}

}
>>>>>>> a8cdc17899c3ea94408d0a6c4250a8db80df47ca
