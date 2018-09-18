import sales.products.ProductReader;
import sales.products.ProductStatistics;
import sales.products.ProductStatisticsExporter;
import sales.products.Sales;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Temp\\sci\\products.csv");
        Path path = f.toPath();
        List<String> strings = Files.readAllLines(path);
        if (!f.exists()) {
            System.out.println("File " + f.getName() + " does not exist.");
            return;
        }
        FileReader fr = new FileReader(f);

        List<Sales> products = new ProductReader(fr).getProducts();
        ProductStatistics listByProductsSold = new ProductStatistics();

        ProductStatisticsExporter exporter = new ProductStatisticsExporter();
        exporter.writeToFile(listByProductsSold, products);


    }
}
