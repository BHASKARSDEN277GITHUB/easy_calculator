package bhaskar.easycalculator;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
public class MainActivity extends Activity {
	
	private static final int MENU_ABOUT = Menu.FIRST;
	//declaring arrays and allocating memory ..:) ..
	static String[] str = new String[20] ;//to store numeric terms ... numbers are good ..
	//double[] result2 = new double[10];//to store result2 of each individual expression part ..lets tear terar them apart .. ;)
	static double result2 ;
	static char[] operator = new char[20] ;//to store operators..
	static char check2 =' ';
	//declaring indexes and initializing them ..
	static int i =0 ;//no of numeric terms ..
	int o=1;//no of operands ..
	
	static int check =-1;//to check if input is made ..
	static int expression_length = 0 ;
    static String expression = ""; //to write the expression ..
    static int[] loent = new int[10];//length of each numeric term ... ;).. 
    static int fact=1 ; //for factorial function ..
    static int stackpointer1 = -1;
	static int stackpointer2=-1;
	static double[] operandstack =new double[20] ;
	static char[] operatorstack=new char[20];
	static double  result1 ;
	static double pop ;
	static char pop1 ;
	static int r = 1;
	static double result ;
    
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);//always calling super is good ..
		setContentView(R.layout.activity_main);

LinearLayout linear1 = (LinearLayout)findViewById(R.id.linear1);
linear1.setBackgroundColor(Color.rgb(89,89,89));
LinearLayout linear2 = (LinearLayout)findViewById(R.id.linear2);
linear2.setBackgroundColor(Color.rgb(0,0,0));
LinearLayout linear3 = (LinearLayout)findViewById(R.id.linear3);
linear3.setBackgroundColor(Color.rgb(0,0,0));
LinearLayout linear4 = (LinearLayout)findViewById(R.id.linear4);
linear4.setBackgroundColor(Color.rgb(89,89,89));
LinearLayout linear5 = (LinearLayout)findViewById(R.id.linear5);
linear5.setBackgroundColor(Color.rgb(89,89,89));
LinearLayout linear6 = (LinearLayout)findViewById(R.id.linear6);
linear6.setBackgroundColor(Color.rgb(89,89,89));
LinearLayout linear7 = (LinearLayout)findViewById(R.id.linear7);
linear7.setBackgroundColor(Color.rgb(89,89,89));
LinearLayout linear8 = (LinearLayout)findViewById(R.id.linear8);
linear8.setBackgroundColor(Color.rgb(89,89,89));

