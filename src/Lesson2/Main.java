package Lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"4", "1", "6", "2"},
                {"5", "2", "3", "1"},
                {"6", "0", "4", "3"},
                {"2", "1", "0", "5"}
        };

//        Примеры неверных массивов

//        String[][] array = {
//                {"2", "6", "5", "1"},
//                {"3", "4"},
//                {"1", "3", "0", "4"},
//                {"4", "3", "6", "0"}
//        };
//        String[][] array = {
//                {"5", "1", "6", "3"},
//                {"5", "2", "0", "4"},
//                {"0", "", "3", "3"},
//                {"4", "0", "5", "2"}
//        };

        try {
            System.out.println(Converter.strConverter(array));
        } catch (MyExceptions e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.strConverter(array));
        } catch (MyExceptions e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(array));
        } catch (MyExceptions e) {
            System.err.println(e.getMessage());
        }


    }
}