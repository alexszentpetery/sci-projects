import sales.products.*;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Temp\\sci\\products.csv");
        if (!f.exists()) {
            System.out.println("File " + f.getName() + " does not exist.");
            return;
        }
        FileReader fr = new FileReader(f);

        List<Sales> sales = new SalesReader(fr).getSales();
        SalesStatistics listOfSales = new SalesStatistics();


        ProductStatisticsExporter exporter = new ProductStatisticsExporter();
        exporter.writeToFile(listOfSales, sales);


    }
}
