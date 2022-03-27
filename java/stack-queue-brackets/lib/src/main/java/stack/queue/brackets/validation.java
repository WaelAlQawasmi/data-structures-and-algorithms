package stack.queue.brackets;

public class validation {


    public static boolean validatebrackets(String theString){
        stack openBracate= new stack();

        if(theString.isEmpty()){
            return true;
        }
        int counter=0;
        while (counter!=theString.length()){

            char  theCar=theString.toCharArray()[counter++];
            if(theCar=='{'||theCar=='['||theCar=='('){
                Node N= new Node(theCar);
                openBracate.push(N);

            }
            if(theCar!='}'&&theCar!=')'&&theCar!=']'){
                continue;
            }
            if(openBracate.isEmpty()&&(theCar=='}'||theCar==')'||theCar==']')){

                return false;
            }
            if(openBracate.peek()=='{' && theCar!='}'){
                return false;
            }
            if(openBracate.peek()=='[' && theCar!=']'){
                return false;
            }
            if(openBracate.peek()=='(' && theCar!=')'){
                return false;
            }
            openBracate.pop();

        }

        return true;
    }

}
