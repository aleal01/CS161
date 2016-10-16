public class CaesarCipher_Demo {

	public static void Run(){
		String text = "Hello World";
		System.out.println(String.format("Original text \"%s\"",text));
		
		String cipher = cipher(text, 5);
		System.out.println(String.format("Cipher \"%s\"", cipher));
		
		String decipher = decipher(cipher, 5);
		System.out.println(String.format("Decipher \"%s\"", decipher));
	}
	
	static String cipher(String originalText, int shift){
		
		char[] originalTextCharArr = originalText.toCharArray();
		int firstCharIdx = 'A';
		int offset = ('z' - 'A') + 1;
		
		for (int i = 0; i < originalTextCharArr.length; i++){
			
			char oldCharIdx = originalTextCharArr[i];
			int oldIdxInAlphabet = oldCharIdx - firstCharIdx;
			int newIdxInAlphabet = (oldIdxInAlphabet + shift) % offset;
			
			char newCharIdx = (char)(firstCharIdx + newIdxInAlphabet);
			originalTextCharArr[i] = newCharIdx;
		}
		
		return new String(originalTextCharArr);
	}
	
	static String decipher(String cipheredText, int shift){
		
		return cipher(cipheredText, shift * -1);
	}
	
	public static void main(String[] args){
		String text = "abcdefghijklmnopqrtuvwxyz";
		System.out.println(String.format("Original text \"%s\"",text));
		
		String cipher = cipher(text, 3);
		System.out.println(String.format("Cipher \"%s\"", cipher));
		
		String decipher = decipher(cipher, 3);
		System.out.println(String.format("Decipher \"%s\"", decipher));
	
	}

}
