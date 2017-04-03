
public class Token {
	private double value;
	private int precedence;
	private boolean isNumber;
	private String myOperator;
	public Token(String input)
	{
		if(input.charAt(0)=='*')
	    {
	        value=0;
	        isNumber=false;
	        precedence=1;
	        myOperator="*";
	    }
	    else if(input.charAt(0)=='/')
	    {
	        value=0;
	        isNumber=false;
	        precedence=1;
	        myOperator="/";
	    }
	    else if(input.charAt(0)=='+')
	    {
	        value=0;
	        isNumber=false;
	        precedence=0;
	        myOperator="+";
	    }
	    else if(input.charAt(0)=='-')
	    {
	        value=0;
	        isNumber=false;
	        precedence=0;
	        myOperator="-";
	    }
	    else if(input.charAt(0)=='(')
	    {
	        value=0;
	        isNumber=false;
	        precedence=2;
	        myOperator="(";
	    }
	    else if (input.charAt(0)==')')
	    {
	        value=0;
	        isNumber=false;
	        precedence=-1;
	        myOperator=")";
	    }
	    else
	    {
	        value=Double.parseDouble(input);
	        isNumber=true;
	        precedence=3;
	        myOperator="N";
	    }
	}
	public boolean isNumber()
	{
		return this.isNumber;
	}
	public int getPrecedence()
	{
		return this.precedence;
	}
	public double getValue()
	{
		return this.value;
	}
	public String getMyOperator()
	{
		return this.myOperator;
	}
}
