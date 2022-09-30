import java.util.ArrayList;                                                        // ArrayList i kullanabilmek için kodu yazmak gerekli
import java.util.Collections;
public class CreditManagerMain {

	public static void main(String[] args) 
	{
		
		//ArrayList<String> sehirler = new ArrayList<String>();                       // bu şekilde string türünde de olabilir, C# da karşılığı list olur
		//CreditManager creditManager = new CreditManager();                        //interface in tek başına anlamı yok new şeklinde tanımlanmaz
		//creditManager.add();
		//creditManager.calculate();                                               //SOLİD e göre  O harfi der ki yazılıma yeni talep gelirse mevcut kodlar değişmemeli
		
		//MortgageManager mortgageManager = new MortgageManager ();
		//mortgageManager.add();                                                    //add mortgage class ında olmamasına rağmen extend edildi
		
		//INTERFACE
		//CreditManager[] credits = new CreditManager[3];                            // BURADA CREDİmANAGER TİPİNDE YENİ BİR ARRAY NEW LENDİ
		                                                                          
		ArrayList<CreditManager> credits = new ArrayList<CreditManager>();           // buna generic ler denir, ArrayList arka planda dizileri tutar 
		credits.add(new MortgageManager());
		credits.add(new VehicleManager());
		credits.add(new OfficerManager());
		//credits[0] = new MortgageManager();                                     // burası mortgage ın referansını tutuyor
		//credits[1] = new VehicleManager();                                      // burası da vehicle ın referansı 
        //credits[2] = new OfficerManager();                                      // burası da Officer ın referansı
		
        
		for(CreditManager credit : credits)
		{
			credit.calculate();
		}
        
		/*for(int i=0; i<credits.length; i++)
		{
			credits[i].calculate();                                              // hem mortgage hem de vehicle kredisini hesaplar
		}*/
	}


}
