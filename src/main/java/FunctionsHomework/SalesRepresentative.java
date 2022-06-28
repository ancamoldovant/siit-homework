package FunctionsHomework;

public class SalesRepresentative {
    private int SaleGuy;
    private int numberOfSales;
    private double quotaPerSale;
    private int revenue;


    public int getSaleGuy() {
        return SaleGuy;
    }
    public int getNumberOfSales() {
        return numberOfSales;
    }
    public double getQuotaPerSale() {
        return quotaPerSale;
    }

    public double getRevenue() {
        return quotaPerSale*numberOfSales;
    }

    public SalesRepresentative(int SaleGuy, int numberOfSales, int quotaPerSale) {
        this.SaleGuy = SaleGuy;
        this.numberOfSales = numberOfSales;
        this.quotaPerSale = quotaPerSale;
    }
    public String toString() {
        return SaleGuy + "(" + revenue + ")";
    }

    public static void main(String[] args) {
        SalesRepresentative[] reps = new SalesRepresentative[5];
        reps[0] = new SalesRepresentative(1, 10, 500);
        reps[1] = new SalesRepresentative(2, 7, 800);
        reps[2] = new SalesRepresentative(3, 6, 450);
        reps[3] = new SalesRepresentative(4, 7, 800);
        reps[4] = new SalesRepresentative(5, 10, 900);
        System.out.println("List before sort: ");

        for (int i = 0; i < reps.length; i++) {
            System.out.println(reps[i].SaleGuy + reps[i].getRevenue());
        }
        System.out.println("List after sort: ");

        SalesRepresentative[] SalesSort = BubbleSort.sortSalesRepresentative(reps);
        for (int i = 0; i < reps.length; i++) {
            System.out.println(reps[i].getSaleGuy()+reps[i].getRevenue());
        }

    }
}

