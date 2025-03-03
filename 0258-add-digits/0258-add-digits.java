class Solution {
    public int addDigits(int num) {
        int sum = 0; 
        while(num>0){
            int lastDigit = num%10;
            sum += lastDigit;
            num = num /10;
        }
        
        if(sum > 9){
            sum = addDigits(sum);
        }

        return sum;
    }
}