public class NumberFinder {
    public int multipleFinder(int max, int multiple){
        int total = 0;
        for(int i = 0; i<max; i++){
            if(i%multiple==0){
                total = total+i;
            }
        }
        return total;
    }

    public static void main(String[] args){
        NumberFinder find = new NumberFinder();

        System.out.println(find.multipleFinder(1000, 3)+find.multipleFinder(1000, 5)-find.multipleFinder(1000, 15));
    }
}