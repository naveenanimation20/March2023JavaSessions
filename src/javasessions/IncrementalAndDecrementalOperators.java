package javasessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {

		// ++ / --

		// 1. post increment: ++ : first assign then increase
		int a = 1;
		int b = a++;

		System.out.println(a);// 2
		System.out.println(b);// 1

		int c = 10;
		int d = c++;
		System.out.println(c);// 11
		System.out.println(d);// 10

		int f = -99;
		int g = f++;
		System.out.println(f);// -98
		System.out.println(g);// -99

		// 2. pre increment: first increase and then assign
		int x = 1;
		int y = ++x;
		System.out.println(x);
		System.out.println(y);

		int t1 = -999;
		int t2 = ++t1;
		System.out.println(t1);// -998
		System.out.println(t2);// -998

		double d1 = 1.1;
		double d2 = d1++;
		System.out.println(d1);// 2.1
		System.out.println(d2);// 1.1

		char c1 = 'a';// 97
		char c2 = ++c1;
		System.out.println(c1);// 98->b
		System.out.println(c2);// 98->b

		// 3. post decrement: --
		int p = 2;
		int q = p--;
		System.out.println(p);// 1
		System.out.println(q);// 2

		int u1 = 10;
		int u2 = u1--;
		System.out.println(u1);// 9
		System.out.println(u2);// 10

		int p1 = -99;
		int p2 = p1--;
		System.out.println(p1);// -99-1 = -100
		System.out.println(p2);// -99

		// 4. pre decrement: --
		int h1 = 2;
		int h2 = --h1;
		System.out.println(h1);// 1
		System.out.println(h2);// 1

		int v1 = -96;
		int v2 = --v1;
		System.out.println(v1);// -97
		System.out.println(v2);// -97

		//

		int test = 5;
		System.out.println(test++); // 5
		System.out.println(test);// 6

		int pop = 8;
		System.out.println(++pop);
		System.out.println(pop);

		//
		char ch = '0';// 48
		System.out.println(++ch);// 48+1 = 49 --> '1'

		char ch1 = '$';
		System.out.println(++ch1);

		char ch2 = 'a';
		System.out.println(ch2++);// a
		System.out.println((byte) ch2);// b

//		boolean flag = true;
//		System.out.println(flag++);

//		String s = "hello";
//		System.out.println(s++);

		int e1 = 2;
		int e2 = e1++ + ++e1;
		System.out.println(e1);// 4
		System.out.println(e2);// 6

		int l1 = 2;
		int l2 = l1++ - l1++ + l1--;
		System.out.println(l1);
		System.out.println(l2);

		int s1 = 1;
		int s2 = 2;

		System.out.println(--s2 - ++s1 + ++s2 - --s1);
		System.out.println(s1);
		System.out.println(s2);

		//
		int i = 19, j = 29, k;		
		k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;		
		//k = 19-18+28-29+18-29+19-28=-20
		System.out.println("i=" + i);//19
		System.out.println("j=" + j);//29
		System.out.println("k=" + k);//-20
		
		int sos = 10;
//		int dos = sos+1;
//		int dos1 = sos++;
//		int dos2 = ++sos;
		sos+= 2;
		sos = sos+2;
		System.out.println(sos);
		
		//
		int m = 0, n = 0;
		int ppp = --m * --n * n-- * m--;
		//		= -1 
		System.out.println(ppp);
		System.out.println(m);
		System.out.println(n);
		
		int xx = 111;
		int cx = 120;
		short res = (short) (xx + cx);
		System.out.println(res);
		
		
		
		
	}

}
