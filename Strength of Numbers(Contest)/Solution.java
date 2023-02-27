import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int strength(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums = new Integer[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums, new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                int sumA = strength(a);
                int sumB = strength(b);
                if(sumA != sumB) {
                    return sumA - sumB;
                }
                else {
                    return a - b;
                }
            }
        });
        for(Integer num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
