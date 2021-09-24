/*What should the functions have as parameter(s)?
The parameters should be the original degree unit that needs to be converted to the
other unit.
What type should they be?
It should be a double to be as precise as possible, especially after
converting.
What should the functions return?
The functiion should return the converted degree- essentially, it shoudl return
Fahrenheit if the input was in Celsus and Celsius if the input was in Fahrenheit*/
public class CtoFTester{
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(20));
    System.out.println(fahrenheitToCelsius(20));
  }
  public static double celsiusToFahrenheit(double n){
    return ((9.0/5.0)*n +32.0);
  }
  public static double fahrenheitToCelsius(double n){
    return ((5.0/9.0)*(n-32));
  }
}
