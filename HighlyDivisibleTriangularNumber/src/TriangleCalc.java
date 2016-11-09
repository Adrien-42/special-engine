public class TriangleCalc {

    public int NthTriangleFinder(int max){
        int total =0;
        for(int i = 1; i<=max; i++){
            total = i + total;
        }
        return total;
    }
    public int factorFinder(int max){
        int factors =1;

        for(int i = 1; i<=(max/2); i++){
            if(max%i==0){
                factors++;
            }
        }
        return factors;
    }
    public static void main(String[] args){
        TriangleCalc calc = new TriangleCalc();

        int factors=0;
        int total =0;
        while(factors <=500){

            for(int i = 1; i<=max; i++) {
                total = i + total;

                factors = calc.factorFinder(i);
                i++;
            }
        }
        System.out.println(i);
    }
}