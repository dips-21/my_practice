package loops;

public class MatchPairForLift {
    static int matchPairForLiftEntry(int weightOfmale[], int weightOfFemale[], String MaleNames[], String femaleNames[]) {
        int count = 0;
        for (int i = 0; i < weightOfmale.length; i++)
           {
                int sum = weightOfmale[i] + weightOfFemale[i];
                if (sum == 46) {
                    System.out.println("you can enter");
                    System.out.println(MaleNames[i]+"->"+femaleNames[i]);
                    count++;
                }
                else
                {
                    System.out.println("you cannot enter");
                    System.out.println(MaleNames[i]+"->"+femaleNames[i]);
                }
            }
        return count;
    }
    public static void main(String[] args) {
        String maleNames[] = {"Harshal", "Vedant", " Akshay", "Prasad", "Jayant"};
        String femaleNames[] = {"Sanjana", "Trushali", "Jaanhvi", "Vishakha", "Smita"};
        int weightOfMale[] = {25, 35, 36, 29, 27};
        int weightOfFemale[] = {21, 24, 35, 36, 19};
        matchPairForLiftEntry(weightOfMale,weightOfFemale,maleNames,femaleNames);
    }
}
