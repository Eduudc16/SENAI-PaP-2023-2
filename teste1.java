import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.time.LocalTime;

public class teste1 {
  public static void main(String[] args) {
    try {

      FileWriter java = new FileWriter("Filename.txt");
      for ( int i = 0; i < 1000000; i ++){
        LocalTime time = LocalTime.now();
      java.append(time + "  " + (int) ((Math.random() * (60 - 1)) + 1) + "\n");

  

    }

      java.close();
      
      System.out.println("arquivo gravado com sucesso");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