LinearLayout linear9 = (LinearLayout)findViewById(R.id.linear9);
linear9.setBackgroundColor(Color.rgb(89,89,89));
EditText edt =(EditText)findViewById(R.id.edittext1);
edt.setBackgroundColor(Color.rgb(29,38,43));
edt.setTextColor(Color.rgb(255,255 ,255 ));
edt.setHintTextColor(Color.rgb(89,89,89));
	Button button1 = (Button) findViewById(R.id.button1);
	Button button2 = (Button) findViewById(R.id.button2);
	Button button3 = (Button) findViewById(R.id.button3);
	Button button4 = (Button) findViewById(R.id.button4);
	Button button5 = (Button) findViewById(R.id.button5);
	Button button6 = (Button) findViewById(R.id.button6);
	Button button7 = (Button) findViewById(R.id.button7);
	Button button8 = (Button) findViewById(R.id.button8);
	Button button9 = (Button) findViewById(R.id.button9);
	Button button10 = (Button) findViewById(R.id.button10);
	Button button11 = (Button) findViewById(R.id.button11);
	Button button12 = (Button) findViewById(R.id.button12);
	Button button13 = (Button) findViewById(R.id.button13);
	Button button14 = (Button) findViewById(R.id.button14);
	Button button15 = (Button) findViewById(R.id.button15);
	Button button16 =(Button) findViewById(R.id.button16);
	Button button17 =(Button) findViewById(R.id.button17);
	Button button18=(Button) findViewById(R.id.button18);
	Button[] button = new Button[]{(Button)findViewById(R.id.button20),(Button)findViewById(R.id.button21),(Button)findViewById(R.id.button22),(Button)findViewById(R.id.button23),(Button)findViewById(R.id.button24),(Button)findViewById(R.id.button19),(Button)findViewById(R.id.button25),(Button)findViewById(R.id.button26)};
	//Button button06=(Button) findViewById(R.id.button06);
	
	button1.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button1.setTextColor(Color.rgb(255, 255, 255));
	button2.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(191,8,5),Color.rgb(191,8,5)));
	button2.setTextColor(Color.rgb(255, 255, 255));
	button3.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button3.setTextColor(Color.rgb(255, 255, 255));
	button4.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button4.setTextColor(Color.rgb(255, 255, 255));
	button5.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button5.setTextColor(Color.rgb(255, 255, 255));
	
	button6.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button6.setTextColor(Color.rgb(255, 255, 255));
	button7.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button7.setTextColor(Color.rgb(255, 255, 255));
	button8.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button8.setTextColor(Color.rgb(255, 255, 255));
	button9.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button9.setTextColor(Color.rgb(255, 255, 255));
	button10.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button10.setTextColor(Color.rgb(255, 255, 255));
	button11.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button11.setTextColor(Color.rgb(255, 255, 255));
	button12.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button12.setTextColor(Color.rgb(255, 255, 255));
	button13.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button13.setTextColor(Color.rgb(255, 255, 255));
	button14.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button14.setTextColor(Color.rgb(255, 255, 255));
	button15.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button15.setTextColor(Color.rgb(255, 255, 255));
	button16.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(89,89,89),Color.rgb(89,89,89)));
	button16.setTextColor(Color.rgb(255, 255, 255));
	button17.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(123,76,14),Color.rgb(123,76,14)));
	button17.setTextColor(Color.rgb(255, 255, 255));
	button18.getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button18.setTextColor(Color.rgb(255, 255, 255));
	button[0].getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button[0].setTextColor(Color.rgb(255, 255, 255));
	button[1].getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button[1].setTextColor(Color.rgb(255, 255, 255));
	button[2].getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button[2].setTextColor(Color.rgb(255, 255, 255));
	button[3].getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button[3].setTextColor(Color.rgb(255, 255, 255));
	button[4].getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button[4].setTextColor(Color.rgb(255, 255, 255));
	button[5].getBackground().setColorFilter(new LightingColorFilter(Color.rgb(191,8,5),Color.rgb(191,8,5)));
	button[5].setTextColor(Color.rgb(255, 255, 255));
	button[6].getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button[6].setTextColor(Color.rgb(255, 255, 255));
	button[7].getBackground().setColorFilter(new LightingColorFilter(Color.rgb(34,34,34),Color.rgb(34,34,34)));
	button[7].setTextColor(Color.rgb(255, 255, 255));
	
	
	
	
	
	//initializing arrays ..
	str[0]="";
	operator[0]='+';
	result2=0;
	loent[0]=0; //loent is actually .. length of each individual numeric term in expression .. lonely .. ;P
	
	
button15.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			str[i] = str[i] +".";
			loent[i]++;
			check++;
			expression = expression +".";
			expression_length++;
			EditText text1 = (EditText) findViewById(R.id.edittext1) ;
			text1.setText(expression+"");
		}
	} );
	button16.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			str[i] = str[i] +"0";
			loent[i]++;
			check++;
			expression = expression +"0";
			expression_length++;
			EditText text1 = (EditText) findViewById(R.id.edittext1) ;
			text1.setText(expression+"");
		}
	} );
	
button11.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			str[i] = str[i] +"1";
			loent[i]++;
			check++;
			expression = expression+"1";
			expression_length++;
			EditText text1 = (EditText) findViewById(R.id.edittext1) ;
			text1.setText(expression);
		}
	} );
button12.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		str[i] = str[i] +"2";
		loent[i]++;
		check++;
		expression = expression+"2";
		expression_length++;
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		text1.setText(expression);
	}
} );
	
button13.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		str[i] = str[i] +"3";
		loent[i]++;
		check++;
		expression = expression+"3";
		expression_length++;
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		text1.setText(expression);
	}
} );
button7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		str[i] = str[i] +"4";
		loent[i]++;
		check++;
		expression = expression+"4";
		expression_length++;
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		text1.setText(expression);
	}
} );
button8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		str[i] = str[i] +"5";
		loent[i]++;
		check++;
		expression = expression+"5";
		expression_length++;
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		text1.setText(expression);
	}
} );
	
button9.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		str[i] = str[i] +"6";
		loent[i]++;
		check++;
		expression = expression+"6";
		expression_length++;
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		text1.setText(expression);
	}
} );

button3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		str[i] = str[i] +"7";
		loent[i]++;
		check++; //check if input is given or not ..
		expression = expression+"7";
		expression_length++;
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		text1.setText(expression);
	}
} );

button4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		str[i] = str[i] +"8";
		loent[i]++;
		check++;
		expression = expression+"8";
		expression_length++;
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		text1.setText(expression);
	}
} );

