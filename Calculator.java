import java.util.Stack;
import java.util.ArrayList;
public class Calculator {
	private ArrayList<String> expression;
	private Stack valueStack;
	private Stack operatorStack;
	private void process(Token token)
	{
		double topValue=(double)valueStack.peek();
	    valueStack.pop();
	    double secValue=(double)valueStack.peek();
	    valueStack.pop();
	    double result;
	    if(token.getMyOperator()=="*")
	    {
	        result=secValue*topValue;
	    }
	    else if (token.getMyOperator()=="/")
	    {
	        result=secValue/topValue;
	    }
	    else if (token.getMyOperator()=="+")
	    {
	        result=secValue+topValue;
	    }
	    else
	    {
	        result=secValue-topValue;
	    }
	    valueStack.push(result);
	}
	public Calculator (ArrayList<String> inputEx)
	{
		valueStack=new Stack();
		operatorStack=new Stack();
		expression=inputEx;
	}
	public double calculate()
	{
		for(int i=0; i<expression.size(); ++i)
		{
			String input=expression.get(i);
			Token token=new Token(input);
	        if(token.isNumber())
	        {
	            valueStack.push(token.getValue());
	        }
	        else
	        {
	            if(operatorStack.empty())
	            {
	                operatorStack.push(token);
	            }
	            else
	            {
	                if(token.getPrecedence()!=-1)
	                {

	                    if(((Token)(operatorStack.peek())).getPrecedence()>token.getPrecedence() && ((Token)(operatorStack.peek())).getPrecedence() != 2)
	                    {
	                        this.process((Token)operatorStack.peek());
	                        operatorStack.pop();
	                        operatorStack.push(token);
	                    }
	                    else
	                    {
	                        operatorStack.push(token);
	                    }
	                }
	                else
	                {
	                    while(((Token)(operatorStack.peek())).getPrecedence()!=2)
	                    {
	                        process((Token)operatorStack.peek());
	                        operatorStack.pop();
	                    }
	                    operatorStack.pop();
	                }
	            }
	        }
		}
		 while(operatorStack.empty()==false)
	    {
	        process((Token)operatorStack.peek());
	        operatorStack.pop();
	    }
	    return (double)valueStack.peek();
	}
}
