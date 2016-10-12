public interface Cipher {
	public String encrypt(String plaintext);
	// Takes the String argument called plaintext and return its encrypted version
	
	public String decrypt(String ciphertext);
	// takes the ciphertext, which is encrypted, and returns its decrypted version 
	//as a plaintext String
	
}
