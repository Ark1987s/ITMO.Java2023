package Lab05;

public class Ex3 {
    public static void main(String[] args) {
        String text = "С камушка на камушек порхал легкомысленный, бяка, воробышек а на прилежно оштукатуренной" +
                " террасе искусно задрапированной, бяка, гобеленами с дефензивой кронштадтского батальона...";
        String noCensorWord = "бяка";
        String censoredText = "[вырезано цензурой]";
        if (text.equals(changeWord(text, noCensorWord, censoredText))) {
            System.out.println("Нецензурные слова отсутствуют");
        } else {
            System.out.println(changeWord(text, noCensorWord, censoredText));
        }
    }

    public static String changeWord(String text, String noCensorWord, String censoredText) {
        int index = text.indexOf(noCensorWord);
        if (index >= 0) {
            text = text.replaceAll(noCensorWord, censoredText);
        }
        return text;
    }
}