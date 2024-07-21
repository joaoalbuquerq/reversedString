package main;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(reverseString("joao pedro"));
		System.out.println(reverseStringLoop("joao pedro"));
		System.out.println(reverseStringSwap("joao pedro"));
	}
	
	public static String reverseString(String mensagem) {
		var stringBuffer = new StringBuffer(mensagem);
		return stringBuffer.reverse().toString();
	}
	
	public static String reverseStringLoop(String mensagem) {
		StringBuilder reversed = new StringBuilder();
		for(int i = mensagem.length() - 1 ; i>= 0; i--) {
			reversed.append(mensagem.charAt(i));
		}
		return reversed.toString();
	}
	
	public static String reverseStringSwap(String mensagem) {
		
		var reversed = mensagem.toCharArray();
		
		var lastIndex = mensagem.length()-1;
		for(int i = 0; i < mensagem.length() / 2; i++) {
			reversed[i] = mensagem.charAt(lastIndex - i);
			reversed[lastIndex - i] = mensagem.charAt(i);
		}
		
		return String.valueOf(reversed);
	}

}
