import java.util.ArrayList;
import java.util.List;

public class SumRun {
    public List<Integer> sumRun(int n){
        List<Integer> largest = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        int count = 0;
        int currentSum = 0;

        for(int i = (n/2)+1; i > 0; i--){
            currentSum=n;
            for(int j = i; j >0; j--){
                currentSum = currentSum-j;
                if(!(currentSum<0)){
                    current.add(j);
                }
            }
            if(current.size()<largest.size()){
                largest = new ArrayList<>(current);
            }
        }

        return largest;
    }
}