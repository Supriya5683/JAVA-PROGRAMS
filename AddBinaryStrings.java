import java.math.BigInteger;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String binary1 = "1011"; 
        String binary2 = "1101"; 

        
        BigInteger num1 = new BigInteger(binary1, 2);
        BigInteger num2 = new BigInteger(binary2, 2);

        
        String result = num1.add(num2).toString(2);

        System.out.println("Sum: " + result); 
    }
}
