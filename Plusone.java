import java.util.Arrays;

class Plusone {
    public static void main(String[] args) {
        int[] arr=new int[]{9,9,9};
        A a=new A();
        System.out.println(Arrays.toString((a.plusone(arr))));
    }
}
class A {

    int[] plusone(int[] arr) {
        //check if last digit is less than 9 then increment it else make that digit 0 and increment the previous digit
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        //if there is a digit as 999 then we need to increment the size of an array so creating the new array and make the 1st digit 1.
        int[] result=new int[arr.length+1];
        result[0]=1;
        return result;
    }
}

//"fly me   to   the moon " logical error
