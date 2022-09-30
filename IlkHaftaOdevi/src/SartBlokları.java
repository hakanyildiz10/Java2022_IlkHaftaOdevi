
public class SartBlokları {

	public static void main(String[] args) 
	{
		int not = 55;                          // gerçek hayatta not gibi veriler DB den veya api den gelir(veri kaynakları), api netflix in uygulamada dizilerinin aranması
		//50 üzeri: geçti
		// 40-49 : bütünleme
		// 0-39: kaldı
		
		if ((not >= 50) &&(not<= 100))
		{
			System.out.println("geçti");
		}
		else if ((not>=40) && (not<=49))
		{
			System.out.println("bütünleme");
		}
		else if ((not>=0) && (not<=39))
		{
			System.out.println("kaldı");
		}
		else 
		{
			System.out.println("geçersiz not");
		}
	}

}
