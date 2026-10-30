class Item{
    int value;
    int weight;
    Item (int value, int weight){
        this.value = value;
        this.weight = weight;
    }
}

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        List<Item> items = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            items.add(new Item(val[i], wt[i]));
        }
        
        Collections.sort(items, (a, b) -> {
            double r1 = (1.0 * a.value) / a.weight;
            double r2 = (1.0 * b.value) / b.weight;
            return Double.compare(r2, r1);
        });
        
        double result = 0.0;
        for(Item item : items) {
            if(item.weight <= capacity) {
                result += item.value;
                capacity -= item.weight;
            } else {
                result += (1.0 * item.value / item.weight) * capacity;
                break;
            }
        }
        return result;
    }
}
