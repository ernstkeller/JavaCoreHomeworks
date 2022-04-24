package Lesson5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderWriter {

    public static void main(String[] args) {
        String filePath = "test.csv";

        System.out.println("Writing data into: " + filePath);
        writeCsv(filePath);

        System.out.println("Reading data from: " + filePath);
        readCsv(filePath);
    }

    public static void writeCsv(String filePath) {


        List<Values> newValues = new ArrayList<Values>();


        Values values = new Values();
        values.setHeight(180);
        values.setWeight(83);
        values.setAge(45);
        newValues.add(values);

        values = new Values();
        values.setHeight(165);
        values.setWeight(58);
        values.setAge(29);
        newValues.add(values);

        values = new Values();
        values.setHeight(174);
        values.setWeight(62);
        values.setAge(32);
        newValues.add(values);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);

            fileWriter.append("Height; Weight; Age\n");

            for(Values v: newValues) {
                fileWriter.append(String.valueOf(v.getHeight()));
                fileWriter.append(";");
                fileWriter.append(String.valueOf(v.getWeight()));
                fileWriter.append(";");
                fileWriter.append(String.valueOf(v.getAge()));
                fileWriter.append("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void readCsv(String filePath) {
        BufferedReader reader = null;

        try {
            List<Values> newValues = new ArrayList<Values>();
            String line = "";
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();

            while((line = reader.readLine()) != null) {
                String[] fields = line.split(";");

                if(fields.length > 0) {
                    Values values = new Values();
                    values.setHeight(Integer.parseInt(fields[0]));
                    values.setWeight(Integer.parseInt(fields[1]));
                    values.setAge(Integer.parseInt(fields[2]));
                    newValues.add(values);
                }
            }

            System.out.println("Height; Weight; Age");

            for(Values v: newValues) {
                System.out.printf("%d; %s; %s\n", v.getHeight(), v.getWeight(), v.getAge());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
