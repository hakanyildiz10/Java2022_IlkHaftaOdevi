
public class Metotlar {

	public static void main(String[] args)
    {
		mesajVer("engin");                                  // mesjVer metodunda parametre olduğu için buraya da yazmak gerekir  
		hesapla();
		System.out.println(topla(6,3));
		System.out.println(toplananIkiSayininYuzdeOnu(10,90));
    }                                               //DRY = DO not repeat yourself
    public static void mesajVer(String isim)        //bankalarda her kredi türünün faizi değişir, kullanıcısı değişir, her seferinde isimi değiştirmekle uğraşmazsın
    {
    	System.out.println("merhaba " + isim);
    }
    public static void hesapla()
    {                                                   //fonksiyonlarda, her pencereye aynı şeyi yazmıyor, bir tane hesaplma operatorü yazıp istenilen yerde çağırılır.
    	System.out.println("hesaplandı");
    }
    //RETURN PARAMETRESİ
    public static int topla(int sayi1, int sayi2)       // clean kod sisteminde bir metot sadece bir işi yapabilir, bu sadece toplama yapıyor
    {                                                   //hem toplamı bulup daha sonra iki sayının toplamının yüzdesi alınacağı zaman buradaki metodu return ile yapıyoruz
    	int toplam = sayi1 + sayi2;                     // hangi türde dönüş gerçekleşecekse return e o yazılır, return olanlar genelde hesaplama sonucudur
    	return toplam;
    }
    public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2)
    {
    	int toplam = topla(sayi1,sayi2);
    	double sonuc = toplam * 10/100;
    	return sonuc;
    }
    public static double krediHesapla(double krediMiktari)
    {
    	//hesaplar yapılır
    	return 125000;
    }
    
    }
