import java.util.*;

class Valid_para{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the braces : ");
        String s=sc.nextLine();
        A a=new A();
        System.out.println(a.isValid(s));
    }
}

class A {
    public boolean isValid(String s) {
        Stack<Character> x=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                x.push(c);
                continue;
            }
            if(x.isEmpty()){
                return false;
            }

            char check;
            switch(c){
                case ')':
                    check=x.pop();
                    if(check=='{' || check=='['){
                        return false;
                    }
                    break;
                case '}':
                    check=x.pop();
                    if(check=='(' || check=='['){
                        return false;
                    }
                    break;
                case ']':
                    check=x.pop();
                    if(check=='(' || check=='{'){
                        return false;
                    }
                    break;
            }
        }
        return (x.isEmpty());

    }
}