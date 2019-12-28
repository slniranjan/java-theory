package properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {

  public static void main(String[] args) throws IOException {
    FileReader reader = new FileReader(
        "/home/niranjan/Program-Practice/java/java-theory/collection/src/main/java/properties/db.properties");

    Properties p = new Properties();
    p.load(reader);

    System.out.println(p.getProperty("user"));
    System.out.println(p.getProperty("password"));

//get system properties
    Properties systemProp = System.getProperties();
    Set set = systemProp.entrySet();

    Iterator itr = set.iterator();
    while (itr.hasNext()) {
      Map.Entry entry = (Map.Entry)itr.next();
      System.out.println(entry.getKey()+" = "+entry.getValue());
    }
  }
}
