package Practice2017;

public class PhraseMain {
    public static void main(String[] args) {
        Phrase phrase1 = new Phrase("A cat ate late.");
        phrase1.replaceNthOccurrence("bat", 2, "rane");
        System.out.println(phrase1);

        Phrase phrase2 = new Phrase("aaaa");
//        phrase2.replaceNthOccurrence("aa", 3, "bbb");
//        System.out.println(phrase2);

        System.out.println(phrase1.findLastOccurrence("bat"));
        System.out.println(phrase2.findLastOccurrence("aa"));
    }
}
