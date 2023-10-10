import java.util.*;
class BinarySearch{
    public int binarySearch(int arr[],int k){
        int l=0,r=arr.length - 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==k)
            return mid;
            else if(arr[mid]<k)
            l=mid+1;
            else
            r=mid-1;
         }
         return -1;
    }
    public static void main(String args[]){
        BinarySearch ob = new BinarySearch();
        int arr[]={1,2,3,4,5};
        int k=10;
        int result = ob.binarySearch(arr,k);
        if(result==-1)
        System.out.println("element not found");
        else
        System.out.println("ELement found in " +result+ "position");
    }
}