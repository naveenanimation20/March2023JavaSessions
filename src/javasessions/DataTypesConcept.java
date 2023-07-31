package javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {

		//strict data types:
		
		//1. primitive data types: it will just take some space in the memory
		//no need to create the object of the class
			//Numeric : 
				//Integral:	
						//a. Integer: byte, short, int, long
						//b. Floating-point: float, double
			//char: char
			//Boolean: true/false
		
		//2. Non primitive data types: String, Class, Interface, Arrays, Abstract Class
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127 ==> -2^7 to 2^7-1
		byte b = 10;
		byte b1 = 20;
		b = 40;
		System.out.println(b);
		byte c = -10;
		byte v = 0;
		//byte n = 130;
		System.out.println(b+b1);
		
		//2. short:
		//range: -32768 to 32767 ==> -2^15 to 2^15-1
		//size: 2 bytes = 2x8 = 16 bits
		short s = 1000;
		short s1 = 25000;
		
		//3. int:
		//range: -2147483648 to 2147483647 ==> -2^31 to 2^31-1
		//size: 4 bytes = 4x8 = 32 bits
		int i = 100000;
		int j = 1;
		int l = 0;
		int k = -989;
		
		//4. long:
		//size: 8 bytes = 8x8 = 64 bits
		//range: -2^63 to 2^63-1
		long l1 = 123456789;
		long l2 = 98765678989L;
		System.out.println(l2);
		
		//acc number/SSN/Aadhar card/phone number//credit card -- String
		//4444545467678999
		//98989898989990
		//long ssn = 19191919199L;//8 x 1000 
		
		//5. float:
		//size: 4 bytes = 4x8 = 32 bits
		//range: after . can take upto 6 to 7 digits
		float g = 12.33f;
		float h = (float)12.55;
		System.out.println(g);
		System.out.println(h);
		float p = 100;
		System.out.println(p);//100.0
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: after . can take upto 15 digits
		double d = 12.3333;
		System.out.println(d);
		double buildVersion = 1.0;
		
		
		//7. char:
		//size: 2 bytes = 16 bits
		//unicode chars: ASCII + special uni code chars (symbolic, chinese, japanese)
		//range:
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		char c1 = 'a';
		char c11 = 'b';
		char c2 = 'A';
		char c3 = '1';//49
		char c33 = '2';//50
		char c4 = '$';
		char gender = 'm';
		char execution = 'Y';
		
		System.out.println(c1);//a
		System.out.println(c11);//b
		System.out.println(c1+c11);//97 + 98 = 195
		System.out.println(c11-c1);//98-97=1
		System.out.println(c2);
		
		System.out.println(c3+c33);
		System.out.println((int)c1);
		System.out.println((int)'@');
		System.out.println((byte)'$');
		System.out.println((byte)' ');
		
		int go = 100;
		char pop = 'a';
		System.out.println(go + pop);
		System.out.println(c1+""+c11);
		
		System.out.println('a' + '1');
		System.out.println(12.33 + 'a');
		
		//boolean: true/false:
		//size: ~1 bit
		boolean flag = true;
		boolean flg = false;
		
		int totalBillAmount = 9000;
		int total_fee_amount = 1000;
		
		int kk = 100;
		int pp = 100;
		System.out.println(kk);
		int result = kk+pp;
		System.out.println(result);//200
		
		double ff = 9.14159265358979323846d;
		System.out.println(ff);
		
	}

}
