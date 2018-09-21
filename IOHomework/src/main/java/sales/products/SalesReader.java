package sales.products;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalesReader {
    private Reader reader;

    public SalesReader(FileReader fr) {
        this.reader = fr;
    }


    public List<Sales> getSales() throws IOException {
        try (BufferedReader br = new BufferedReader(reader)) {
            ArrayList<Sales> sales = new ArrayList<Sales>();
            String line = br.readLine();
            while (line != null) {
                sales.add(parsePlayer(line));
                line = br.readLine();
            }
            return sales;
        }
    }

    private Sales parsePlayer(String line) {
        String[] tokens = line.split(",");
        return new Sales(Integer.parseInt(tokens[0]), tokens[1], Integer.parseInt(tokens[2]), tokens[3]);
    }


}
