package Lesson2;

public class Converter {

    public static int strConverter(String[][] strArray)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != strArray.length) throw new MyArraySizeException();

        for (int i = 0; i < strArray.length; i++) {

            if (4 != strArray[i].length) throw new MyArraySizeException();

            for (int x = 0; x < strArray[i].length; x++) {

                try {
                    sum += Integer.parseInt(strArray[i][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, x);
                }
            }
        }

        return sum;
    }
}
