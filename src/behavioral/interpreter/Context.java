package behavioral.interpreter;

public class Context {
    Expression evaluate(String str){
        int position = 0;
        while (position < str.length()) {
            if (Character.isDigit(str.charAt(position))){
                position++;
            } else {
                Expression left = new NumberExpression(Integer.parseInt(str.substring(0, position)));
                if (Character.valueOf(str.charAt(position)).equals('-')){
                    return new MinusExpression(left, evaluate(str.substring(position + 1)));
                } else if (Character.valueOf(str.charAt(position)).equals('+')){
                    return new PlusExpression(left, evaluate(str.substring(position + 1)));
                }
            }
        }
        Integer result = Integer.parseInt(str);
        return new NumberExpression(result);
    }
}