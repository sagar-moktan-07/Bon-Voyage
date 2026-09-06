import java.util.Scanner;

// public class day1{
//     public static void main(String[] args){
//         System.out.println("Sagar Moktan.....");
//     }
// }


// public class Main{
//     public static void main(String[] args){
//         int num1 = 4;
//         int num2 = 5;
//         int result = num1 + num2;
//         System.out.print(result);

//     }
// }

// data types 

// primitive = inbuilt variables provided by java, its typese are:
// - integer subtypes--> byte, short, int, long
// -float --> double, float
// -character --> 2 bytes 
// -boolean --> only true or false , not 1 and 0

// class Main{
//     public static void main(String[] args){
//         int num1 = 5;
//         byte by = 23;
//         short sh = 3434;
//         long l = 34343434;

//         float f = 33.3f;
//         double dd = 5.33;

//         char c = 'S';  // only '' is used in java for characters not ""

//         boolean b = true;
//         System.out.println(num1 +" "+ by+" "+ sh +" "+ l+ " "+ f+" "+ dd+" "+ c+" "+ b );
//     }
// }

// class Main{
//     public static void main(String[] args){
//         int a = 33;
//         byte by = 22;
//         by = (byte)a;
//         System.out.print(by);
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         int x = 50;
//         int y = 10;
//         if(x > y){
//             System.out.println("its true");
//         }
//         if (x <= 5 || y < 10){
//             System.out.println("its false");
//         }
//         else{
//             System.out.println("its true");
//         }
//     }
// }

// User input in java using scanners util. 

//  public class Main{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter you name:: ");
//         String name = scanner.nextLine();

//         System.out.println("Enter your age:: ");
//         int age = scanner.nextInt();

//         System.out.println("Enter your gpa:: ");
//         double gpa = scanner.nextDouble();

//         System.out.println("Hello "+ name+ ". \n What's up and how did you get"+ age +"years old. \n Man you have become old. By the way, whats up with your gpa its"+ gpa + ", that's really low, you know that, right?");


//     }
//  }

// if else syntax:
// if (condition){
//     // to do 
// }
// else {
//     // to do 
// }

// else if syntax;

// if (condition){
//     // to do things inside
// }
// else if (2nd condition ){
//     //to do 
// }
// else if (3rd condition){
//     // to do
// }
// else{
//     // to do if all the above conditions are false 
// }


// Switch condition in java 
// public class Main{
//     public static void main(String[] args){
//         int day = 7;
//         switch(day){
//             case 1:
//                 System.out.println("Sunday");
//             case 2:
//                 System.out.println("MOnday");
//             default:
//                 System.out.println("Fuck you..");
//                 break;
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         int day = 7;
//         switch(day){
//             case 1:
//                 System.out.println("Sunday");
//             case 2:
//                 System.out.println("MOnday");
//             default:
//                 System.out.println("fk you..");
//                 break;
//         }
//     }
// }

// Ternary operators in java 

// public class Main{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter your age:: ");
//         int age = scanner.nextInt();
//         String status = (age > 11)? "Adult" : "Minor";
//         if (status.equals("Adult")){
//             System.out.println("You are an "+ status);
//         }
//         else {
//             System.out.println("You are a "+ status);
//         }
//     }
// }


// loops in java:: for, while , do-while, enhanced for loops 

public class Main{
    public static void main(String[] args){
        // int a = 5;
        // for(a = 1; a <= 5; a++){
        //     System.out.println("No.:: "+ a);
        // }
        // a = 5;

        // while(a >= 1){
        //     System.out.println("No.:: "+ a);
        //     a--;
        // }
        // a = 5;

        // do
        // {
        //     System.out.println("No.:: "+ a);
        //     a--;
        //             }while(a >= 1);

        int i = 0;
        int j = 5;
        for(i=0; i<5; i++){
            System.out.println(i);
            for(j=5; j>0; j--){
                System.out.println(j);
            }
        }
    }
}