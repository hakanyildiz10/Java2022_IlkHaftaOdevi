
public class ArrayList {

	public static void main(String[] args) 
	{
		String[] sehirler1 = new String[] {"Ankara", "İstanbul", "İzmir"};
		
		//sehirler1 = new String[4];                                            // [4] dizideki eleman sayısı
		//sehirler1[3] = "Bursa";                                               // diziye yeni eleman ekleme, memory de iki farklı bölüm vardır; stack ve heap, ilk array tanımlandığında sehirler1 olarak stack a yazar ancak
		                                                                      // asıl diziyi heap de tutar, yeni eleman eklerken tekrar new dersek heap de ikinci dizi oluşturur ve oraya ekler, haliyle burada dördüncü şehir bursaydı ama
		                                                                      // yeni dizi oluşturup eklediği için ilk 3 eleman null
		
		    //System.out.println(sehirler1[3]);
		
		String[] sehirler2 = new String[] {"Antep", "diyarbakır", "urfa"};
		 
		sehirler1 = sehirler2 ;                                             // bu şeklide yazınca, sehirler1 tuttuğu şeyleri bırakıp şehirler2 nin tuttuğu şeylere bağlanır, yani artık ikisinin de şehirleri aynı
		sehirler1[0] = "adana";                                             // sehirler1 in ilk şehrini değiştirip adana yaptık ama aynı zamanda sehirler2 nin de ilk şehri değişmiş oldu, böylelikle ekrana adana yazdı
		System.out.println(sehirler2[0]);                                   // boolean 0 yada 1 dir yani sayısal veri tipidir, sayısal veri tipleri değer tiplerdir(value types)for ex: int, double, değer tipler sadece steak de çalışır
		                                                                    // reference types : array, class, abstract
		int sayi1 = 10;                                                     // değer tipler sadece değer üstünden çalışır, burada sayı1 in değerini sayi2 ye atadık ve bitti sonrasında sayi2 yi değiştirmek sayi1 in değerini etkilemez aynı kalır, o yüzden console 20 kalır
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 30;
		System.out.println(sayi1);
		

	}

}
