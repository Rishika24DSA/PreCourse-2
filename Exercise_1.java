/* 
Time complexity- Big O(log N)
Space complexity - Big O(log N)
Did this code run succefully-  Yes, for the cases where the number is found. NO, for the case where the number was not found. I am not able
number is not found. I am not able to figure why my code is not working for that case.

The code comments are given below:

*/

class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        int n = arr.length;
        int mid=(l+r)/2; //will check the midpoint of the array 
        if(l>=0 && r<=arr.length-1) // will check for array out of bound exceptions 
        {
        if(x==arr[mid]) //checking if its middle element or not for comparison purposes
        return mid;
        if(x>arr[mid] ){ // checking if its greater than middle element and returning the same function- Recursion
            return binarySearch(arr,mid+1,n-1,x); // returning the second half of the array 
        }
            return binarySearch(arr,0,mid-1,x); // if not that returning the first part of the array.
    }
    
        return -1; // if either of them does not work then just return -1 which mean element was not found

        //Write your code here
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 6,80,96 }; 
        int n = arr.length; 
        int x = 6; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 


