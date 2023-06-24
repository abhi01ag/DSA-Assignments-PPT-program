import java.util.HashMap;

public class missingnumber {

    static int[] missing(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] output = new int[2];
        for (int i = 0 ; i<nums.length;i++){
            int integer = nums[i];

            if (map.containsKey(integer)){
                output[0] = integer;
                output[1] = integer+1;

            }
            map.put(integer,i);
        }
        return output;
    }

    public static void main(String[] args) {

        int[] nums  = {1,2,2,4};
        int[] output = missing(nums);
        System.out.println(output[0]);
        System.out.println(output[1]);
    }
}
