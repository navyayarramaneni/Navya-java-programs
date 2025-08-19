public class Linearsearch {
    public static int linearsearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int []numbers={10,23,4,45,12,34,77};
        int target1=12;
        int target2=23;
        int result1=linearsearch(numbers,target1);
        if(result1 !=-1){
            System.out.println("Element"+target1+"found at index:"+result1);
        }
        else{
            System.out.println("Element"+target1+"not found in the array");
        }
        int result2=linearsearch(numbers,target2);
        if(result2 !=-1){
            System.out.println("Element"+target2+"found at index:"+result2);
        }
        else{
            System.out.println("Element"+target2+"not found in the array");
        }
    }
}