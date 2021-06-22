package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    if(n<0)
      throw new ArithmeticException("Invalid Input");
    int digit =n;
    String str = "";
    for(int i=0; digit>0; i++) {
      str += digit%2;
      digit = digit/2;
    }
    String binary = "";
    for(int i=str.length()-1; i>=0; i--) {
      binary += str.charAt(i);
      return binary;
    }
  }
}
