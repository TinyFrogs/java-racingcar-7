package racingcar.validation;

public class InputValidation {

    public String blackValidation(String inputValue){
        if(inputValue.isBlank()) throw new IllegalArgumentException("공백으로만 이루어져 있습니다.");
        return inputValue;
    }


    public int checkCountValidation(String countValue){
        int count = parseValidation(countValue);
        positiveValidation(count);
        return count;
    }

    private void positiveValidation(int count){
        if(count <= 0) throw new IllegalArgumentException("양의 정수가 아닙니다.");
    }

    private int parseValidation(String count){
        try{
            return Integer.parseInt(count);
        }
        catch(Exception e){
            throw new IllegalArgumentException("정수로 변환할 수 없습니다.");
        }
    }
}
