package edu.escuelaing.arep.parcial2tercio;

import static spark.Spark.*;

import edu.escuelaing.arep.parcial2tercio.service.impl.CalculatorImpl;
/**
 * Hello world!
 *
 */
public class App 
{
    public static CalculatorImpl calculator = new CalculatorImpl();

    public static void main( String[] args )
    {
        port(getPort());
        get("/tan", (req,res) -> {
             Double result = calculator.tan(Double.parseDouble(req.queryParams("value")));
            return calculator.defaultOut(result);
        });

        get("/sqrt", (req,res) -> {
            Double result = calculator.sqrt(Double.parseDouble(req.queryParams("value")));
           return calculator.defaultOut(result);
       });


    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35005;
    }
}
