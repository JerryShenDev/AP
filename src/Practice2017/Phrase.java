package Practice2017;

public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }

    public int findNthOccurrence(String str, int n) {
        int nth = 0;
        int offset = 0;
        String tempPhrase = currentPhrase;
        for (int i = 0; i < currentPhrase.length(); i++) {
            int pos = tempPhrase.indexOf(str);
            if (pos == -1) {
                return -1;
            }
            if (++nth == n) {
                return pos + offset;
            }
            tempPhrase = tempPhrase.substring(pos + 1);
            offset += pos + 1;
        }
        return -1;
    }

    public void replaceNthOccurrence(String str, int n, String repl) {
        int pos = findNthOccurrence(str, n);
        if (pos != -1) {
            String f = currentPhrase.substring(0, pos);
            String s = currentPhrase.substring(pos + str.length());
            currentPhrase = f + repl + s;
        }
    }

    public int findLastOccurrence(String str)
    {
        int n = 1;
        int index = -1;
        int nextIndex = findNthOccurrence(str, n);

        while(nextIndex != -1)
        {
            index = nextIndex;
            n++;
            nextIndex = findNthOccurrence(str, n);
        }

        return index;
    }

    public String toString() {
        return currentPhrase;
    }

}