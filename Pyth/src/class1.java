public class class1 {
    //Returns side if valid, otherwise returns zero
    public int triangleChecker(int x, int y){
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
}
