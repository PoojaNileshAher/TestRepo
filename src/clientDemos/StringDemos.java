package clientDemos;

public class StringDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Star Agile", str2 = "Star Agile";
		System.out.println("Length of String: " + str.length());
		
		for(int i = 0; i < str.length(); i++)
			System.out.print(str.charAt(i));
		
		System.out.println(str.toUpperCase());
		System.out.println(str);
		System.out.println(str.toLowerCase());
		
		if(str.equals(str2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		String s1 = "Pratik", s2 = "pratik";
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		if(str.contains("Agile"))
			System.out.println("String contains Agile");
		else
			System.out.println("String does not contains Agile");
		
		System.out.println("Char at 3rd location: " + s1.charAt(2));
		System.out.println("i is at the location: " + s1.indexOf('i'));
		
		s2 = s2.replace('p', 'P');
		System.out.println("After changing char: " + s2);

		String myStr = "How are you?";
		System.out.println(myStr.endsWith("you?"));
		System.out.println(myStr.endsWith("you"));
		
		System.out.println(s1.compareTo(s2));
		
		s1 = "Hello Pratik";
	}


	}
