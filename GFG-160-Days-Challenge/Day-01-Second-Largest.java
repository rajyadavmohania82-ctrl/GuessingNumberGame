
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
         
        int largest=-1;
        int seclargest=-1;
         
        for(int i=0;i<arr.length;i++){
             if(arr[i]>largest){
                 seclargest=largest;
            largest=arr[i];
             }else if(arr[i]>seclargest && arr[i]!= largest){
                 seclargest=arr[i];
             }
        }
        return seclargest;
    }
}
