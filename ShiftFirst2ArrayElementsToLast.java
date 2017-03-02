
/**
 * Class which shifts first two elements of array to last.
 * 
 * @author (Deepak Goyal) 
 * @version (Mar 02, 2017)
 */
public class ShiftFirst2ArrayElementsToLast
{
    /**
     * Constructor for objects of class ShiftFirst2ArrayElementsToLast
     */
    public ShiftFirst2ArrayElementsToLast()
    {
      
    }

    /**
     * function to shift the array elements to right
     * 
     * @param array array to modify
     * @param noOfElements no of elements to shift
     * @return shiftedArray
     */
    public int[] getShiftedArray(int[] array, int noOfElements){
        if(array == null) return new int[0];
        
        int size = array.length;
        if(size<=noOfElements) return array;
        int newArray[] = new int[size];
        for(int i = noOfElements;i<size;i++){
            newArray[i-noOfElements] = array[i];
        }
        
        for(int i=0;i<noOfElements;i++){
            newArray[(size - noOfElements) + i] = array[i];
        }
        
        return newArray;
    }
    
    /**
     * function to print the array elements
     */
    public void printArrayElements(int array[]){
        System.out.print("{");
        for(int i = 0;i<array.length; i++){
            System.out.print(array[i]);
            if(i < (array.length - 1)){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    
    public static void main(String args[]){
        int array[] = {0,2,1,4,6,7,3};
        ShiftFirst2ArrayElementsToLast obj = new ShiftFirst2ArrayElementsToLast();
        System.out.println("Original Array");
        obj.printArrayElements(array);
        System.out.println("Array after modification");
        obj.printArrayElements(obj.getShiftedArray(array, 2));
        
    }
}
