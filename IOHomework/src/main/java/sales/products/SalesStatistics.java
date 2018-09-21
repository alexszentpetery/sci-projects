package sales.products;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalesStatistics {
    public SalesStatistics() {
    }

    /**
     * This method gets number of units sold for each product
     * Create a map with key: productName and a counter which increments when a sale was done
     */

    public Map<String, Integer> sortByNumberOfProducts(List<Sales> sales) {
        Map<String, Integer> produse = new HashMap<>();
        Integer counter;
        for (Sales sale : sales) {
            counter = 1;
            if (produse.containsKey(sale.getProductName())) {
                counter = produse.get(sale.getProductName()) + 1;
                produse.put(sale.getProductName(), counter);
            } else {
                produse.put(sale.getProductName(), counter);
            }
        }
        Map<String, Integer> sortedMapByProducts = getStringIntegerMap(produse);
        return sortedMapByProducts;
    }


    /**
     * This method gets number of order has done each client
     * Create a map with key: client name  and a counter which increments when a order was done by a particular client
     */

    public Map<String, Integer> sortByNumberOfByClients(List<Sales> sales) {
        Map<String, Integer> produse = new HashMap<>();
        Integer counter;
        for (Sales sale : sales) {
            counter = 1;
            if (produse.containsKey(sale.getClientName())) {
                counter = produse.get(sale.getClientName()) + 1;
                produse.put(sale.getClientName(), counter);
            } else {
                produse.put(sale.getClientName(), counter);
            }
        }
        Map<String, Integer> sortedMapByClients = getStringIntegerMap(produse);
        return sortedMapByClients;
    }

    /**
     * This method gets a map with total sales done for each client
     * Create a map with key: client name  and calculates how much money have spent
     */

    public Map<String, Integer> sortByNumberOfByTopClients(List<Sales> sales) {
        Map<String, Integer> produse = new HashMap<>();
        Integer moneySpent;
        moneySpent = 0;
        for (Sales sale : sales) {
            if (produse.containsKey(sale.getClientName())) {
                moneySpent = produse.get(sale.getClientName()) + sale.getProductPrice();
                produse.put(sale.getClientName(), moneySpent);
            } else {
                produse.put(sale.getClientName(), sale.getProductPrice());
            }
        }

        Map<String, Integer> sortedMapByTopClients = getStringIntegerMap(produse);
        return sortedMapByTopClients;
    }

    /**
     * This method sorts a map by value .
     */


    private Map<String, Integer> getStringIntegerMap(Map<String, Integer> produse) {
        return produse.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }


}
