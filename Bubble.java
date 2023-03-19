import java.util.*;
public class Bubble {
    //making function
    public static void bubbleArray(int bubble[]){
        for(int i = 0; i < bubble.length; i++){
            System.out.print( bubble[i] + "");
        }
    }

    public static void main(String[] args) {
        int bubble[] = {8, 9, 3, 6, 2, 1, 5};
        //bubble sort
        for (int i = 0; i < bubble.length - 1; i++) {
            for (int j = 0; j < bubble.length-i-1; j++) {
                //swap
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }
        //function call
        bubbleArray(bubble);
    }
}
//this is the copy of the upper code which give the same output as like previous one but have one major difference just think

//************************** welcome**************************



//import java.util.*;
//public class Bubble {
//    //making function
//    public static void bubbleArray(int bubble[]){
//        for(int i = 0; i < bubble.length; i++){
//            System.out.print( bubble[i] + "");
//        }
//    }
//
//    public static void main(String[] args) {
//        int bubble[] = {8, 9, 3, 6, 2, 1, 5};
//        //bubble sort
//        for (int i = 0; i < bubble.length - 1; i++) {
//            for (int j = 0; j < bubble.length-1; j++) {
//                //swap
//                if (bubble[j] > bubble[j + 1]) {
//                    int temp = bubble[j];
//                    bubble[j] = bubble[j + 1];
//                    bubble[j + 1] = temp;
//                }
//            }
//        }
//        //function call
//        bubbleArray(bubble);
//    }
//}
//Hint: time complexity and space complexity


