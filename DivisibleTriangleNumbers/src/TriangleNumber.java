public class TriangleNumber {

    private static int getNth(int n){
        if(n == 1){
            return 1;
        }
        return n + (getNth(n-1));
    }

    private static int findNumDivisors(int n){
        int numDivisors = 2;

        if(Math.sqrt(n) % 1 == 0){
            numDivisors++;
        }

        for(int i = 2; i<n; i++){
            if(i!=Math.sqrt(n)){
                if(((double)n/i)%1==0){
                    numDivisors++;
                }
            }
        }
        return numDivisors;
    }

    public static void main(String[] args){
        int maxDivisors = 0;
        int k = 1;

        while(maxDivisors <=500){
            if(findNumDivisors(getNth(k))>maxDivisors){
                maxDivisors = findNumDivisors(getNth(k));
                System.out.println(maxDivisors);
            }
            k++;
        }
        System.out.println(getNth(k-1));
        System.out.println(k);
        System.out.println(findNumDivisors(getNth(k)));
    }
}
