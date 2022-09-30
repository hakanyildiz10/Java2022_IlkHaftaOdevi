
public class Donguler {

	public static void main(String[] args) 
	{
		//FOR LOOP
		String urun = "Laptop";
		for(int i=1; i<10; i++)
		{
			System.out.println(urun + i);
		}
		/*for(int i=1; i<=10; i++)
		{
			System.out.print(i + " ");                 // i+ = 2 ile i = i+2 aynı şey 
		}
        */
		
		//WHILE LOOP
		int sayi = 10;
		while(sayi<=100) {
			System.out.println(sayi);
			sayi = sayi + 10;
		}
			
			
	    //DO WHILE LOOP
		int sayi2 = 11;                                 // şart bloğu tutmasa bile do nun içi bir kere çalışır, burada da while şartı tutmuyor
		do 
		{
		  System.out.println(sayi2);
		  sayi = sayi +10;
		}
		while(sayi2 > 100);
		
	}

}
