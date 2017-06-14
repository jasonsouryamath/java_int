package interview_prep;

//this program will print 0.0 because Double.MIN_VALUE is greater than 0

public class maxmin {
    public static void main(String[] args) {
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
    }
}
