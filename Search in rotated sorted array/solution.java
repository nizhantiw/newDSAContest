import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static int search(long[] nums, long target) {

        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return 1;
            }
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid] ){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return 0;
    }


    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long k = sc.nextLong();
        System.out.print(search(arr,k));

    }

}
