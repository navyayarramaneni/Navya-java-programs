public class Binary {
    public static int binarySearch(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []sortedArray={2,5,6,23,45,67,11,34,55,60,12};
        int target1=23;
        int target2=45;
        int index1=binarySearch(sortedArray,target1);
        int index2=binarySearch(sortedArray,target2);
        System.out.println("index of"+target1+":"+index1);
        System.out.println("index of"+target2+":"+index2);
    }
}