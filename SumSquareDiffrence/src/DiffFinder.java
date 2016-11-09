public class DiffFinder {

    public int sumOfSquaresFinder(int max){
        int total = 0;

        for(int i = 0; i <= max; i++){
            total = i*i + total;
        }
        return total;
    }

    public int squareOfSumFinder(int max){
        int total = 0;

        for(int i = 0; i <= max; i++){
            total = total + i;
        }
        total = total*total;
        return total;
    }

    public static void main(String[] args){
        DiffFinder diff = new DiffFinder();

        System.out.println(diff.squareOfSumFinder(100)-diff.sumOfSquaresFinder(100));
    }
}
