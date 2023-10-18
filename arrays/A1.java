package assignments.arrays;

public class A1 {
    public static void main(String[] args) {

                int[] arr = {2,9,15,36,14};
                int sum = 0;

                for(int i=0;i<arr.length;i++){
                    if(arr[i]%2==0){
                        sum += arr[i];
                    }
                }
                System.out.println(sum);
    }
}
