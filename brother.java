import java.io.*;
class Brother
{
    public static void main(String args[])throws IOException
    {
        int age1,age2,age3;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter Kushagra age:");
        age1=Integer.parseInt(br.readLine());
        System.out.print("Enter Harsh age:");
        age2=Integer.parseInt(br.readLine());
        System.out.print("Enter vipin age:");
        age3=Integer.parseInt(br.readLine());
        if((age1<age2)&&(age1<age3))
        System.out.print(":Kushagra is youngest one");
        else if((age2<age1)&&(age2<age3))
        System.out.print(":Harsh is youngest one");
        else if((age3<age1)&&(age3<age2))
        System.out.print(":Vipin is youngest one");
    }
}    