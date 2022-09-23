class Add_binary{
    public static void main(String[] args) {
        String a= "1010";
        String b="1011";
        P p=new P();
        System.out.println(p.Add_Binary(a,b));
    }
}
class P{
    public String Add_Binary(String a, String b){
        int p=Integer.parseInt(a,2); // convert string to Integer
        int q=Integer.parseInt(b,2);//radix 2 is indication of binary
        int result=p+q;
        return Integer.toBinaryString(result);//convert int to binary and return

    }
}