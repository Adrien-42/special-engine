import java.util.ArrayList;

public class Simplifier {
    //Returns the simplified fraction
    public static ArrayList<ArrayList<Character>> simplfiy(ArrayList<Character> numerator, ArrayList<Character> denominator){
        ArrayList<ArrayList<Character>> fraction = new ArrayList<>();

        for(int i=0; i<denominator.size(); i++){
            for(int j=0; j<numerator.size(); j++){
                if(denominator.get(i).equals(numerator.get(j))){
                    denominator.remove(i);
                    numerator.remove(j);
                    if(i!=0){
                        i--;
                    }
                    if(j!=0) {
                        j--;
                    }
                }
            }
        }
        if(denominator.get(0).equals(numerator.get(0))){
            denominator.remove(0);
            numerator.remove(0);
        }

        if(numerator.size()==0){
            numerator.add('1');
        }
        if(denominator.size()==0){
            denominator.add('1');
        }

        fraction.add(numerator);
        fraction.add(denominator);

        return fraction;
    }

    //Turns Strings into lists of char
    public static ArrayList<Character> characterizer(String str){
        ArrayList<Character> letters = new ArrayList<>();
        for(int i = 0; i<str.length(); i++){
            letters.add(str.charAt(i));
        }
        return letters;
    }

    public static ArrayList<Character> equationizer(ArrayList<Character> vars, char equation, ArrayList<Character> equationValues){
        for(int i = 0; i<vars.size(); i++){
            if(equation==vars.get(i)){
                vars.remove(i);
                for(int j = 0; j<equationValues.size(); j++){
                    vars.add(equationValues.get(j));
                }
            }
        }
        return vars;
    }

    public static void main(String[] args){
        Simplifier sim = new Simplifier();
        String num = "abcdxP";
        String den = "abcdep";
        char equ = 'x';
        String values = "ek";

        System.out.println(simplfiy(equationizer(characterizer(num), equ, characterizer(values)),characterizer(den)));
    }
}