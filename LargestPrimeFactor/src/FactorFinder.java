import java.util.ArrayList;

public class FactorFinder {
    public boolean primeChecker(long potentialPrime){
        for(int i = 2; i < potentialPrime; i++){
            if(potentialPrime==1){
                return false;
            }else if((potentialPrime%i)==0){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Long> primeFactorFinder(long number){
        ArrayList<Long> array = new ArrayList<>();
        ArrayList<Long> arrayFinal = new ArrayList<>();

        if(primeChecker(number)){
            array.add(0, (long) 1);
            array.add(1, number);
            return array;
        }
        for(int i = 1; (long)i <= number; i++){
            if(number%(long)i == 0){
                array.add(array.size(), (long) i);
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

        System.out.println(prime.primeFactorFinder(600851475143L));
    }
}
