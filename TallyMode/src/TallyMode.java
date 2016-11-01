public class TallyMode {
    //Todo: find way to get location based on number of the mode
    public int getModes(int[] arr){
        int[] highest = new int[arr.length];
        int placeInArray = 1;

        for(int i=0; i < arr.length; i++){
            if (highest[0] < arr[i]){
                highest[0] = arr[i];
            }else if (highest[0] == arr[i]){
                highest[placeInArray] = arr[i];
                placeInArray++;
            }
        }
        for(int i=0; i<highest.length; i++ ){
            if(highest[i]!=0){
                return highest[i];
            }
        }
        System.out.println("Error: No Integers in Array");
        return -1;
    }
    public static void main(String[] args){

    }
}
