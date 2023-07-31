package javasessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//static Array: size is fixed
		//can store only similar type of data: 
			
		
		
		//int array:
		int k[] = new int[4];
		//li = 0
		//hi = 3 --> length - 1
		//length = 4 --> hi+1
		//range: 0 to 3
		
		//k[-1] = 60;//AIOB
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;
		//k[4] = 50;//ArrayIndexOutOfBoundsException -- AIOB
		
		System.out.println(k[0]);
		System.out.println(k[3]);
		//System.out.println(k[4]);//AIOB
		
		//2. double array:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 34.44;
		
		//3. char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'A';
		c[2] = '0';
		
		//String array:
		String browsers[] = new String[4];
		browsers[0] = "chrome";
		browsers[1] = "firefox";
		browsers[2] = "safari";
		browsers[3] = "safari";
		
		System.out.println(browsers[0]);
		System.out.println(browsers[2]);
		System.out.println(browsers[3]);
		

		
		
		

	}

}