button5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		str[i] = str[i] +"9";
		loent[i]++;
		check++;
		expression = expression+"9";
		expression_length++;
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		text1.setText(expression);
	}
} );

button18.setOnClickListener(new View.OnClickListener() { //m tired of this setOn.......thing .. 
	
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		if(expression.equals("")){text1.setText("Error");}
		//else if((expression.substring(expression_length-1,expression_length).equals("+") ||expression.substring(expression_length-1,expression_length).equals("*")||expression.substring(expression_length-1,expression_length).equals("/")||expression.substring(expression_length-1,expression_length).equals("-")))
		//{
			//text1.setText("Error");
		//}
		
		
		else{
		
			
			if(check>=0){
		operator[o]='+';
		
		i++;
		str[i]="";
		o++;
		loent[i]=0;
		expression = expression+"+";
		expression_length++;
		
		text1.setText(expression);
		
		}
		else
		{
			
			text1.setText("Give numeric  input first..");
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;
		
		}
		}
	}
} );


button14.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText)findViewById(R.id.edittext1);
		if(expression.equals("")){text1.setText("Error");}
		//else if((expression.substring(expression_length-1,expression_length).equals("+") ||expression.substring(expression_length-1,expression_length).equals("*")||expression.substring(expression_length-1,expression_length).equals("/")||expression.substring(expression_length-1,expression_length).equals("-")))
	//	{
		//	text1.setText("Error");
		//}
		else{
		if(check>=0){
		operator[o]='-';
		
		i++;
		str[i]="";
		o++;
		loent[i]=0;
		
		expression = expression+"-";
		expression_length++;
		
		text1.setText(expression);
		
		}
		else
		{
			
			text1.setText("Give numeric  input first..");
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;
		}
		}
	}
} );

button10.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText)findViewById(R.id.edittext1);
		if(expression.equals("")){text1.setText("Error");}
	//	else if((expression.substring(expression_length-1,expression_length).equals("+") ||expression.substring(expression_length-1,expression_length).equals("*")||expression.substring(expression_length-1,expression_length).equals("/")||expression.substring(expression_length-1,expression_length).equals("-")))
		//{
			//text1.setText("Error");
		//}
		else{
		if(check>=0){
		operator[o]='*';
		
		i++;
		str[i]="";
		o++;
		loent[i]=0;
		expression = expression+"*";
		expression_length++;
		
		text1.setText(expression);
		}
		else
		{
			
			text1.setText("Give numeric  input first..");
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;
		}
		}
	}
} );

button6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		EditText text1 = (EditText)findViewById(R.id.edittext1);
		if(expression.equals("")){text1.setText("Error");}
		//else if((expression.substring(expression_length-1,expression_length).equals("+") ||expression.substring(expression_length-1,expression_length).equals("*")||expression.substring(expression_length-1,expression_length).equals("/")||expression.substring(expression_length-1,expression_length).equals("-")))
		//{
			//text1.setText("Error");
		//}
		else{
		if(check>=0){
		operator[o]='/';
		
		i++;
		str[i]="";
		o++;
		loent[i]=0;
		expression = expression+"/";
		expression_length++;
		
		text1.setText(expression);
		}
		else
		{
			
			text1.setText("Give numeric  input first..");
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;
		}
		}
	}
} );



button[7].setOnClickListener(new View.OnClickListener() {
	//sqrt
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		if(expression.equals("")){text1.setText("Error");}
		else if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
			
			     text1.setText("Error");
			     i=0;
					o=1;
					r=0;
					str[0]="";
					operator[0]='+';
					result2=0;
					check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
					
					expression = "";
					expression_length=0;
				
		}
		 else if(str[i].equals(""))
		 { 	text1.setText("Error"); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}
		
		;
		if(check>=0){
	    
		int a =0 ;
		double[] intarray = new double[10];
		for(a=0;a<=i;a++)
		{
			intarray[a]=Double.parseDouble(str[a]); //parsing string to double ..
		}
		if(i==0){result2=intarray[0]; text1.setText(result2+"");}//if only numeric term is the input .. ;)
		else
		{
			result2=stackystack(intarray,operator);
		}
		//double angle=java.lang.Math.toDegrees((double)result2);
		double value=java.lang.Math.sqrt((double)result2);
		
		result2=(double)value;
		text1.setText("Ans : "+result2+"");  //displaying result ..
		
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result =(int)result2;
		while(copy_result!=0)//calculating number of digits in result ..
		{
			copy_result = copy_result/10;
			count++ ;
			
		}
		
		
		expression="";
		expression=""+(int)result2; //writing the result to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
	    
		
		}
		else
		{
			text1.setText("Give numeric input first "); //if user directly enters operator without any numeric term ..	
		}
	}
} );
//sin

