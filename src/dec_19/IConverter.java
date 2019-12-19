package dec_19;

public interface IConverter<T extends Double> {
    T convert(T value);
}
