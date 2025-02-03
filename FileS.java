import java.util.*;
class FileDetails{
public static void main(String[] args){
System.out.println("enter the file name");
Scanner s=new Scanner(System.in);
File f=new File(s);
if(f:exists;)
{
System.out.println("the file name is existed"+f.getName);
if(f:read;){
System.out.println("the file is readable");
}
else{
System.out.println("the file is not readable");
}
if(f:write;){
System.out.println("the file is writeable");
}
else{
System.out.println("the file is not writeable");
}
System.out.println(f.length);
}
}
}
