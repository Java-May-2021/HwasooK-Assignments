public class StringManPrac {
    public String trimAndConcat(String string1, String string2){
        return string1.trim().concat(string2.trim());
    }
    public Integer getIndexOrNull(String input, char c){
        if(input.indexOf(c) == -1){
            return null;
        }
            return input.indexOf(c);
        
    }
}
