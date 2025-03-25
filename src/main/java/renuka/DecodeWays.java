package renuka;

public class DecodeWays {
    public int numDecodings(String s) {
        return waysToDecodeFromIndex(s, 0);
//        return waysToDecodeFromIndexByDP(s, 0, new int[s.length()]);
    }
//12                 take 12
//2 (take 1)       (index =2)
//    take 2, index 2
    public int waysToDecodeFromIndex(String str, int index) {
        if (str.length() == index) {
            return 1;
        }
        if (str.length() < index) {
            return 0;
        }
        int count = 0;
        if(str.charAt(index)=='0'){
            return 0;
        }
        count += waysToDecodeFromIndex(str, index + 1);
        int current = Character.getNumericValue(str.charAt(index));

        if (index < str.length() - 1) {
            int next = Character.getNumericValue(str.charAt(index + 1));
            if ((current * 10 + next) <= 26) {
                count += waysToDecodeFromIndex(str, index + 2);
            }
        }
        return count;
    }
}

