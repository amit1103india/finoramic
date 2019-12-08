
public class RedundantBraces{
    public int braces(String A) {
        char[] paranthesis = new char[A.length()/2];
        boolean[] consecutive = new boolean[A.length()/2];
        
        //initialization
        int top = 0;
        char prevChar = A.charAt(top);
        
        if(prevChar == '('){
            paranthesis[top] = prevChar;
            consecutive[top] = false;
        }
        
        boolean operatorFound = false;
        for(int i = 1; i < A.length(); i++){
            char currChar = A.charAt(i);
            
            if(currChar == '('){
                operatorFound = false;
                top++;
                paranthesis[top] = currChar;
                if(prevChar == '('){
                    consecutive[top] = true;
                } else {
                    consecutive[top] = false;
                }
            } else if(currChar == ')'){
                //redundant check
                if(i+1 < A.length() && A.charAt(i+1) == ')' && consecutive[top]){
                    return 1;
                }
                
                if(!operatorFound)
                    return 1;
                
                //if not redundant, pop on brace
                top--;
            } else if (currChar == '+' || currChar == '-' 
                        || currChar == '*' || currChar == '/'){
                operatorFound = true;
            }
            
            prevChar = currChar;
        }
        
        return 0;
        
    }
}