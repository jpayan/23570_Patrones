import Observables.WeatherData;
import Observers.DisplayA;
import Observers.DisplayB;
import Observers.DisplayC;

public class Main {
    public static void main(String[] args) {
        DisplayA displayA = new DisplayA();
        DisplayB displayB = new DisplayB();
        DisplayC displayC = new DisplayC();

        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(displayA);
        weatherData.addObserver(displayB);
        weatherData.addObserver(displayC);

        weatherData.setMeasurements(12.1234, 104.8762, 16.0728);

        weatherData.deleteObserver(displayA);


        weatherData.setMeasurements(10.2647, 78.2234, 19.5672);
    }
}
