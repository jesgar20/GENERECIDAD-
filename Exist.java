package Desarrollo;
public class Exist {
    public static <T> boolean exist(T[] array, T elem) {
        for (T item : array) {
            if (item.equals(elem)) return true;
        }
        return false;
    }
}