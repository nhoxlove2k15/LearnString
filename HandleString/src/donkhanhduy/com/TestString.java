package donkhanhduy.com;

public class TestString {

	public static void main(String[] args) {

/////////////////////////////////////
String a = "D:/Desktop:/Closer.mp3" ;
int index = a.lastIndexOf("/");
int index2 = a.lastIndexOf(".");


String temp = a.substring(index+1, index2);
System.out.println(temp);
////////////////////

a = "donguyennhathan@gmail" ;
String [] b =  a.split("@");
System.out.println(b[0]);


index = a.lastIndexOf("@") ;
System.out.println(a.substring(0 , index));
a = "donguyennhathan@gmail.com.vn" ;
index = a.lastIndexOf("@") ; 
index2 = a.indexOf(".") ;
System.out.println(a.substring(index+1,index2));
//////////////
a = "01-donguyenhathan-class1k";
String [] c =  a.split("-");
for (int i = 0 ; i < c.length ; i++)
{
System.out.println(c[i]);
}
/*
 Viet ham toi uu chuoi khi nguoi dung nhap 1 ten bat ky 
 1.xoa
 */

	}

}
