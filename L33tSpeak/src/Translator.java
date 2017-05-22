public class Translator {
    static String[] L33T = {"4", "6", "3", "1", "1", "(V)", "/(//)", "0", "5", "7", "\\/", "'//"};
    static String[] eng = {"A","B","E","I","L","M","N","O","S","T","V","W"};

    static String l33tConverter(String n){
        String[] wordArr = n.toUpperCase().split("");
        String word = "";

        for(int j = 0; j<wordArr.length; j++){
            for(int k = 0; k < L33T.length; k++){
                if(eng[k].equals(wordArr[j])){
                    wordArr[j]=L33T[k];
                }
            }
        }

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < wordArr.length; i++){
            str.append(wordArr[i]);
        }
        word = str.toString();
        return word;
    }

    static String engConverter(String n){
        String word = new String(n);
        if(n.contains(L33T[5])){
            word = n.replaceAll(L33T[5], "M");
        }else if(n.contains(L33T[6])){
            word = n.replaceAll(L33T[6], "N");
        }else if(n.contains(L33T[10])){
            word = n.replaceAll(L33T[10], "V");
        }else if(n.contains(L33T[11])){
            word = n.replaceAll(L33T[11], "W");
        }

        String[] wordArr = word.toUpperCase().split("");

        for(int j = 0; j<wordArr.length; j++){
            for(int k = 0; k < L33T.length; k++){
                if(L33T[k].equals(wordArr[j])){
                    wordArr[j]=eng[k];
                }
            }
        }

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < wordArr.length; i++){
            str.append(wordArr[i]);
        }
        word = str.toString();
        return word;
    }

    public static void main(String[] args){
        System.out.println(l33tConverter("MEH"));
        System.out.println(l33tConverter("Wow"));
        System.out.println(engConverter("1"));
        System.out.println(engConverter("31337"));
        System.out.println(engConverter("'//0'//"));
    }
}