button1.setOnClickListener(new View.OnClickListener() {
	//sin
	
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		if(expression.equals("")){text1.setText("Error");}
		else if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
			
			     text1.setText("Error");
			     i=0;
					o=1;
					r=0;
					str[0]="";
					operator[0]='+';
					result2=0;
					check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
					
					expression = "";
					expression_length=0;
				
		}
		 else if(str[i].equals(""))
		 { 	text1.setText("Error"); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}
		
		;
		if(check>=0){
	    
		int a =0 ;
		double[] intarray = new double[10];
		for(a=0;a<=i;a++)
		{
			intarray[a]=Double.parseDouble(str[a]); //parsing string to double ..
		}
		if(i==0){result2=intarray[0]; text1.setText(result2+"");}//if only numeric term is the input .. ;)
		else
		{
			result2=stackystack(intarray,operator);
		}
		//double angle=java.lang.Math.toDegrees((double)result2);
		double value=java.lang.Math.sin((double)result2);
		
		result2=(double)value;
		text1.setText("Ans : "+result2+"");  //displaying result ..
		
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result =(int)result2;
		while(copy_result!=0)//calculating number of digits in result ..
		{
			copy_result = copy_result/10;
			count++ ;
			
		}
		
		
		expression="";
		expression=""+(int)result2; //writing the result to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
	    
		
		}
		else
		{
			text1.setText("Give numeric input first "); //if user directly enters operator without any numeric term ..	
		}
	}
} );

