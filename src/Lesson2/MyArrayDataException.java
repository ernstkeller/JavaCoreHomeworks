package Lesson2;

public class MyArrayDataException extends MyExceptions {

    public MyArrayDataException(int row, int col) {
        super(String.format("Неверный формат элемента массива [%d, %d]", row, col));
    }
}