import java.util.Scanner;

/**
 *
 * @author Sherif.ElSherif
 */
public class JavaApplication1 {

    static int min_diff=1000000000;
    public static void main(String[] args) {

        System.out.println("Testing...");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        if (len < 2 || len > 100)
            throw new IllegalArgumentException("Invalid arr Length");
        long[] arr = new long[len];
        for(int i =0;i<len;i++)
            arr[i]=scanner.nextLong();
        getMinAbsDiff(arr, len);
        System.out.println("Min Abs Diff: "+min_diff);

    }
    static void getMinAbsDiff(long[] arr, int len)
    {
        for(int i=0;i<len;i++)
            for(int j=i+1;j<len;j++)
            {
                int diff = (int) Math.abs(arr[i] - arr[j]);
                if (diff < min_diff)
                    min_diff = diff;
            }
    }
}
