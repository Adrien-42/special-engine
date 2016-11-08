import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ProductFinder {
    public boolean palindromeChecker(int number){
        String potentialPalindrome = Integer.toString(number);
        String subString1;
        String subString2;
        String subString3;

        if(potentialPalindrome.length()%2==0){
            subString1 = potentialPalindrome.substring(0, (potentialPalindrome.length()/2));
            subString3 = potentialPalindrome.substring((potentialPalindrome.length())/2, potentialPalindrome.length());
            subString2 = new StringBuffer(subString1).reverse().toString();

            if(Objects.equals(subString2, subString3)){
                return true;
            }
            return false;
        } else{
            subString1 = potentialPalindrome.substring(0, ((potentialPalindrome.length()-1)/2));
            subString3 = potentialPalindrome.substring((potentialPalindrome.length()+1)/2, potentialPalindrome.length());
            subString2 = new StringBuffer(subString1).reverse().toString();

            if(Objects.equals(subString2, subString3)){
                return true;
            }
            return false;
        }
    }
    //???
    public int greatestPalindrome() {
        int greatest = 0;
        for(int i = 100; i <=999; i++){
            for(int j = 100; j <=999; j++){
                if(palindromeChecker(i*j) && i*j > greatest){
                    greatest = i*j;
                    System.out.println(greatest + " = "+ i + " * " + j);
                    try {
                        TimeUnit.MILLISECONDS.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return greatest;
    }
    public static void main(String[] args){
        ProductFinder finder = new ProductFinder();

        System.out.println(finder.greatestPalindrome());
    }
}