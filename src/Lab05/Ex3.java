package Lab05;

public class Ex3 {
    public static void main(String[] args) {
        changeWord("С камушка на камушек порхал легкомысленный, бяка, воробышек а на прилежно оштукатуренной" +
                        " террасе искусно задрапированной, бяка, гобеленами с дефензивой кронштадтского батальона...",
                "бяка", "[вырезано цензурой]");
    }

    public static String changeWord(String text, String noCensorWord, String censoredText) {
        int index = text.indexOf(noCensorWord);
        if (index >= 0) {
            text = text.replaceAll(noCensorWord, censoredText);
        }
        System.out.println(text);
        return text;
    }
}