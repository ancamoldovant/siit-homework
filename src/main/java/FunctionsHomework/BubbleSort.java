package FunctionsHomework;

public class BubbleSort {
    /**
     * Is an algorithm for sorting objects in an array in descending order;
     * Bubble sort starts with very first two elements, comparing them to check which one is greater;
     * swaps since the condition is true and doesn't is these elements are already in order.
     * @param reps the positions of the array;
     */
    public static SalesRepresentative[]sortSalesRepresentative(SalesRepresentative[] reps) {
        boolean switchedPosition=true;
        while (switchedPosition){
            switchedPosition=false;
            for (int i = 0; i < reps.length - 1; i++) {
                if (reps[i].getRevenue() < reps[i+1].getRevenue()){
                    switchedPosition=true;
                    SalesRepresentative temp=reps[i];
                    reps[i]=reps[i+1];
                    reps[i+1]=temp;
                }
            }
        }
        return reps;
    }
}
