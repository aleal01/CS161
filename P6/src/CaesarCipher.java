public class CaesarCipher implements Cipher{
	
	private int numberOfPositions;
	private String nstring;
	
	public CaesarCipher(int numberOfPositions){
		this.numberOfPositions = numberOfPositions;
	}

	@Override
	public String encrypt(String plaintext) {
		this.nstring = plaintext;
		char[] buffer = plaintext.toCharArray();

		// Loop over characters.
		for (int i = 0; i < buffer.length; i++) {

		    // Shift letter, moving back or forward 26 places if needed.
		    char letter = buffer[i];
		    letter = (char) (letter + numberOfPositions);
		    if (letter > 'z') {
			letter = (char) (letter - 26);
		    } else if (letter < 'a') {
			letter = (char) (letter + 26);
		    }
		    buffer[i] = letter;
		}
		// Return final string.
		return new String(buffer);
	    }

	@Override
	public String decrypt(String ciphertext) {
		// Return final string.
		return nstring;
	    }
	
	
	
	
	
	
	
	public static void main(String[] args){
	    CaesarCipher cipher = new CaesarCipher(3);
	    String plainText = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    System.out.println("Plaintext: " + plainText);
	    String cipherText = cipher.encrypt(plainText);
	    System.out.println("After encryption, cipherText: " + cipherText);
	    String backToPlainText = cipher.decrypt(cipherText);
	    System.out.println("After decryption, plainText: " + backToPlainText);
	    if(!plainText.equals(backToPlainText))
	        System.err.println("Fix your program!");
	}

}
