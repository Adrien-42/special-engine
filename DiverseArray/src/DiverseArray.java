public class DiverseArray {
    public static int arraySum(int[] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total = total + arr[i];
        }
        return total;
    }
    public static int[] rowSums(int[][] arr2D){
        int[] summedArray = new int[arr2D.length];
        for(int i = 0; i < arr2D.length; i++){
            summedArray[i] = arraySum(arr2D[i]);
        }
        return summedArray;
    }
    public static boolean isDiverse(int[][] arr2D){
        int greatestValue = 0;
        int[] sums = rowSums(arr2D);

        for(int i = 0; i < sums.length; i++){
            if(sums[i] > greatestValue){
                greatestValue = sums[i];
            }
        }

        boolean[] usedValue = new boolean[greatestValue];

        for(int i = 0; i <sums.length; i++){
            if(!usedValue[sums[i]]){
                usedValue[sums[i]] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}