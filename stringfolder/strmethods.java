package stringfolder;


import java.util.Scanner;
class Strm
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    String s2 = sc.nextLine();
	    int n = sc.nextInt();
	    String m = sc.next();
	    String o = sc.next();
	    
	    System.out.println(s1.regionMatches(0,s2,0,n));
	    System.out.println(s1.length());
	    System.out.println(s2.length());
	    System.out.println(s1.indexOf(m));
	    System.out.println(s1.lastIndexOf(o));
	    System.out.println(s1.startsWith("h"));
	    System.out.println(s1.endsWith("o"));
	    System.out.println(s1.toUpperCase());
	    System.out.println(s1.toLowerCase());
	    System.out.println(s2.substring(2));
	    System.out.println(s1.substring(2,5));



	}
}

