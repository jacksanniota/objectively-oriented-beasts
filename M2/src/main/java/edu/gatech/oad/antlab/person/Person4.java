package edu.gatech.oad.antlab.person;
/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Chris Sewell
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private static String calc(String input) {
      char[] characters = input.toCharArray();
      for (int x = 0; x < characters.length; x++) {
        characters[x] = (char) (characters[x] + 1);
      }
      return new String(characters);
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

}

