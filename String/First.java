package String;

public class First {
    public static  void isPrint(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the  firstname:");
        // String firstname = sc.next();
        // System.out.print("Enter the lastname:");
        // String lastname=sc.next();
        // String fullname=firstname+" "+lastname;
        // System.out.println( "This is the fullname:" + fullname);
        // System.out.println(fullname.charAt(2));
        String Firstname="Arpit";
        String Lastname="Kumar";
        String Fullname=Firstname+" "+Lastname;
        isPrint(Fullname);
    }
}