button[1].setOnClickListener(new View.OnClickListener() {
	//tan
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		if(expression.equals("")){text1.setText("Error");}
		else if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
			
			     text1.setText("Error");
			     i=0;
					o=1;
					r=0;
					str[0]="";
					operator[0]='+';
					result2=0;
					check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
					
					expression = "";
					expression_length=0;
				
		}
		 else if(str[i].equals(""))
		 { 	text1.setText("Error"); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}
		
		;
		if(check>=0){
	    
		int a =0 ;
		double[] intarray = new double[10];
		for(a=0;a<=i;a++)
		{
			intarray[a]=Double.parseDouble(str[a]); //parsing string to double ..
		}
		if(i==0){result2=intarray[0]; text1.setText(result2+"");}//if only numeric term is the input .. ;)
		else
		{
			result2=stackystack(intarray,operator);
		}
		
		
		//double angle=java.lang.Math.toDegrees((double)result2);
		double value=java.lang.Math.tan((double)result2);
		
		result2=(double)value;
		text1.setText("Ans : "+result2+"");  //displaying result ..
		
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result =(int)result2;
		while(copy_result!=0)//calculating number of digits in result ..
		{
			copy_result = copy_result/10;
			count++ ;
			
		}
		
		
		expression="";
		expression=""+(int)result2; //writing the result to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
	    
		
		}
		else
		{
			text1.setText("Give numeric input first "); //if user directly enters operator without any numeric term ..	
		}
	}
} );
button[6].setOnClickListener(new View.OnClickListener() {
	//e
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		if(expression.equals("")){text1.setText("Error");}
		else if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
			
			     text1.setText("Error");
			     i=0;
					o=1;
					r=0;
					str[0]="";
					operator[0]='+';
					result2=0;
					check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
					
					expression = "";
					expression_length=0;
				
		}
		 else if(str[i].equals(""))
		 { 	text1.setText("Error"); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}
		
		;
		if(check>=0){
	    
		int a =0 ;
		double[] intarray = new double[10];
		for(a=0;a<=i;a++)
		{
			intarray[a]=Double.parseDouble(str[a]); //parsing string to double ..
		}
		if(i==0){result2=intarray[0]; text1.setText(result2+"");}//if only numeric term is the input .. ;)
		else
		{
			result2=stackystack(intarray,operator);
		}
		
		
		
		
		double value=java.lang.Math.exp((double)result2);
		
		result2=(double)value;
		text1.setText("Ans : "+result2+"");  //displaying result ..
		
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result =(int)result2;
		while(copy_result!=0)//calculating number of digits in result ..
		{
			copy_result = copy_result/10;
			count++ ;
			
		}
		
		
		expression="";
		expression=""+(int)result2; //writing the result to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
	    
		
		}
		else
		{
			text1.setText("Give numeric input first "); //if user directly enters operator without any numeric term ..	
		}
	}
} );
button[0].setOnClickListener(new View.OnClickListener() {
	//cos
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		if(expression.equals("")){text1.setText("Error");}
		else if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
			
			     text1.setText("Error");
			     i=0;
					o=1;
					r=0;
					str[0]="";
					operator[0]='+';
					result2=0;
					check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
					
					expression = "";
					expression_length=0;
				
		}
		 else if(str[i].equals(""))
		 { 	text1.setText("Error"); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}
		
		;
		if(check>=0){
	    
		int a =0 ;
		double[] intarray = new double[10];
		for(a=0;a<=i;a++)
		{
			intarray[a]=Double.parseDouble(str[a]); //parsing string to double ..
		}
		if(i==0){result2=intarray[0]; text1.setText(result2+"");}//if only numeric term is the input .. ;)
		else
		{
			result2=stackystack(intarray,operator);
		}
		
		
		//double angle=java.lang.Math.toDegrees((double)result2);
		double value=java.lang.Math.cos((double)result2);
		
		result2=(double)value;
		
		text1.setText("Ans : "+result2+"");  //displaying result ..
		
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result =(int)result2;
		while(copy_result!=0)//calculating number of digits in result ..
		{
			copy_result = copy_result/10;
			count++ ;
			
		}
		
		
		expression="";
		expression=""+(int)result2; //writing the result to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
	    
		
		}
		else
		{
			text1.setText("Give numeric input first "); //if user directly enters operator without any numeric term ..	
		}
	}
} );
button[2].setOnClickListener(new View.OnClickListener() {
	//log
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;

		if(expression.equals("")){text1.setText("Error");}
		else if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
			
			     text1.setText("Error");
			     i=0;
					o=1;
					r=0;
					str[0]="";
					operator[0]='+';
					result2=0;
					check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
					
					expression = "";
					expression_length=0;
				
		}
		 else if(str[i].equals(""))
		 { 	text1.setText("Error"); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}
		
		;
		if(check>=0){
	    
		int a =0 ;
		double[] intarray = new double[10];
		for(a=0;a<=i;a++)
		{
			intarray[a]=Double.parseDouble(str[a]); //parsing string to double ..
		}
		if(i==0){result2=intarray[0]; text1.setText(result2+"");}//if only numeric term is the input .. ;)
		else
		{
			result2=stackystack(intarray,operator);
		}
		if(result2<0)
        {
        	text1.setText("Not defined ..");
        
        i=0;
    	o=1;
    	r=0;
    	str[0]="";
    	operator[0]='+';
    	result2=0;
    	check=-1;
    	
    	text1.setText("");
    	expression = "";
    	expression_length=0;
        
        }
		else if(result2==0)
		{
			text1.setText("-infinity");
			i=0;
	    	o=1;
	    	r=0;
	    	str[0]="";
	    	operator[0]='+';
	    	result2=0;
	    	check=-1;
	    	
	    	text1.setText("");
	    	expression = "";
	    	expression_length=0;
		}
        else{
		//to calculate log of previous result ..
        	
    		double value=java.lang.Math.log((double)result2);
    		
    		result2=(double)value;
        }
		text1.setText("Ans : "+result2+"");  //displaying result ..
		
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result =(int)result2;
		while(copy_result!=0)//calculating number of digits in result ..
		{
			copy_result = copy_result/10;
			count++ ;
			
		}
		
		
		expression="";
		expression=""+(int)result2; //writing the result to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
	    
		
		}
		else
		{
			text1.setText("Give numeric input first "); //if user directly enters operator without any numeric term ..	
		}
	}
} );
button[3].setOnClickListener(new View.OnClickListener() {
	//x2
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		

		if(expression.equals("")){text1.setText("Error");}
		else if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
			
			     text1.setText("Error");
			     i=0;
					o=1;
					r=0;
					str[0]="";
					operator[0]='+';
					result2=0;
					check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
					
					expression = "";
					expression_length=0;
				
		}
		 else if(str[i].equals(""))
		 { 	text1.setText("Error"); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}
		
		;
		if(check>=0){
	    
		int a =0 ;
		double[] intarray = new double[10];
		for(a=0;a<=i;a++)
		{
			intarray[a]=Double.parseDouble(str[a]); //parsing string to double ..
		}
		if(i==0){result2=intarray[0]; text1.setText(result2+"");}//if only numeric term is the input .. ;)
		else
		{
			result2=stackystack(intarray,operator);
		}
		
		result2=power(result2,2);
		text1.setText("Ans : "+result2+"");  //displaying result ..
		
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result =(int)result2;
		while(copy_result!=0)//calculating number of digits in result ..
		{
			copy_result = copy_result/10;
			count++ ;
			
		}
		
		
		expression="";
		expression=""+(int)result2; //writing the result to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
	    
		
		}
		else
		{
			text1.setText("Give numeric input first "); //if user directly enters operator without any numeric term ..	
		}
	}
} );




