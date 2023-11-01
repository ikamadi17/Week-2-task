package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        //CSV - comma separated values

        String file = "src\\StudentExcel.csv";
        BufferedReader reader = null;
        String line ="";


        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    System.out.printf("%-10s", index);
                    System.out.println();
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();

        }
        finally {
            try{
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
