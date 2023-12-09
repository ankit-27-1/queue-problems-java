class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum=0;
        int t=0;
        for(int i=0;i<tickets.length;i++){
            if(tickets[k]>tickets[i]){
                sum=sum+tickets[i];
                t++;
            }
        }
        int p=0;
        for(int i=0;i<k;i++){
            if(tickets[i]>=tickets[k]){
                p++;
            }
        }
        int s=0;
        for(int i=k;i<tickets.length;i++){
            if(tickets[i]>=tickets[k]){
                s++;
            }
        }
        return sum+(tickets[k]*p)+((tickets[k]-1)*s)+1;
    }
}
