import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FactorFinder {
    public boolean primeChecker(double potentialPrime){
        for(int i = 2; i < potentialPrime; i++){
            if(potentialPrime==1){
                return false;
            }else if((potentialPrime%i)==0){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Double> primeFactorFinder(double number){
        ArrayList<Double> array = new ArrayList<>();
        ArrayList<Double> arrayFinal = new ArrayList<>();

        if(primeChecker(number)){
            array.add(0, (double) 1);
            array.add(1, number);
            return array;
        }
        for(int i = 1; (double)i <= number; i++){
            if(number%(double) i == 0){
                array.add(array.size(), (double) i);
                System.out.println(i);

                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        for(int i = 0; i < array.size(); i++){
            if(primeChecker(array.get(i))){
                arrayFinal.add(arrayFinal.size(), array.get(i));
            }
        }

        return arrayFinal;
    }
    public static void main(String[] args){
        FactorFinder prime = new FactorFinder();

        System.out.println(prime.primeFactorFinder(600851475143D));
    }
}