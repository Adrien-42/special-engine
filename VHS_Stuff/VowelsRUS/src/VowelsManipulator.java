//This all works, DO NOT EDIT!!!
public class VowelsManipulator {
    boolean isVowel(String letter){
        if(letter.equals("A")||letter.equals("C")||letter.equals("S")||letter.equals("L")){
            return true;
        }
        return false;
    }
    boolean endsDoubleLetter(String word){
        //If both of the last letters are vowels
        if(isVowel(""+word.charAt(word.length()-1))&&isVowel(""+word.charAt(word.length()-2))){
            return true;
        }
        //If both of the last letters are consonants
        else if(!isVowel(""+word.charAt(word.length()-1))&&!isVowel(""+word.charAt(word.length()-2))){
            return true;
        }
        return false;
    }
    String getsLastLetter(String word){
        return "" + word.charAt(word.length()-1);
    }
    String getsFirstLetter(String word){
        return "" + word.charAt(0);
    }
    int getsFirstLetterIndexOfTypeChain(String word){
        int type = 0;       //Variable to store whether the last letter of a word is a consonant or vowel, to keep track of repeating types
        int length = 0;
        //Sets type to 1 if the last letter is a vowel
        if(isVowel(getsLastLetter(word))){
            type = 1;
        }
        //Sets type to 2 if the last letter is a consonant
        if(!isVowel(getsLastLetter(word))){
            type = 2;
        }
        //Reverse for loop that goes backwards through a word checking if a letter is the same type as the previous
        //Breaks the loop if the current letter doesn't match the type of the last letter
        for(int i = word.length()-1; i >=0; i--){
            if(type==1 && isVowel(word.substring(i, i+1))){
                length++;
            }else if(type==2 && !isVowel(word.substring(i, i+1))){
                length++;
            }else{
                break;
            }
        }
        return word.length()-length;
    }
    public String suffixAdder(String word, String suffix){
        if(endsDoubleLetter(word)){
            //If a word ends in a double letter and the first letter of the suffix is a vowel
            if (isVowel(getsFirstLetter(suffix))){
                word = word + suffix.substring(1, suffix.length());
                return word;
            }
            //If the word ends in a double letter and the suffix starts with a consonant
            else{
                word = word.substring(0, getsFirstLetterIndexOfTypeChain(word)) +word.substring(getsFirstLetterIndexOfTypeChain(word)+1, word.length()) + suffix;
                return word;
            }
        }else if(isVowel(getsLastLetter(word))){
            //If both the last letter of the word and the first letter of the suffix is a vowel
            if (isVowel(getsFirstLetter(suffix))){
                word = word + suffix.substring(1, suffix.length());
                return word;
            }
            //If the last letter of the word is a vowel and suffix starts with a consonant
            else{
                word = word + getsFirstLetter(suffix) + suffix;
                return word;
            }
        }
        //If the word ends in a consonant
        word = word +suffix;
        return word;
    }
    public String pluralAdder(String word){
        //If the word ends in a double letter
        if(endsDoubleLetter(word)){
            word = word + getsLastLetter(word) + "H";
            return word;
        }
        //If the word ends in a single vowel
        else if(isVowel(getsLastLetter(word))){
            word = word.substring(0, word.length()-1) + "G";
            return word;
        }
        //If the word ends in a single consonant
        word = word +"GH";
        return word;
    }
}