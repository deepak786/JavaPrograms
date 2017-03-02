
/**
 * Class to get the maximum number of consecutive 0's and starting position of maximum consecutive 0's
 * 
 * @author (Deepak Goyal) 
 * @version (Mar 02, 2017)
 */
public class GetTheMax0sAndStartPosition
{
    /**
     * Constructor for objects of class GetTheMax0sAndStartPosition
     */
    public GetTheMax0sAndStartPosition()
    {
    }

    /**
     * function to get the Consecutive Max0s and their starting position.
     * @param array given array
     */
    public void getMax0s(int array[]){
        int pos = -1;
        int count = 0;
        
        int temp_pos = -1;
        int temp_count = 0;
        
        for(int i=0;i<array.length;i++){
            if(array[i] == 1){
                if(count > temp_count){
                    temp_count = count;
                    temp_pos = pos;
                }
                pos = -1;
                count = 0;
            }else{
                if(pos == -1){
                    pos = i;
                }
                count++;
            }
        }
        System.out.println("The max consecutive 0s are "+temp_count+" and starting position is "+temp_pos);
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
    
    /**
     * Main Method
     */
    public static void main(String[] args){
        int array[] = {1,0,0,1,1,0,0,0,0,0,1,1,1,0,1,0,0,0,1};
        
        GetTheMax0sAndStartPosition obj = new GetTheMax0sAndStartPosition();
        System.out.println("Array is");
        obj.printArrayElements(array);
        obj.getMax0s(array);
        
    }
}
