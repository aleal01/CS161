/**
 * Caesar cipher
 * @author Pavel Micka
 */
public class CaesarCipher2 {
    /**
     * Shift (the original variant had 3)
     */
    public static final int SHIFT = 3;

    /**
     * Encrypt using Caesar cipher
     * @param s string containing only uppercase characters
     * @return ecrypted string (closed text)
     */
    public static String encipher(String s){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i ++){
            //modularly add the shift
            char enciphered = s.charAt(i) + SHIFT > 90 ? (char)((s.charAt(i) + SHIFT) - 26) : (char)(s.charAt(i) + SHIFT);
            builder.append(enciphered);
        }
        return builder.toString();
    }
    /**
     * Decrypt using Caesar cipher
     * @param s string containing only uppercase characters
     * @return decrypted string (open text)
     */
    public static String decipher(String s){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i ++){
            //modularly subtract the shift
            char deciphered = s.charAt(i) - SHIFT < 65 ? (char)((s.charAt(i) - SHIFT) + 26) : (char)(s.charAt(i) - SHIFT);
            builder.append(deciphered);
        }
        return builder.toString();
    }
    public static void main(String[] args) {
		CaesarCipher2 cipher = new CaesarCipher2();
		String plainText = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("Plaintext: " + plainText);
		String cipherText = CaesarCipher2.encipher(plainText);
		System.out.println("After encryption, cipherText: " + cipherText);
		String backToPlainText = CaesarCipher2.decipher(cipherText);
		System.out.println("After decryption, plainText: " + backToPlainText);
		if (!plainText.equals(backToPlainText))
			System.err.println("Fix your program!");
	}
}
