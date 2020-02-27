package company.dz4;


public class Task19MethodClass {
    private static String text = "     Подсчитать количество слов в тексте, со знаками припенания! ;   ";

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        Task19MethodClass.text = text;
    }

    public static void main(String[] args) {
    printText(getText());
    spacesOut(getText());
    punctuationOut(text.trim());
    int a =  spacesNumbers(text.trim().replaceAll("[;:?!,.()]", ""));
    printNumbers(a);
    }
    /**
     решил, но не красиво
     */
    private static void printNumbers(int numbersWords) {
        System.out.println(numbersWords);
    }

    private static int spacesNumbers(String stringWithoutPunctuation ) {
        int numbersWords = 0;
        char symbol;
        for (int i = 0; i < stringWithoutPunctuation.length(); i++) {
            symbol = stringWithoutPunctuation.charAt(i);
            if (symbol == ' ') {
                numbersWords++;
            }
        }
       return numbersWords;
    }
    private static String punctuationOut(String stringWithoutSpaces) {
        String stringWithoutPunctuation
                = stringWithoutSpaces.replaceAll("[;:?!,.()]", "");
        System.out.println(stringWithoutPunctuation);
        return stringWithoutSpaces.replaceAll("[;:?!,.()]", "");
    }

    private static String spacesOut(String text) {
        String stringWithoutSpaces = text.trim();
        System.out.println(stringWithoutSpaces);
        return stringWithoutSpaces;
    }

    private static void printText(String text) {
        System.out.println(getText());
    }
}
