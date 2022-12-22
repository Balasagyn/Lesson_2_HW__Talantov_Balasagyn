public class Main {
    public static void main(String[] args) {

        System.out.println(weather(27, 10));
        System.out.println(weather(23, 19));
        System.out.println(weather(26, 13));
        System.out.println(weather(22, 17));
        System.out.println(weather(21, 16));
    }

    public static String weather(int age, int temperature){
        if ((age >= 25 && age <= 45) && (temperature >= -20 && temperature <= 30)){
            return "Можно идти гулять";
        }
        else if ((age <= 20) && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        }
        else if ((age > 45) && (temperature >= -10 && temperature <= 25)){
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }
    }
}