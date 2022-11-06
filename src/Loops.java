import java.math.BigInteger;

public class Loops {
    public static void main(String[] args) {

         out: for (int i = 0; i < 10; i++) {     //dodanie etykiety out po to by zakonczy obie petle, gdyby nie bylo etykiety out to by zakonczyla sie tylko wewnetrzna petla a zewnetrzna by zostala

            for (int j = 0; j < 50; j++) {
                System.out.println(i + " " + j);
                break out;
            }

        }







        //liczba bedzie nie parzysta to jej nie wyswietli

    //    for (int i = 1; i < 10; i++) {
//
 //           if (i % 2 == 1) {
  //              continue;
    //        }
  //          System.out.print(i);
   //         System.out.print(" ");
  //      }








  //      for (int i = 1; i < 10 ; i++) {
  //          System.out.print(i);
  //          System.out.print(" ");

        }









         //petla while
//        int i = 0;
//        while (i < 100) {
//            System.out.println(i);
 //           i++;
  //      }




        //wartosc bitów w bajcie
        // 128 64 32  16  8  4  2  1
        // 0   0   0   0  0  0  0  0

  //      for (int i = 1, sum = 1; i <= 128 ; i = i * 2, sum += i) {
  //          System.out.printf("i = %d, sum = %d%n", i, sum);

//        }




        //silnia

 //       int number = 5;
 //       BigInteger factorial = BigInteger.ONE;
 //       for (int i = 1; i <= number ; i++) {
 //         factorial = factorial.multiply(BigInteger.valueOf(i));

  //      }
  //      System.out.printf("%d! = %s%n", number, factorial);


  //      for (int i = 0; i < 10 ; i++) {           wszystkie cyfry
   //         System.out.printf("%d ", i);

   //     }






//        for (;;) {
 //           System.out.println("pętla nieskończona");
  //      }



   //     for (int i = 1; i < 100; i++) {
     //       System.out.println("i = " + i);
     //   }






        /*      int myScore = 98;
        int yourScore = 102;

        int ourBestScore = myScore > yourScore ? myScore : yourScore;




        int x = 2;
        if (x > 2) {
            System.out.println("Jest większe równe 2 ");

        }
        else if(x < 2) {
            System.out.println("Nie jest większe od 2 ");

        }
        else {
            System.out.println("Jest równe 2");
        }

        char grade = 'E';
        switch (grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'D':
                System.out.println("Mogło być lepiej");
                break;
            default:
                System.out.println("Rozważ oszukiwanie!");
       }

*/    }

