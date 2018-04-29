public class FindKClosestElements {
    /**
     * @param A: an integer array
     * @param target: An integer
     * @param k: An integer
     * @return: an integer array
     */
    public static int[] kClosestNumbers(int[] A, int target, int k) {
        // write your code here
        int n = A.length;

        if(A == null || A.length == 0 || k > n){
            return null;
        }

        int start = 0;
        int end = n - 1;
        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if(A[mid] <= target){
                start = mid;
            }else{
                end = mid;
            }
        }

        int left = -1;
        if(A[end] <= target){
            left = end;
        }else if(A[start] <= target){
            left = start;
        }

        int right = left + 1;

        int[] result = new int[k];

        for(int i=0;i < k;i++){
            if(left >=0 && right <= n-1){
                if(Math.abs(A[left] - target) <= Math.abs(A[right] - target)){
                    result[i] = A[left];
                    left -= 1;
                }else{
                    result[i] = A[right];
                    right += 1;
                }
            }else if(left >=0){
                result[i] = A[left];
                left -= 1;
            }else if(right <= n-1){
               result[i]  = A[right];
               right += 1;
            }
            else{
                return null;
            }
        }

        return result;
    }

    public static void display(int[] a ){
        for(int i = 0 ;i < a.length; i ++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
//        display(kClosestNumbers(new int[]{1,2,3}, 2, 3));
//
//
//        display(kClosestNumbers(
//                new int[]{1, 4, 6, 8}, 3, 3))
//        ;

        display(kClosestNumbers(
                new int[]{22,25,100,209,1000,1110,1111}, 15, 5))
        ;
    }
}
