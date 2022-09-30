
public class Arrays {

	public static void main(String[] args)
	{
	  String [] sehirler1 = new String[] {"Ankara", "İstanbul", "İzmir"};                                       // birbirine benzeyen içinde çeşitli algoritmalar gerçekleştirilen yapılar için dizilerden yararlanılır
      
	  for (String sehir : sehirler1) {                    // C# da : foreach(string sehir in sehirler1) şeklinde olur
    	  System.out.println(sehir);
      }
	  
	  for(int i = 0; i<3; i++)
	  {
		  System.out.println(sehirler1[i]);
	  }
	}

}
