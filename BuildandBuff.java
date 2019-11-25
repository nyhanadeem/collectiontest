package CollectionTEST;

public class BuildandBuff {
		
		public static void StrConcat(String str1) {
			str1 = str1 + "Nyha";
		}
	    public static void StrBuffConcat(StringBuffer str2)
	    {
	    	str2.append("My love"); 
	    }
	    public static void StrBuildConcat(StringBuilder str3)
	    {
	    	str3.append("My love");
	    }
	    
		public static void main(String[] args) {
			
			String str1 = ("Hey!");
			StrConcat(str1);
			System.out.println("The final string is -" + str1 );
			
			StringBuffer str2 = new StringBuffer("Hey!");
			StrBuffConcat(str2);
			System.out.println("The final string is- " + str2);
			
			StringBuilder str3 = new StringBuilder("Hey!");
			StrBuildConcat(str3);
			System.out.println("The final string is -" + str3);
		}	
	
	}


