package loops;

public class CountAgeForLift {
    static int countTotalNumberOfMatches(int[] weightOfMale, int[] weightOfFemale, String[] maleNames, String[] femaleNames){
        int count = 0;
        for (int i = 0; i < weightOfMale.length; i++) {
            for (int j = 0; j < weightOfMale.length; j++) {
                if (weightOfMale[i] < weightOfFemale[j]) {
                    System.out.print("MATCH POSSIBLE ");
                    count++;
                    System.out.println(maleNames[i]+"->"+femaleNames[j]);

                } else {
                    System.out.print("NOT POSSIBLE ");
                    System.out.println(maleNames[i]+"->"+femaleNames[j]);
                }
                System.out.print(weightOfMale[i] + "->" + weightOfFemale[j]);
                System.out.println();
            }
        }
        return count;

    }
    public static void main(String[] args) {
        String[] maleNames = {"rohan", "rahul", " akshay", "saurav", "jayant"};
        String[] femaleNames = {"rupali", "nita", "neha", "anjali", "nisha"};
        int[] weightOfMale = {25, 35, 36, 29, 27};
        int[] weightOfFemale = {21, 24, 35, 36, 19};

        //print
        for (int i = 0; i < weightOfMale.length; i++) {
            System.out.print(weightOfMale);
        }

        for (int j = 1; j < weightOfMale.length; j++) {
            System.out.print(weightOfFemale);
        }
        countTotalNumberOfMatches(weightOfMale,weightOfFemale,maleNames,femaleNames);


    }
}
