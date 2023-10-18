package assignments.arrays.arrayCrud;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {4,3,8,5};
        System.out.println(arr.length);

        int[] newarr = new int[arr.length+2];
        System.out.println(newarr.length);

        short num = 20;
        for (int i = 0;i<arr.length;i++){
            newarr[i] = arr[i];
        }

        for (int i = arr.length;i<newarr.length;i++){
            newarr[i] = num;
            num+=20;
        }

        for (int i = 0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }

}
