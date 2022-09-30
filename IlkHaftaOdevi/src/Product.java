
public class Product {

	public static void main(String[] args) 
	{
		
		  SubProduct product1 = new SubProduct();
		  product1.setName("Laptop");                                       // SubProduct tan ürünün ismini elde ettik
       
		  SubProduct product2 = new SubProduct();
		  product2.setName("Mouse"); 
		  
		  SubProduct[] urunler = new SubProduct[] {product1, product2};     // gerçek hayatta bi avm sitesine girince karşına çıkan array listesidir, şu an bu koda göre 2 ürün var
    
	      for(int i=0; i<urunler.length; i++)
	      {
	    	 System.out.println(urunler[i].getName()); 
	      }
	}

}
