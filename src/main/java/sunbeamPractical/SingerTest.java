package sunbeamPractical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingerTest {
    static SingerRecord singerRecord = new SingerRecord();

    public static void main(String[] args) {
        System.out.println("enter 1 to add ,2 to rem,3 for get,4 for search singer by name," +
                "5 for modify,6 for sort,7 fo display all singer");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter option ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter singer name age sex ,email contact rating ");
                    String name = scanner.next();
                    int age = scanner.nextInt();
                    String sex = scanner.next();
                    GENDER gender = GENDER.valueOf(sex);
                    String email = scanner.next();
                    int contact = scanner.nextInt();
                    int rating = scanner.nextInt();

                    Singer singer = new Singer(name, age, gender, email, contact, rating);
                    singerRecord.addSinger(singer);
                case 2:
                    System.out.println("remove singer name");
                    //singerList.remove();
                case 3:
                    System.out.println("modify singer name");
                case 4:
                    singerRecord.displayAllSinger();
                case 5:
                    break;
            }


        }
    }
}

