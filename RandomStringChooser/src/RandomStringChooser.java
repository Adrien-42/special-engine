public class RandomStringChooser {
    String[] wordArray;

    RandomStringChooser(String [] arr){
        wordArray = arr;
    }

    boolean[] isUsed = new boolean[wordArray.length];
    int count = 0;

    String getNext(){
        int nextStringInt;
        String nextString;

        if(count < wordArray.length){
            do {
                nextStringInt = (int) (Math.random() * wordArray.length);
            } while (isUsed[nextStringInt]);

            isUsed[nextStringInt] = true;
            nextString = wordArray[nextStringInt];
            count++;
        }else{
            nextString = "NONE";
        }
        return nextString;
    }
}