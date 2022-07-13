import java.util.Scanner;



                  //Classes:-
// Follows PascelNaming Convention
// ex: MyNameLol

public class Main {
  
                 //Functions:-
// Follows camleCaseNaming Convention
// ex: myNameLol 

  public static void main(String[] args) {
   

//              Data Types:
//   Non Primitive data type:- Derive from the primitve data type

//               Literals: 
// Constant Value which can be assigned to a variable is called Literals.
/* ex: float f1 = 4.3f or F; double d1=34.3d or D; or double d1=34.3; long l1=43643447647846736432463246l or L; String a = "baka"; etc. */
                    // Note:
/* long, short, byte, int can be used to store integer values deending on the number of intergers it can store.*/

                //Input From The User
 
    System.out.println("Taking input from the user: ");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the First Number: ");
    int a = sc.nextInt();
    System.out.println("Enter the Second Number: ");
    int b = sc.nextInt();
    int sum = a + b;
   System.out.println("The Sum is: ");
    System.out.println(sum);
  }
}

                    // Note:
/* String str = sc.next();
    System.out.println(Str); This will only print first word 
    before space, ex: harry is a bad boy, output = harry.
    String str = sc.nextLine();
    System.out.println(Str); but this will print every single thing written in one line with or without space, ex: My shits, Output = My shits.
*/
