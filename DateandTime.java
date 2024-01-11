import java.io.*;
public class DateandTime {
    public static void dateprint(String st)
    {
        int h=(int)st.charAt(1)-'0';
        int h1=(int)st.charAt(0) -'0';
        int h2=(h1*10+h%10);
       
        if(st.charAt(8)=='A')
        {
            if(h2==12)
            {
                System.out.println("00");
                for(int i=2;i<=7;i++)
                System.out.println(st.charAt(i));
            }
            else
        {
            for (int i = 0; i <= 7; i++)
                System.out.print(st.charAt(i));
        }
    }
 
   
    else
    {
        if (h2 == 12)
        {
            System.out.print("12");
            for (int i = 2; i <= 7; i++)
                System.out.print(st.charAt(i));
        }
        else
        {
            h2 = h2 + 12;
            System.out.print(h2);
            for (int i = 2; i <= 7; i++)
                System.out.print(st.charAt(i));
        }
    }
} 
 
public static void main (String[] args)
{
    String st = "09:16:50PM";
    dateprint(st);
}
}
    