button[4].setOnClickListener(new View.OnClickListener() {
	//x^-1
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;

		if(expression.equals("")){text1.setText("Error");}
		else if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
			
			     text1.setText("Error");
			     i=0;
					o=1;
					r=0;
					str[0]="";
					operator[0]='+';
					result2=0;
					check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
					
					expression = "";
					expression_length=0;
				
		}
		 else if(str[i].equals(""))
		 { 	text1.setText("Error"); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}
		
		;
		if(check>=0){
	    
		int a =0 ;
		double[] intarray = new double[10];
		for(a=0;a<=i;a++)
		{
			intarray[a]=Double.parseDouble(str[a]); //parsing string to double ..
		}
		if(i==0){result2=intarray[0]; text1.setText(result2+"");}//if only numeric term is the input .. ;)
		else
		{
			result2=stackystack(intarray,operator);
		}
		
		result2=1/result2 ;
		text1.setText("Ans : "+result2+"");  //displaying result ..
		
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result =(int)result2;
		while(copy_result!=0)//calculating number of digits in result ..
		{
			copy_result = copy_result/10;
			count++ ;
			
		}
		
		
		expression="";
		expression=""+(int)result2; //writing the result to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
	    
		
		}
		else
		{
			text1.setText("Give numeric input first "); //if user directly enters operator without any numeric term ..	
		}
	}
} );
/*button[5].setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		if(expression.equals("")){text1.setText("Enter the expression ..");}
		
		else
		{
		//another check for invalid expression .. all my test cases help me improve my code .. :)
		if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
	     text1.setText("Invalid expression ..");
	     i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}

        else if(str[i].equals("")){text1.setText("Invalid expression .."); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
		i=0;
		o=1;
		r=0;
		str[0]="";
		operator[0]='+';
		result2=0;
		check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
		
		expression = "";
		expression_length=0;
		}
		else{
			
			//expression="("+expression; 
			//expression_length=0;
		if(check>=0){
	   // expression="("+expression+")"; 
		int a =0 ;
		double[] intarray = new double[10];
		
		
		
		//store string array values to integer array . string to integer parsing ..
		
		for(a=0;a<=i;a++)
		{
			intarray[a]=(double)Integer.parseInt(str[a]);
			
		}
		
		r=1;
		if(i==0){result2=intarray[0]; }//if only numeric term is the input .. ;)
		else
		{
		int counter1 = 0;
		//System.out.println(intarray.length);
		//pushoperand(intarray[0]);
		
		for(counter1=0;counter1<=i;counter1++)
		{
		
			//System.out.println(counter1);
			pushoperand(intarray[counter1]);
			
			
			if(counter1+1 <=intarray.length-1)
			{
				pushoperator(operator[counter1+1]);
				
			}
			
			if(stackpointer1>=0&&stackpointer2>=0)
			{
			
			if(stackpointer2==0)
			{
				continue;
			}
			else 
				{
				int prec1 = getprecedence(operatorstack[stackpointer2-1]);
				int prec2 = getprecedence(operatorstack[stackpointer2]);
				if(prec2>=prec1)
					{
				continue;
					}
				else 
				{
					double var1 = popoperand();
					double var2 = popoperand();
					char var3 = popoperator();
					char var4 = popoperator();
					calculate(var2,var1,var4);
					pushoperand(result1);
					pushoperator(var3);
					
				}
			}
			}
			
		}	
		//System.out.println(stackpointer1);
		
		//System.out.println(stackpointer2);
		
		for(int n =0;n<=stackpointer1;n++)
		{
			intarray[n]=operandstack[n];
			//System.out.println(intarray[n]);
		}
		
		for(int n =0;n<=stackpointer2;n++)
		{
			operator[n+1]=operatorstack[n];
			//System.out.println(operator[n+1]);
		}
		for(r=0;r<stackpointer1+1;r++)
		{
			
			
			if(r==0){ result2[r] = intarray[r] ; }//only one number is there ..
			
			  

			else if(operator[r]=='+'&&r>0)
			{
				result2[r]=result2[r-1] + intarray[r]; 
			}
			else if(operator[r]=='-'&&r>0)
			{
				result2[r]=result2[r-1] - intarray[r]; 
			}
			else if(operator[r]=='*'&&r>0)
			{
				result2[r]=result2[r-1] * intarray[r]; 
			}
			else if(operator[r]=='/'&&r>0)
			{
				result2[r]=result2[r-1] / intarray[r]; 
			}

			

		}

		}
	
		int i ;
		if(result2[r-1]==0)
		{text1.setText(1+"");  //displaying result2 ..}
		result2[r-1]=1;
	
		//convert result2 to string value ..
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result2 =(int)result2[r-1];
		while(copy_result2!=0)//calculating number of digits in result2 ..
		{
			copy_result2 = copy_result2/10;
			count++ ;
			
		}
		
		
		expression=""+(int)result2[r-1]; //writing the result2 to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result2 ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
		}
		
		if(result2[r-1]>0&&(result2[r-1]%2==0||result2[r-1]%2==1))
		{
	    int passvalue = (int)result2[r-1];
        double ans = factorial(passvalue);
	    result2[r-1]=ans ; 	
		text1.setText("Ans : "+ans+"");  //displaying result2 ..
		
		
		
		//convert result2 to string value ..
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result2 =(int)result2[r-1];
		while(copy_result2!=0)//calculating number of digits in result2 ..
		{
			copy_result2 = copy_result2/10;
			count++ ;
			
		}
		
		
		expression=""+(int)result2[r-1]; //writing the result2 to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result2 ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
		}
		}
		
		
		else
			text1.setText("Give numeric  input first.."); //if user directly enters operator without any numeric term ..
	
		}
		}
	}
} );*/
button17.setOnClickListener(new View.OnClickListener() {//=
	
	@Override
	public void onClick(View arg0) {
		EditText text1 = (EditText) findViewById(R.id.edittext1) ;
		
		if(expression.equals("")){text1.setText("Error");}
		else if(expression.substring(0,1).equals("+") ||expression.substring(0,1).equals("*")||expression.substring(0,1).equals("/")||expression.substring(0,1).equals("-"))
		{
			
			     text1.setText("Error");
			     i=0;
					o=1;
					r=0;
					str[0]="";
					operator[0]='+';
					result2=0;
					check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
					
					expression ="";
					expression_length=0;
				
		}
		 else if(str[i].equals(""))
		 { 	text1.setText("Error"); //check invalid expression .. user entered more no of operators than numeric terms .. lol ;P..
			i=0;
			o=1;
			r=0;
			str[0]="";
			operator[0]='+';
			result2=0;
			check=-1;//if user wanna make ur fool .. doesn'nt even enter a number ...
			
			expression = "";
			expression_length=0;
		}
		
		;
		if(check>=0){
	    
		int a =0 ;
		double[] intarray = new double[10];
		for(a=0;a<=i;a++)
		{
			intarray[a]=Double.parseDouble(str[a]); //parsing string to double ..
		}
		if(i==0){result2=intarray[0]; text1.setText(result2+"");}//if only numeric term is the input .. ;)
		else
		{
			result2=stackystack(intarray,operator);
		}
		text1.setText("Ans : "+result2+"");  //displaying result ..
		
		int count=0 ;
		//text1.setText(count+"");
		
		int copy_result =(int)result2;
		while(copy_result!=0)//calculating number of digits in result ..
		{
			copy_result = copy_result/10;
			count++ ;
			
		}
		
		
		expression="";//this is not the case ..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...a..
		expression=""+(int)result2; //writing the result to edit text ... or expression ?/ haha .... ;)
		expression_length=count; //set count to digits in result ..
		//count = 0 ;
		//text1.setText(count+"");
		i=0;
		str[i]=expression;
		loent[i]=count ;
		o=1;
	    
		
		}
		else
		{
			text1.setText("Error "); //if user directly enters operator without any numeric term ..	
		}
		
		
	}
} );



  button2.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		//delete..
		EditText text =(EditText) findViewById(R.id.edittext1);
		
		if(expression.equals("")){text.setText("Enter the expression ..");}
		else if(expression_length>=0)
		{
		//text.setText(expression.substring(expression_length-1,expression_length));
		
			
		if(expression_length==0)
			{
				expression="";
				text.setText(expression);
			}
		else if(expression_length==1)
			{
			     expression="";
			     text.setText(expression);
			}
			
			 
			
		else if(expression_length>1)
			{
				expression="" +  expression.substring(0,expression_length-1);
		        expression_length--;
			    text.setText(expression);
			    
			}
			
			
		}
		
		if(i>0&&str[i].equals(""))
		{
			o--;
		}
		
			if(i>0&&loent[i]==0)
		{
			str[i]="";
			i--;
			
		}
		
	
			else if(loent[i]>0&&loent[i]==1)
    {
		loent[i]--;
    	str[i]="";
    
    }
    else  if(loent[i]>1)
    {
    	loent[i]--;
  	    str[i]=str[i].substring(0,loent[i]);
    }
		
    
    
	}
	
});

  button[5].setOnClickListener(new View.OnClickListener() {
	//clear..
	@Override
	public void onClick(View arg0) {
	i=0;
	o=1;
	r=0;
	str[0]="";
	operator[0]='+';
	result2=0;
	check=-1;
	EditText text1 = (EditText) findViewById(R.id.edittext1) ;
	text1.setText("");
	expression = "";
	expression_length=0;
	
	}
});



	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		/* Creates the menu items */
		
		    menu.add(0, MENU_ABOUT, 0, "ABOUT");
		    
		

		/* Handles item selections */
		
		return true;
	}

	/* Handles item selections */
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    case MENU_ABOUT:
	        Intent about = new Intent(this,about.class);
	        startActivity(about);
	        
	        return true;
	    

	        
	    }
	    return false;
	}

	

