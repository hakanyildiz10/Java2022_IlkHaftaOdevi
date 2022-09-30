
/*public class CreditManager 
{
   public void calculate()
   {
	   System.out.println("kredisi hesaplandı");
   }
   public void add()
   {
	   System.out.println("kredisi eklendi");
   }
}*/
    
    interface CreditManager
    {
    	void calculate();                                 // bu method signature dır 
    	//void add();                                     //yukarda extend edildi ve her class a extend yazıldı, burada interface kullanıldı, interface in kuralı gereği bütün türetilen class larda operasyonu kullanmak gerek, burda calculate hepsinde kullanıldı
    }                                                     // extends yerine implements kullanılır

                                                        // abstract yazıldığı zaman hem interface deki gibi imza kullanılabilir, hem de içi dolu operasyon kullanılabilir, abstract lar class dır, bir sınıf sadece bir abstract sınıfı extend edebilir, bir sınıf istendiği kadar interface i implement edebilir