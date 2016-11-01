public class ProductFinder {
    public int multiplier(int num1, int num2){
        return num1*num2;
    }
    public boolean palindromeChecker(int number){
        String potentialPalindrome = Integer.toString(number);
        String subString1;
        String subString2;

        if(potentialPalindrome.length()%2==0){
            subString1 = potentialPalindrome.substring(0, (potentialPalindrome.length()/2));
            System.out.println(subString1);
            subString2 = new StringBuffer(subString1).reverse().toString();
            System.out.println(subString2);

            //Switch to contain substring?
            if(subString2 == potentialPalindrome.substring(potentialPalindrome.length()/2, potentialPalindrome.length())){
                return true;
            }
            return false;
        } else{
            subString1 = potentialPalindrome.substring(0, (potentialPalindrome.length()/2)-2);
            subString2 = new StringBuffer(subString1).reverse().toString();

            if(subString2 == potentialPalindrome.substring((potentialPalindrome.length()/2)+1, potentialPalindrome.length()-1)){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args){
        ProductFinder finder = new ProductFinder();

        System.out.println(finder.palindromeChecker(9009));
    }
}
