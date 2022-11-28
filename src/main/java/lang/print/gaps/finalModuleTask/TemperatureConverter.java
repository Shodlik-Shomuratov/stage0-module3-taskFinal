package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double fahrenheit = (temperatureCelsius * 1.0 * 9 / 5) + 32;

        System.out.println(fahrenheit);
    }
}
