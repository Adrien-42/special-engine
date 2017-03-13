public class class1 {
    //Returns side if valid, otherwise returns zero
    public static int triangleChecker(int x, int y){
        int bigger;
        int smaller;

        if(x>y){
            bigger=x;
            smaller=y;
        }else{
            bigger=y;
            smaller=x;
        }

        double side1 = Math.sqrt((bigger*bigger)+(smaller*smaller));
        double side2 = Math.sqrt((bigger*bigger)-(smaller*smaller));

        if(side1/((int)side1)==1.0){
            return (int)side1;
        }else if(side2/((int)side2)==1.0){
            return (int)side2;
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println(triangleChecker(3, 5));
        System.out.println(triangleChecker(20, 12));
        System.out.println(triangleChecker(20, 14));
        System.out.println(triangleChecker(2, 2));
    }
}
