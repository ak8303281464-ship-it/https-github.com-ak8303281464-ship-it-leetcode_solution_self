class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        // Loop through each customer (row)
        for (int i = 0; i < accounts.length; i++) {
            int currentCustomerWealth = 0;
            
            // Sum all the banks for the current customer (column)
            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }
            
            // Update maxWealth if the current customer is richer
            if (currentCustomerWealth > maxWealth) {
                maxWealth = currentCustomerWealth;
            }
        }
        
        return maxWealth;
    }
}
