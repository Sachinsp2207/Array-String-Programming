package string;

public class NonREpCharFromTwoString {
	public static void main(String[] args) {
		String s1="abcdeanf";
		String s2="vfrabcgyui";
	
	for (int i = 0; i < s2.length(); i++) {
		for (int j = 0; j < s1.length(); j++) {
			if (s2.charAt(i)==s1.charAt(j)) {
				s1=s1.replace(s1.charAt(j),s1.charAt(j));
			} 
		}
		
	}
	String ans=String.valueOf(s1);
		System.out.println(ans);
	}
}


