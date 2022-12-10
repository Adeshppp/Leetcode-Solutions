public class TwoSumII {
    public static void main(String[] args) {
        int[] arr=twoSum(new int[] {2,7,11,15},9);
        System.out.println(arr[0]+" "+arr[1]);
    }
    
        public static int[] twoSum(int[] numbers, int target) {
            if(numbers.length==0) return new int[] {};
            if(numbers.length==1 && target==numbers[0]) return new int[] {1};
            int L=0, R=numbers.length-1;
            for(int i=0;i<numbers.length-1;i++){
                if(numbers[L]+numbers[R]>target) R--;
                else if(numbers[L]+numbers[R]<target) L++;
                else if(numbers[L]+numbers[R]==target) return new int[]{L+1,R+1};
            }
            return new int[] {};
        }
    }

