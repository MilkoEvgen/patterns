package behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        //каждое последующее выражение считает как в скобках
        //то есть "32-32+15" считает как "32-(32+15)"
        String exp = "32-32+15";
        Context context = new Context();
        System.out.println(context.evaluate(exp).interpret());
    }
}
