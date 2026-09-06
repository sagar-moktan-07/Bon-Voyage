// import java.applet.Applet;
// import java.awt.Graphics;

// public class HelloWorld extends Applet {
//     @Override
//     public void paint(Graphics g) {
//         g.drawString("Hello World", 20, 20);
//     }
// }

// public class HelloWorld{
//     public static void main(String[] args){
//         System.out.println("Sagar Moktan is my name and I am a very good person");
//         int am= 5000;
//         String name = "Lal Kumar Tamang";
//         System.out.println("HEllo world...");
//     }
// }


//type casting in java...

// public class HelloWorld{
//     public static void main(String[] args){
//         int a = 55;
//         byte b = 127;
//         byte k = (byte) a;
//         float f = 54.3f;
//         int ss = (int)f;
//         System.out.println(ss);
//         System.out.println(b);

//     }
// }

// arithmetic operators in java 

// public class HelloWorld{
//     public static void main(String[] args) {
//         int num1 = 5;
//         int num2 = 3;
//         int result = num1 / num2;
//         num1 = num1 + 2;
//         System.out.println(num1);
//         System.out.println(result);
//     }
// }

// relational operators in java --> <,>,==,!=,<=,>=:

// public class HelloWorld{
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 3;
//         System.out.println(a<b);
//         //or 
//         boolean result = a != b;
//         System.out.println(result);
//     }
// }

// logical operators --> and(&), or(|)  and not(!) or also called short circuit and used &&, ||, ! 

public class HelloWorld{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a | b);
        System.out.println(!a);
        System.out.println(a & b);
        
    }
}