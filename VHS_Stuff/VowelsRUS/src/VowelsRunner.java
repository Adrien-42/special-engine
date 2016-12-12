/*Author: Adrien Vreeland

School: Foxborough Regional Charter School

Project: Vowels-R-Us

Date: December 11th, 2016*/
public class VowelsRunner {
    VowelsManipulator mod = new VowelsManipulator();

    public void printResults(String word, String suffix){
        System.out.println("Original String : " + word + " " + suffix);
        System.out.println("Plural : " + mod.pluralAdder(word));
        System.out.println("Suffix : " + mod.suffixAdder(word, suffix));
    }
    public static void main(String[] args) {
        VowelsRunner run = new VowelsRunner();
        run.printResults("SNIC", "SY");
    }
}