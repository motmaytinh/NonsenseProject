/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package nonsenseproject;


public enum filetype implements org.apache.thrift.TEnum {
  TXT(0),
  PDF(1),
  WORD(2);

  private final int value;

  private filetype(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static filetype findByValue(int value) { 
    switch (value) {
      case 0:
        return TXT;
      case 1:
        return PDF;
      case 2:
        return WORD;
      default:
        return null;
    }
  }
}
