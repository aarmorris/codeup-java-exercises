public class ControlFlowExercises {
    public static void main(String[] args) {
        //     This is the syntax for a while loop using Java
//        int i = 0;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
        // This is the syntax for do-while loops using Java
//            int j = 0;
//        do {
//            System.out.println("I am incrementing by two " + j);
//            j += 2;
//
//        } while(j <= 100);

//        int k = 100;
//        do {
//            System.out.println("I am decrementing from 100 " + k);
//            k -= 5;
//        } while (k >= -10);
//
//        long l = 2;
//        do{
//            System.out.println("I am squaring each number " + l);
//            l = l * l;
//        } while (l < 1000000);

        // Refactoring to for loop from while loop
//        for(int z = 5; z <= 15; z++) {
//            System.out.println(z);
//            if(z == 15) {
//               break;
//            }
//        }

        for(int m = 0; m <= 100; m+=2){
            System.out.println(m);
            if(m == 100) {
                break;
            }

        }


    }
}