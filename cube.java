// sum of cubes for given range

import java.util.Scanner;
public class cube {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int lowerlimit = obj.nextInt();
        int upperlimit = obj.nextInt();
        double sum = 0;

        for(int i = lowerlimit; i <= upperlimit; i++) {
            sum = sum + Math.pow(i,3);
        }
        System.out.println(sum);
    }
}
