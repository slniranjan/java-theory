package properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CreatePropertyFile {

  public static void main(String[] args) throws IOException {
    Properties p = new Properties();
    p.setProperty("one","1");
    p.setProperty("two", "2");
    p.store(new FileWriter("info.properties"),"Sample properties example");
  }
}
