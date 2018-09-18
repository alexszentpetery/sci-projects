package sales.products;

import java.io.*;
import java.util.*;

public class ProductStatisticsExporter {

    public void writeToFile(SalesStatistics statisticaDePrintat, List<Sales> sales) throws IOException {
        File f = new File("C:\\temp\\sci\\stats.txt");
        if (f.exists()) {
            f.delete();
        } else {
            f.createNewFile();
        }
        ProductStatisticsExporter writeToFile = new ProductStatisticsExporter();
        writeToFile.writeStatsToFile(statisticaDePrintat.sortByNumberOfProducts(sales), f, "units", "", "Best Selling Products");
        writeToFile.writeStatsToFile(statisticaDePrintat.sortByNumberOfByClients(sales), f, "orders", "", "Top Returning Customers");
        writeToFile.writeStatsToFile(statisticaDePrintat.sortByNumberOfByTopClients(sales), f, "", "$", "Top Customers");
    }

    public void writeStatsToFile(Map<String, Integer> sortedMap, File file, String units, String moneyCurrency, String title) throws IOException {


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            Map<String, Integer> toAppend = sortedMap;
            int i = 0;
            Set set = sortedMap.entrySet();
            Iterator iterator = set.iterator();
            bw.newLine();
            bw.append(title);
            bw.newLine();
            bw.newLine();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                bw.append((i + 1) + ". " + entry.getKey() + " - " + moneyCurrency + "" + entry.getValue() + " " + units);
                bw.newLine();
                i += 1;
            }
            bw.append("...");
            bw.newLine();
        }
    }


}


