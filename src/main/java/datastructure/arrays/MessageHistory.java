package datastructure.arrays;

public class MessageHistory {
    int[] lengths;
    int[] times;

    public MessageHistory(int[] lengths, int[] times) {
        this.lengths = lengths;
        this.times = times;
    }

    public int[] getLengths() {
        return lengths;
    }

    public void setLengths(int[] lengths) {
        this.lengths = lengths;
    }

    public int[] getTimes() {
        return times;
    }

    public void setTimes(int[] times) {
        this.times = times;
    }

    int getTimeOfShortestMsg() {
        return 0;
    }
//control+shift+L
    int getTimeOfLongestMsg() {
        return 0;
    }
}
