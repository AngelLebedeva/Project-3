package com.company;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public  class DataLoggerCSV<T> implements ProcessableCSV{

public String fileName;
public T ob;



public DataLoggerCSV(T a){

    ob = a;
    fileName = ob.getClass().getTypeName() + ".csv";

}
    public void fromCSV() {
        try {

           PrintWriter pw = new PrintWriter(new File(fileName));
            StringBuilder sb = new StringBuilder();
            sb.append("Name");
            sb.append(";");
            sb.append("Growth");
            sb.append(";");
            sb.append("Weigh");
            sb.append(";");
            sb.append("Age");
            sb.append("\r\n");

            sb.append("Ivan");
            sb.append(";");
            sb.append("165");
            sb.append(";");
            sb.append("59");
            sb.append(";");
            sb.append("27");
            sb.append("\r\n");

            sb.append("Alex");
            sb.append(";");
            sb.append("175");
            sb.append(";");
            sb.append("75");
            sb.append(";");
            sb.append("35");
            sb.append("\r\n");

            pw.write(sb.toString());
            pw.close();


        } catch (Exception e) {

        }
    }

    @Override
    public void toCSV() throws IOException {
        List<String> list = Files.readAllLines(Paths.get(fileName));

        for (String item : list) {

            System.out.println(item);

        }

    }


}
