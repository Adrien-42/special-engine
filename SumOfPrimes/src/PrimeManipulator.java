import java.util.concurrent.TimeUnit;

public class PrimeManipulator {
    public boolean primeChecker(int potentialPrime){
        for(int i = 2; i < (potentialPrime/2); i++){
            if(potentialPrime==1){
                return false;
            }else if((potentialPrime%i)==0){
                return false;
            }
        }
        return true;
    }
    public int primeSummer(int max){
        int total = 0;
        for(int i =1; i <=max; i++){
            if(primeChecker(i)){
                total = total + i;
                System.out.println(total);
                try {
                    TimeUnit.MILLISECONDS.sleep(250);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return total;
    }
    public static void main(String[] args){
        PrimeManipulator prime = new PrimeManipulator();

        System.out.println(prime.primeSummer(2000000));
    }
}