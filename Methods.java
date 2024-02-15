package string;

public class Methods 
{
	public static void main(String[] args) {
		String s="Sachin";
		System.out.println(s.charAt(0));
		System.out.println(s.compareTo("Sachin"));
		System.out.println(s.concat(" Pawar"));
		System.out.println(s.contains("ach"));
		System.out.println(s.startsWith("Sa"));
		System.out.println(s.endsWith("in"));
		System.out.println(s.toString());
		System.out.println(s.isEmpty());
		System.out.println(s.split("c"));
		System.out.println(s.hashCode());
		System.out.println(s.length());
		System.out.println(s.lastIndexOf(s));
		System.out.println(s.equals("Sachin"));
		System.out.println(s.replace("c", "d"));
		System.out.println(s.substring(3));
		System.out.println(s.toCharArray());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
	
	}

}
