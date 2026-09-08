public class Question13 {
    static class TemperatureQ13 {
        double celsius;
        static String scale = "Celsius";

        TemperatureQ13(double celsius) {
            this.celsius = celsius;
        }

        double toFahrenheit() {
            return (celsius * 9 / 5) + 32;
        }

        double toKelvin() {
            return celsius + 273.15;
        }
    }

    public static void main(String[] args) {
        TemperatureQ13 t = new TemperatureQ13(25);
        System.out.println("Scale: " + TemperatureQ13.scale);
        System.out.println("Fahrenheit: " + t.toFahrenheit());
        System.out.println("Kelvin: " + t.toKelvin());
    }
}

/*
Output:
Scale: Celsius
Fahrenheit: 77.0
Kelvin: 298.15
*/
