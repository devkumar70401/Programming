import java.util.Scanner;

public class Palindrome
{
    String str;
    Palindrome()
    {
        str="";
    }
    void getstr()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the string");
        str=scr.nextLine();
    }
    String Reverse(String W)
    {
        int len=W.length();
        if(len>0)
        {
            return W.charAt(len-1)+Reverse(W.substring(0,len-1));
        }
        else
            return "";
    }
    void Show()
    {
        str=str.trim();
        str=str+" ";
        int l=str.length();
        String s="",sr="";
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(!(ch==' ')) {
                s=s+ch;
            }
            else {
                sr=sr+Reverse(s)+" ";
                s = "";
            }
        }
        System.out.println(sr);
    }

    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        obj.getstr();
        obj.Show();
    }

}
