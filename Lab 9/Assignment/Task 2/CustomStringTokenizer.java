package com.company;
import java.util.StringTokenizer;

public class CustomStringTokenizer extends StringTokenizer{
    public CustomStringTokenizer(String string){
        super(string);
    }
    public int countTokens(){
        int total_tokens = super.countTokens();
        int count = total_tokens;
        String token;
        for(int x = 0; x < total_tokens; x++){
            token = super.nextToken();
            for(int y = 0; y < token.length(); y++){
                if(Character.isDigit(token.charAt(y))){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
