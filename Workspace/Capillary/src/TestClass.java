import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        // Read input from stdin and provide input before running
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        // So s[0] contains i and s[1] contains j. 
        // Parse s[0] and s[1] and proceed with your logic
        
        BigInteger i= new BigInteger(s[0]).abs();
        BigInteger j= new BigInteger(s[1]).abs();
        if(((j.subtract(i)).compareTo(new BigInteger("1000000000000000000")))==-1 || ((j.subtract(i)).compareTo(new BigInteger("1000000000000000000")))==0){
        
        BigInteger total[] = (((j.add(new BigInteger("1"))).multiply(j))).divideAndRemainder(new BigInteger("2"));
        BigInteger tot[]= (((i.add(new BigInteger("1"))).multiply(i))).divideAndRemainder(new BigInteger("2"));;
        
        System.out.println(total[0].subtract(tot[0]).add(new BigInteger("99")));
        System.out.println(tot[1]);
        	
        }
    }
}
