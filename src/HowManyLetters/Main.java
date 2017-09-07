package HowManyLetters;


public class Main {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <args.length ; i++) {
            String word = args[i];
            char []lettersInWord = word.toLowerCase().toCharArray();
            String pattern = args[0];

            for (int j = 0; j <lettersInWord.length ; j++) {
                if (pattern.contains(String.valueOf(lettersInWord[j]))){
                    counter++;
            }
            }
        }
        System.out.println(counter);


    }
}
