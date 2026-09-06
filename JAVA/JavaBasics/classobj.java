// class Calculator
// {
//     int a;
//     int b;

//     public int add(int a, int b){

//         System.out.println("Adding...");
//         return a + b;
//     }
// }

// public class classobj{
//     public static void main(String[] args){
//         Calculator calc = new Calculator();
//         int nu1=5;
//         int nu2=6;
//         int result = nu1 + nu2;
//         int cfunc = calc.add(nu1,nu2);
//         System.out.println("From Calculator class:: "+cfunc);
//         System.out.println("From classobj class:: "+result);
//     }
// }


// 
import java.util.Scanner;
class Computer{

    int a;
    int b;
    String listnin;

    public String playMusic(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tell me something i dont know:: ");
        listnin= scanner.nextLine();
        return listnin;

    }
    
    public String getMePen(){
        return "hello there jackass...";
    }
}

public class classobj{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Computer comp = new Computer();
        System.out.println(comp.getMePen());
        System.out.println("Want to play music???(only true or false)");
        boolean choi = scanner.nextBoolean();
        if (choi)
        {
            String formfunc = comp.playMusic();
            System.out.println(formfunc);
        }
        else{
            System.out.println("Fuck you jackass....");
        }
    }
}

// for method overloading 

// just make methods of same name in any class you want, just change the 
// parameters as you like then thats method overloading...