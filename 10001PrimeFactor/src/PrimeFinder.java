public class PrimeFinder {
    public boolean primeChecker(int potentialPrime){
        for(int i = 2; i < potentialPrime; i++){
            if(potentialPrime==1){
                return false;
            }else if((potentialPrime%i)==0){
                return false;
            }
        }
        return true;
    }
    public int primeCounter(int max){
        int current = 1;
        for(int i= 1; i <=max;){
            current++;
            if(primeChecker(current)){
                i++;
            }
        }
        return current;
    }
    public static void main(String[] args){
        PrimeFinder prime = new PrimeFinder();

        System.out.println(prime.primeCounter(10001));
    }
}
