import java.util.Scanner;
public class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<s.length(); j++){
                while(j>s.length()){
                    if(s.charAt(i)!=s.charAt(j)){
                        continue;
                    }
                    System.out.println("first element is:"+s.charAt(i));
                }
            }
        }
    }
}