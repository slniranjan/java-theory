package arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationAndDeserialization {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("niranjan");
    list.add("how are you");

    try {
      //Serialization
      FileOutputStream fileOutputStream = new FileOutputStream("file");
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(list);
      fileOutputStream.close();
      objectOutputStream.close();

      //Deserialization
      FileInputStream fileInputStream = new FileInputStream("file");
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      ArrayList readList = (ArrayList) objectInputStream.readObject();
      System.out.println(readList);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
