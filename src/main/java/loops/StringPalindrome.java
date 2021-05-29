package loops;

public class StringPalindrome {

    static boolean isEqual(char[] first, char[] second) {
        if (first.length != second.length) {
            return false;
        }
        int firstIndex = 0, secondIndex = 0;
        while (firstIndex <first.length && secondIndex < first.length) {
            if (first[firstIndex] != second[secondIndex]) {
                return false;
            }
            firstIndex++;
            secondIndex++;
        }
        return true;

    }
}

/*while (firstIndex < first.length && secondIndex < second.length) {
        if (first[firstIndex] != second[secondIndex]) {
        return false;
        }
        firstIndex++;
        secondIndex++;
        }
        return true;
        }*/