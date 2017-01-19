
import java.util.*;
/**
 * class to find the duplicate elements in array and their count.
 * 
 * @author (Deepak Goyal) 
 * @version (Jan 19, 2017)
 */
public class GetDuplicateElementsAndTheirCountInArray
{
    /**
     * Constructor for objects of class GetDuplicateElementsAndTheirCountInArray
     */
    public GetDuplicateElementsAndTheirCountInArray()
    {
       
    }
    
    /**
     * function to print the elements of array
     */
    public void printElements(int array[]){
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            int count = 1;
            if(hMap.containsKey(array[i])){
                count = hMap.get(array[i]);
                count ++;
            }
            
            hMap.put(array[i], count);
        }
        
        System.out.println(hMap.toString());
    }
    
    public static void main(String args[]){
        GetDuplicateElementsAndTheirCountInArray object = new GetDuplicateElementsAndTheirCountInArray();
        int integerArray[] = {1, 1, 2, 4, 1, 6, 3, 90, 4, 5, 1};
        object.printElements(integerArray);
    }
    
}
