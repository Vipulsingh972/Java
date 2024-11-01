
class RecCheckSorted {
    
    public static boolean isSorted(int arr[], int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index] < arr[index+1])
        {
            return isSorted(arr, index+1);
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String[] args) 
    {
        int arr[] = {1,2,8,4,5};
        boolean res = isSorted(arr, 0);
        if(res==true)
        {
            System.out.println("Array is sorted");
        }
        else
        {
             System.out.println("Array is Not sorted");
        }
        
    }
}
