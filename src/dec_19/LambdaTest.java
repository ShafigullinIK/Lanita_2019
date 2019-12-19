package dec_19;

public class LambdaTest {

    public void print(
            IConverter converter,
            double value) {
        Number newValue = converter.convert(value);
        System.out.println("Было = " + value + "\n" +
                "стало = " + newValue);
    }

    public double change(
            IConverter<Double> converter,
            double value) {
        return converter.convert(value);

    }

}
