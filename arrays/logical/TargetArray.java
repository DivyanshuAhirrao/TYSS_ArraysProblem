package assignments.arrays.logical;

public class TargetArray {
    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4};
        int[] index= {0,1,2,2,1};

        int len = nums.length;

        int[] target = new int[len];

        for (int i=0;i<len;i++){

            if (i == index[i]){
                target[i] = nums[i];
            }
            else {
                int mini = Math.min(i,index[i]);
                int maxi = Math.max(i,index[i]);

                for (int j=maxi;j>mini;j--){
                    int temp = target[j];
                    target[j] = target[j-1];
                }
              target[mini] = nums[i];
            }
        }

        System.out.print("[");
        for (int i=0;i<len;i++){
            System.out.print(target[i]);
            if (i<len-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
