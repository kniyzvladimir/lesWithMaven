import java.util.Arrays;

public class StringService {

    // сортировка пузырьком
    public int[] sort(int[] array) {
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                break;
        }
        return array;
    }

    //палиндром
    public boolean isPalindrome(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ')
                sb.append(array[i]);
        }
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();

        return s1.equalsIgnoreCase(s2);
    }

    // Создать метод, который получает на вход текст(String) и символ(char).
    // Возвращает int значение кол-ва повторений данного символа в тексте.
    public int charRepeat(String s, char c) {
        int repeatChar = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c)
                repeatChar++;
        }
        return repeatChar;
    }

    //  Создать метод, который получает строку(String) и переворачивает его. Пример -> “12345” -> “54321”
    public String expandString(String s) {
        String expandString = "";
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            expandString += array[array.length - i - 1];
        }
        return expandString;
    }

    //Создать метод, который разделяет строку(String) на массив(String[]) по символу(char).
    // Пример -> “1,2,34,5” -> [“1”,”2”,”34”,”5”]
    public String[] stringInStringArray(String string, char separator) {
        char[] charArray = string.toCharArray();
        int lenArray = 0;
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == separator && charArray[i - 1] != separator)
                lenArray++;
        }

        String[] stringArray = new String[lenArray];
        int index = 0;
        String s = "";
        for (int i = 0; i < charArray.length; i++) { //",1,,2,34,5,"
            if (charArray[i] != separator) {
                s += charArray[i];
            }
            if (charArray[i] == separator && !s.equals("")) {
                stringArray[index] = s;
                s = "";
                index++;
            }
        }
        return stringArray;
    }
}
