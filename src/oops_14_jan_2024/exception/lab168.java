package src.oops_14_jan_2024.exception;

import java.io.File;
import java.io.FileReader;

public class lab168 {
    public static void main(String[] args) {

        try {


            String path = "CP://a.texr";
            File file = new File((path));

            FileReader fileReader = new FileReader(file);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
