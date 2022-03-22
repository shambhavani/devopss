import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.*;
import java.net.*;
import java.io.*;
import java.util.*;
public class DisCon{
static{
URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
}
public static void main(String args[]) throws Exception{
InputStream in=null;
try{
System.out.println("SAIRAM");
in=new URL(args[0]).openStream();
IOUtils.copyBytes(in,System.out,4096);
}
finally{}
}
}