public double factorial(int a)
{
if(a==0)
	return 1 ;
for(int i = a ;i>0;i--)
{
fact=fact*i ;
}
return fact ;
}


public double power(double num , int index)
{
int i ;
double result2 =1 ;
for(i=1;i<=index;i++)
{
result2 = result2*num ;

}
return result2 ;
}




public static int getprecedence( char op) //to get precendence value of an operator ..
{
	if(op=='+'||op=='-')
	return 1 ;
	if(op=='*'||op=='/')
		return 2 ;
	
	else 
		return 0 ;
}


public static void pushoperand(double a)//stack method
{   stackpointer1=stackpointer1+1;
    //System.out.println(stackpointer1);
	operandstack[stackpointer1]=a ;
	
}
public static double popoperand()//stackmethod
{
	pop = operandstack[stackpointer1];
	stackpointer1--;
	//System.out.println(stackpointer1);
	return pop;
}

public static void pushoperator(char op)//stack2method
{
	stackpointer2++;
	//System.out.println(stackpointer2);
	operatorstack[stackpointer2]=op ;
}
public static char popoperator()//stack2method
{
	pop1 = operatorstack[stackpointer2];
	stackpointer2--;
	return pop1;
}

public static double calculate(double a ,double b, char op)
{   
	 if(op=='+')
	{
		result1 = a+b ;
	}
	else if(op=='-')
	{
		result1 = a-b ;
	}
	

	else if(op=='*')
	{
		result1 = a*b ;
	}
	
	else if(op=='/')
	{
		result1 = a/b ;
	}
	
	return result1 ;
}

