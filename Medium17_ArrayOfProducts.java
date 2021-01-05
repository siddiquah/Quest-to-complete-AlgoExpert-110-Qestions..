public class Medium17_ArrayOfProducts {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] t1 = new int[nums.length];
        int[] t2 = new int[nums.length];

        t1[0]=1;
        t2[nums.length-1]=1;

        //scan from left to right
        for(int i=0; i<nums.length-1; i++){
            t1[i+1] = nums[i] * t1[i];
        }

        //scan from right to left
        for(int i=nums.length-1; i>0; i--){
            t2[i-1] = t2[i] * nums[i];
        }

        //multiply the first two elements.
        for(int i=0; i<nums.length; i++){
            result[i] = t1[i] * t2[i];
        }
        return result;
    }
    public static void main(String[] args)
    {
        int ar[] = { 1, 2, 3, 4, 5 };
        int n = ar.length;
        System.out.println(productExceptSelf(ar));
    }
}
