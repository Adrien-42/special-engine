public class IntMaker {
    public int string2Int(String toInt){
        int temp = 0;
        int multiplier = 1;
        for(int i=toInt.length()-1; i>=0; i--){
            switch(toInt.charAt(i)){
                case '0':
                    break;
                case '1':
                    temp = multiplier + temp;
                    break;
                case '2':
                    temp = 2*multiplier + temp;
                    break;
                case '3':
                    temp = 3*multiplier + temp;
                    break;
                case '4':
                    temp = 4*multiplier + temp;
                    break;
                case '5':
                    temp = 5*multiplier + temp;
                    break;
                case '6':
                    temp = 6*multiplier + temp;
                    break;
                case '7':
                    temp = 7*multiplier + temp;
                    break;
                case '8':
                    temp = 8*multiplier + temp;
                    break;
                case '9':
                    temp = 9*multiplier + temp;
                    break;
            }
            multiplier = multiplier*10;
        }
        return temp;
    }
    public boolean intChecker(String potInt){
        for(int i = 0; i< potInt.length();){
            if(potInt.charAt(i)>='0' && potInt.charAt(i)<='9'){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        IntMaker make = new IntMaker();

        if(make.intChecker("1234")){
            System.out.println(make.string2Int("1234")+5);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
