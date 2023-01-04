
public class SlidingWindow{

    public static void main(String[] args){
        System.out.println("***Sliding Window***");
        /**
            Basic of Sliding window
         */

        int windowSize = 3;
        int[] arr = {1,2,3,4,5,6,7,8,9};

        /** 
        We have to initialize the WindowStart and WindowEnd 
        at the same position as initially we dont have the window ready so 
        we are going to make it.
        */
        int windowStart = 0;
        //Here we are initializing the WindowEnd in loop itself.
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++/*this is also slider*/){

            if(windowEnd >= windowSize-1){ // this means that we are iterating to windowsize to create it like 012 this is first window
                //Here at this point actual window will be created and then we have to slide that window.
                System.out.println("Sliding Window: " + windowStart + " " + windowEnd);
                //this is the start of the window and we are now sliding it forward
                windowStart++;  
            }
        }

        /**
         * When creating the Dynamic Window slider just replace the if with while 
         */
    }
}