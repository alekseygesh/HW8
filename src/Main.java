import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //чтение в буфер введенного значения
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        //регулярка на проверку, число целое и положительное или нет
        String reg = "^[0-9]+$";

        String value;
        do {
            System.out.println("Введите целое положительное число: ");
            value = buffer.readLine();
        } while (!(value.matches(reg)) || value.equals("0"));
        int myValue = Integer.parseInt(value);

        int sum = 0;
        for(int i = 1; i < myValue+1; i = i+2){
            sum += i;
        }

        System.out.println("Сумма всех нечетных чисел от 1 до " + value + " равна " + sum);
    }
}