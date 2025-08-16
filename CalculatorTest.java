class Calculator
{
    

    public int sub(int a , int b)
    {
        return a - b ;
    }
}



public class CalculatorTest
{
    public static void main(String[] args) 
    {
        Calculator  calc = new Calculator();
        

        System.out.println("Result:" + calc.sub(10, 20));
        
    }
}