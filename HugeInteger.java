
//. Method parse should receive a String, extract each digit using method charAt and place the integer
//equivalent of each digit into the integer array.

public class HugeInteger {

  private int[] digits;
  private int size;

  public String parse(String value) {

    size = value.length();
    digits = new int[size];
    for (int index = 0; index < size; index++) {
      digits[index] = Character.getNumericValue(value.charAt(index));
    }
    return value;
  }

  public static void main(String[] args){
    HugeInteger hugeInteger = new HugeInteger();
    System.out.println(hugeInteger.parse("1234567890123456789012345678901234567890"));
  }
}