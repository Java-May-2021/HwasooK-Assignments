public class StringManipulator {
    public String trimAndConcat(String string1, String string2){
        return string1.trim().concat(string2.trim());
        //Concatenate: A String method that allows two strings to be squashed together. Since each string is immutable, this results in a brand new string.
        //Trim: The trim() method removes any trailing or leading white spaces from the string.
    }

    public Integer getIndexOrNull(String input, char c){
        if ( input.indexOf(c) == -1){
            return null;
        }
            return input.indexOf(c);     
            //IndexOf: The indexOf method searches left-to-right inside the given string for a "target" string. 
            //The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.
    }

    public Integer getIndexOfNull(String input, String sub){
        if(input.indexOf(sub)== -1){
            return null;
        }
        return input.indexOf(sub);

    }

    public String concatSubstring(String input, int num, int num2, String input2){
        String substr;
        try{
            substr = input.substring(num, num2);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(String.format("Exception caught: %s", e));
            substr = "whoops!";
        }

        return substr.concat(input2);
    }

}

