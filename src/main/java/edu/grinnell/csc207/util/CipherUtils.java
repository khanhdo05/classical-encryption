package edu.grinnell.csc207.util;

/**
 * CipherUtils: Contains utility methods for encryption and decryption.
 */
public class CipherUtils {
  /**
   * Converts a letter to its corresponding integer value.
   *
   * @param letter the letter to be converted (char)
   *
   * @return the integer value of the letter (int)
   */
  private static int letter2int(char letter) {
    return (int) letter - (int) 'a';
  } // letter2int(char)

  /**
   * Converts an integer to its corresponding letter.
   *
   * @param i the integer to be converted (int)
   *
   * @return the letter corresponding to the integer (char)
   */
  private static char int2letter(int i) {
    int modResult = i % 26;

    if (modResult < 0) {
      modResult += 26;
    } // handle negative mod

    return (char) (modResult + (int) 'a');
  } // int2letter(int)

  /**
   * Caesar encrypt a string by a given letter.
   *
   * @param str the string to be encrypted (String)
   *
   * @param letter the letter to be used for encryption (char)
   *
   * @return the string encrypted (String)
   */
  public static String caesarEncrypt(String str, char letter) {
    char[] input = str.toCharArray();

    for (int i = 0; i < input.length; i++) {
      input[i] =
          CipherUtils.int2letter(CipherUtils.letter2int(letter) + CipherUtils.letter2int(input[i]));
    } // for loop that encrypt each character

    return new String(input);
  } // caesarEncrypt(String, char)

  /**
   * Caesar decrypt a string by a given letter.
   *
   * @param str the string to be decrypted (String)
   *
   * @param letter the letter to be used for decryption (char)
   *
   * @return the string decrypted (String)
   */
  public static String caesarDecrypt(String str, char letter) {
    char[] input = str.toCharArray();

    for (int i = 0; i < input.length; i++) {
      input[i] =
          CipherUtils.int2letter(CipherUtils.letter2int(letter) - CipherUtils.letter2int(input[i]));
    } // for loop that decrypt each character

    return new String(input);
  } // caesarDecrypt(String, char)

  /**
   * Vigenere encrypt a string by a given key.
   *
   * @param str the string to be encrypted (String)
   *
   * @param key the key to be used for encryption (String)
   *
   * @return the string encrypted (String)
   */
  public static String vigenereEncrypt(String str, String key) {
    // avoid division by zero
    if (key.length() == 0) {
    return str;
    } // if key is empty, return original string

    char[] input = str.toCharArray();
    char[] keyChars = key.toCharArray();

    for (int i = 0; i < input.length; i++) {
      input[i] = CipherUtils.int2letter(
          CipherUtils.letter2int(input[i]) + CipherUtils.letter2int(keyChars[i % keyChars.length]));
    } // for loop that encrypt each character

    return new String(input);
  } // vigenereEncrypt(String, String)

  /**
   * Vigenere decrypt a string by a given key.
   *
   * @param str the string to be decrypted (String)
   *
   * @param key the key to be used for decryption (String)
   *
   * @return the string decrypted (String)
   */
  public static String vigenereDecrypt(String str, String key) {
    return str;
  } // vigenereDecrypt(String, String)
} // class CipherUtils
