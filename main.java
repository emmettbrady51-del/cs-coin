
    import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class main {
public static void main( String[] args ) {
final double PENNY_VALUE = 0.01;
final double NICKEL_VALUE = 0.05;
final double DIME_VALUE = 0.1;
final double QUARTER_VALUE = 0.25;
Scanner console = new Scanner ( System.in );
System.out.printf("\nHow many pennies do you have?\n");
int pennys = console.nextInt();
System.out.printf("How many nickels do you have?\n");
int nickels = console.nextInt();
System.out.printf("How many dimes do you have?\n");
int dimes = console.nextInt();
System.out.printf("How many quarters do you have?\n");
int quarters = console.nextInt();
System.out.printf("\nHow many half dollars do you have?\n");
int halfDollars = console.nextInt();
System.out.printf("How many dollars do you have?\n");
int dollars = console.nextInt();
double total = pennys * PENNY_VALUE
+ nickels * NICKEL_VALUE
+ dimes * DIME_VALUE
+ quarters * QUARTER_VALUE
+ halfDollars * .5
+ dollars * 1;
// total value of the coins
//ji
//dd
NumberFormat formatter
= NumberFormat.getCurrencyInstance(Locale.US);
    
String output = "Total value = " + formatter.format(total);
System.out.printf( output );
console.close();
} // end main
} // end class