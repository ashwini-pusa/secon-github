package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProprtyfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileReader fr=new FileReader("C:\\Users\\Ravikanth\\eclipse-workspace\\Java workspace\\IT360Framework\\src\\main\\resources\\configfiles\\configfiles");
     Properties p=new Properties();
     p.load(fr);
     System.out.println(p.getProperty("browser"));
     System.out.println("testurl");
	}

}
