package DataConvert;

public class DataConversion {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);
		
		//string to int:
		//using wrapper class:
		//int ---> Integer
		//double --> Double
		//float --> Float
		//char --> Character
		//boolean ---> Boolean
		
		//String to int:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
//		String test = "100A";
//		int k = Integer.parseInt(test);//NumberFormatException: For input string: "100A"
//		System.out.println(k);

		//String to double:
		String s = "12.33";
		System.out.println(s+10);
		double d = Double.parseDouble(s);//12.33
		System.out.println(d+10);
		
		//String to boolean:
		String headless = "true";
		
		if(Boolean.parseBoolean(headless)) {
			
		}
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		//int to String:
		int u = 100;
		System.out.println(u+20);
		String u1 = String.valueOf(u);//"100"
		System.out.println(u1+20);
		
		
	}

}
