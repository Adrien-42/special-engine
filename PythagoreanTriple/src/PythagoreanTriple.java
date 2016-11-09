public class PythagoreanTriple {
    public double hypotFinder(int a, int b){
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }
    public boolean tripleFinder(int a, int b){
        if(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))%1==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        PythagoreanTriple pyth = new PythagoreanTriple();

        for(int i = 1; i < 500; i++){
            for(int j = 1; j < 500; j++){
                if(pyth.tripleFinder(i, j) && (i+j+pyth.hypotFinder(i, j))==1000){
                    System.out.println(i + " " + j + " " + pyth.hypotFinder(i, j) + " = " + (i+j+pyth.hypotFinder(i, j)));
                    System.out.println(i*j*pyth.hypotFinder(i, j));
                }
            }
        }
    }
}
