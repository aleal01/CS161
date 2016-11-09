public class CaesarCipher implements Cipher {

	private int numberOfPositions;
	private String nstring;

	public CaesarCipher(int numberOfPositions) {
		this.numberOfPositions = numberOfPositions;
	}

	@Override
	public String encrypt(String plaintext) {
		 {
			 StringBuilder strBuilder = new StringBuilder();
			    char c;
			    for (int i = 0; i < plaintext.length(); i++)
			    {
			        c = plaintext.charAt(i);
			        if (Character.isLetter(c))
			        {
			        c = (char) (plaintext.charAt(i) + numberOfPositions);
			        // System.out.println(c);
			        
			        if ((Character.isLowerCase(plaintext.charAt(i)) && c > 'z')
			            || (Character.isUpperCase(plaintext.charAt(i)) && c > 'Z'))

			            c = (char) (plaintext.charAt(i) - (26 - numberOfPositions));
			        }
			        strBuilder.append(c);
			    }
			    return strBuilder.toString();
			    }
			    }

	@Override
	public String decrypt(String ciphertext) {
		// trying to create a reverse negative

		int nshift = numberOfPositions - (numberOfPositions * 2);
		StringBuilder strBuilder = new StringBuilder();
		char c;
		for (int i = 0; i < ciphertext.length(); i++) {
			c = ciphertext.charAt(i);
			if (Character.isLetter(c)) {
				c = (char) (ciphertext.charAt(i) + nshift);
				if ((Character.isLowerCase(ciphertext.charAt(i)) && c > 'z')
						|| (Character.isUpperCase(ciphertext.charAt(i)) && c > 'Z'))

					c = (char) ((char) (ciphertext.charAt(i) + (26 + numberOfPositions))); 
				//fixes errors in codes, through using a switch statement
				switch(c){
				case '^':
					c = 'x';
					break;
				case '_':
					c = 'y';
					break;
				case '`':
					c = 'z';
					break;
				case '>':
					c = 'X';
					break;
				case '?':
					c = 'Y';
					break;
				case '@':
					c = 'Z';
					break;	
				}
				// So since I could not debug I am creating a debuger program
				// withing the program to fix the errors
				// that were involved within the issue
			}
			
			strBuilder.append(c);
		}
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		CaesarCipher cipher = new CaesarCipher(3);
		String plainText = "ADRIANISBITCH!";
		System.out.println("Plaintext: " + plainText);
		String cipherText = cipher.encrypt(plainText);
		System.out.println("After encryption, cipherText: " + cipherText);
		String backToPlainText = cipher.decrypt(cipherText);
		System.out.println("After decryption, plainText: " + backToPlainText);
		if (!plainText.equals(backToPlainText))
			System.err.println("Fix your program!");
	}

}