public static double stackystack(double[] array ,char[] array1)
{
	int counter1 = 0;
	//System.out.println(intarray.length);
	//pushoperand(intarray[0]);
	
	for(counter1=0;counter1<=i;counter1++)
	{
	
		//System.out.println(counter1);
		pushoperand(array[counter1]);
		
		
		if(counter1+1 <=i)
		{
			pushoperator(array1[counter1+1]);
			
		}
		
		if(stackpointer1>=0&&stackpointer2>=0)
		{
		
		if(stackpointer2==0)
		{
			continue;
		}
		else 
			{
			int prec1 = getprecedence(operatorstack[stackpointer2-1]);
			int prec2 = getprecedence(operatorstack[stackpointer2]);
			if(prec2>=prec1)
				{
			continue;
				}
			else 
			{
				double var1 = popoperand();
				double var2 = popoperand();
				char var3 = popoperator();
				char var4 = popoperator();
				result=calculate(var2,var1,var4);
				
				pushoperand(result);
				pushoperator(var3);
				
			}
		}
		}
		
		}
	//System.out.println(stackpointer1);
	//System.out.println(stackpointer2);
	
	double num1 = popoperand();
	result=num1 ;
	//System.out.println(num1);
	//System.out.println(operatorstack[1]);
	while(stackpointer1>=0&&stackpointer2>=0)
	{
		double num = popoperand();
		//System.out.println(num);
		
		char ope = popoperator();
		if(stackpointer2>=0)
		{
			check2 =operatorstack[stackpointer2];
			
		}
		
	
		if(check2=='-')
		{   
			result=calculate(-num,result,ope);
			
			operatorstack[stackpointer2]='+';//replacing + with - .. as already taken ..       +(-x)=-x ;;; :);)
			check2=' ';
		}
		else
		{
		result=calculate(num,result,ope);
		
		}
		
		
		
		
	}	

		return result ;
}


}

//at last its finished .. :)


