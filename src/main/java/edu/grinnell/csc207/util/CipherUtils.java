package edu.grinnell.csc207.util;

/*  
 * CipherUtils: Contains utility methods for encryption and decryption.
 */
public class CipherUtils {
  /*
   *  Converts a letter to its corresponding integer value
   *  @param letter the letter to be converted (char)
   *  @return the integer value of the letter (int)
   */
  private static int letter2int(char letter) {
    return 0; // STUB
  }

  private static int int2letter(int i) {
    return 'a'; // STUB
  }

  public static String caesarEncrypt(String str, char letter) {
    return str; // STUB
  }

  public static String caesarDecrypt(String str, char letter) {
    return str; // STUB
  }

  public static String vigenereEncrypt(String str, String key) {
    return str; // STUB
  }

  public static String vigenereDecrypt(String str, String key) {
    return str;
  }
} // class CipherUtils