package sunbeamPractical;

import java.util.*;

//arman 4
//xyz 2--abc 4--arman 3---arjit 4
public class SingerRecord {
    List<Singer> singerList = new ArrayList<>();//util vali list\
    // SimpleLinkedList<Singer> singerList = new SimpleLinkedList<>();//meri vali list

    public void addSinger(Singer singer) {
        singerList.add(singer);
    }

    public void removeSinger(Singer singer) {
        singerList.remove(singer);
    }

    public void modifySingerByName(Singer singer) {
        Iterator<Singer> iterator = singerList.iterator();
        while (iterator.hasNext()) {
            Singer current = iterator.next();
            if (current.getName().equals(singer.getName())) {
                current.setAge(singer.getAge());
                current.setRating(singer.getRating());
            }
        }

      /*  for (int i = 0; i <singerList.size() ; i++) {
            Singer current=singerList.get(i);
            if(current.getName().equals(singer.getName())){
                current.setAge(singer.getAge());
                current.setRating(singer.getRating());
            }*/

    }

    public List<Singer> sortByRating() {

            //Arrays.sort();
            // Collections.sort(singerList);
            Comparator<Singer> ratingComparator = (singer1, singer2) -> {
                return Integer.compare(singer1.getRating(), singer2.getRating());
            };
            //Comparator<Singer> comparator=new AgeComparator();

            Collections.sort(singerList, ratingComparator);


        return singerList;
    }
    //resultList

    public List<Singer> sortSingerByName() {
        Collections.sort(singerList);
        return singerList;
    }

    public void displayAllSinger() {
        System.out.println(singerList);

    }
}

