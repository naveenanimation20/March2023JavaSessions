package StringConcept;

public class StringTest {

	public static void main(String[] args) {

		String s = "testing";//String literals
		String s1 = new String("testing"); //String objects
		
		String s2 = "testing";//String literals

		System.out.println(s==s2);
		System.out.println(s==s1);
		System.out.println(s1==s2);
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));

		String s3 = "java";
		s3 = null;
		System.out.println(s3);
		
		String s4 = "java";
		String s5 = "java";
		
		String s6 = new String("testing"); //String objects
		
		String pop = "Selenium";//1 - scp
		
		//String t1 = "Selenium";
		String t2 = new String("Selenium");//1 - heap
		t2.intern(); //1-SCP -- 0
		//total = 2
		String t3 = "Selenium"; //0
		
		
		//
		String top = "naveen";
		String top1 = "naveen";
		String top3 = new String("naveen");
		top = null;
		top1 = null;
		String top4 = "naveen";
		
		System.out.println(top == top1);
		//System.out.println(top.equals(top1));//NPE
		System.out.println(top4 == top3);
		System.out.println(top4.equals(top3));
		
		String p1 = new String("Cypress");
		p1.intern();
		
		
		//Immutable
		String z = "testing";
		z = z.concat("automation");
		System.out.println(z);
		String z1 = "testing";
		System.out.println(z1);
		
		//
		String r = "   cypress  ";
		
		System.out.println(r.trim());//cypress
		System.out.println(r);//"    cypres   "
		
		//StringBuffer and StringBuilder -- Mutable
		
		StringBuilder sb = new StringBuilder("naveen");
		sb.append("automation");
		System.out.println(sb);
		
		
	}

}
