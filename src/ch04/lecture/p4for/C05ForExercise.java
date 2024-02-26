package ch04.lecture.p4for;

public class C05ForExercise {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

         *
         **
         ***
         ****
         *****

         */
        System.out.println("-----------1-------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*

         *****
         ****
         ***
         **
         *

         */
        System.out.println("-----------2------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

        *****
        ****#
        ***##
        **###
        *####
        #####

         */
        System.out.println("----------3-------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println("----------4-------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------5------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (5 - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

        0
        01
        012
        0123
        01234

         */
        System.out.println("---------6-------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*

        1
        12
        123
        1234
        12345

         */
        System.out.println("----------7------------");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*

        0
        12
        345
        6789
        01234

         */
        System.out.println("---------8---------");
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++, k++) {
                System.out.print(k % 10);
            }
            System.out.println();
        }

        /*

        1
        23
        456
        7890
        12345

         */
        System.out.println("---------9---------");
        k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++, k++) {
                System.out.print(k % 10);
            }
            System.out.println();
        }
        System.out.println("---------10-----------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------11-----------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");

            }
            for (int q = 0; q < i; q++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("----------12--------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("a");
            }
            System.out.println();
        }

    }
}
