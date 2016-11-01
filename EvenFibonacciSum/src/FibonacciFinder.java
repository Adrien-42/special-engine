public class FibonacciFinder {
    public int nthTerm(int term){
        int lastFibNum =0;
        int fibNum = 1;
        int newFibNum;

        for(int i=0; i<term; i++ ){
            newFibNum = fibNum+lastFibNum;
            lastFibNum = fibNum;
            fibNum = newFibNum;
        }
        return fibNum;
    }
    public int isEvenSum(int max){
            int currentFibNum = 0;
            int currentTerm = 1;
            int total = 0;
        while (currentFibNum < max){
            currentFibNum = nthTerm(currentTerm);
            currentTerm++;
            if(currentFibNum%2==0) {
                total = total + currentFibNum;
            }
        }
        return total;
    }
    public static void main(String[] args){
        FibonacciFinder fib = new FibonacciFinder();

        System.out.println(fib.isEvenSum(4000000));
    }
}