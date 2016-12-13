package com.crazyland.calculator;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	private TextView mPad;
	private String mNumber;
	private List<String> mListNumber; // list chua cac so
	private List<String> mListSign; //list chua cac dau bieu thuc
	private List<String> mListOfSign;
	private List<String> mListOfHighPrioritySign;
	private List<String> mListOfFirstSign;
	private List<String> mListOfHigherPrioritySign;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*
		 Thu tu uu tien
		 First > Higher > High
		 * */
		mListNumber = new ArrayList<String>();
		mListSign = new ArrayList<String>();
		mListOfSign = new ArrayList<String>();
		mListOfHighPrioritySign = new ArrayList<String>();
		mListOfHigherPrioritySign = new ArrayList<String>();
		mListOfFirstSign = new ArrayList<String>();
		
		mListOfSign.add("+");
		mListOfSign.add("-");
		mListOfSign.add("x");
		mListOfSign.add("/");
		mListOfSign.add("(");
		mListOfSign.add(")");
		mListOfSign.add("s");
		mListOfSign.add("c");
		mListOfSign.add("t");
		mListOfSign.add("g");
		mListOfSign.add("l");
		mListOfSign.add("p");
		mListOfSign.add("q");
		mListOfSign.add("^");
		mListOfSign.add("%");
		mListOfSign.add("!");
		//mListOfSign.add("+");
		
		mListOfHigherPrioritySign.add("^");
		mListOfHigherPrioritySign.add("!");
		
		mListOfFirstSign.add("s"); //sin
		mListOfFirstSign.add("c"); //cos
		mListOfFirstSign.add("t"); //tan
		mListOfFirstSign.add("g"); //cot
		mListOfFirstSign.add("l"); //log
		mListOfFirstSign.add("p"); //ln
		mListOfFirstSign.add("q"); //sqrt
		
		mListOfHighPrioritySign.add("x");
		mListOfHighPrioritySign.add("/");
		mListOfHighPrioritySign.add("%");
				
		mNumber = "";
		mNumber = "10+19/q(8)x3!-s(30%10)/c(20)+p(8^9)+l(10)";
		mPad = (TextView)findViewById(R.id.padshow);		
		mPad.setText(getPadText(mNumber));
		initButtons();
	}

	public void initButtons(){
		Button bt = (Button)findViewById(R.id.button0);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(0));
			}
		});
		
		bt = (Button)findViewById(R.id.button1);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(1));
			}
		});
		
		bt = (Button)findViewById(R.id.button2);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(2));
			}
		});
		
		bt = (Button)findViewById(R.id.button3);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(3));
			}
		});
		
		bt = (Button)findViewById(R.id.button4);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(4));
			}
		});
		
		bt = (Button)findViewById(R.id.button5);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(5));
			}
		});
		
		bt = (Button)findViewById(R.id.button6);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(6));
			}
		});
		
		bt = (Button)findViewById(R.id.button7);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(7));
			}
		});
		
		bt = (Button)findViewById(R.id.button8);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(8));
			}
		});
		
		bt = (Button)findViewById(R.id.button9);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(9));
			}
		});
		
		bt = (Button)findViewById(R.id.buttondot);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("."));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonplus);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("+"));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonminus);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("-"));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonmulti);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("x"));
			}
		});
		
		bt = (Button)findViewById(R.id.buttondivide);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("/"));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonopenbracket);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("("));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonclosebracket);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf(")"));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonsin);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("s("));
			}
		});
		
		bt = (Button)findViewById(R.id.buttoncos);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("c("));
			}
		});
		
		bt = (Button)findViewById(R.id.buttontan);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("t("));
			}
		});
		
		bt = (Button)findViewById(R.id.buttoncot);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("g("));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonsqrt);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("q("));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonlog);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("l("));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonln);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("p("));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonmod);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("%"));
			}
		});
		
		bt = (Button)findViewById(R.id.buttongiaithua);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("!"));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonmu);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setPadText(String.valueOf("^"));
			}
		});
		
		bt = (Button)findViewById(R.id.buttonclear);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mNumber = "";
				mListNumber.clear();
				mListSign.clear();
				setPadText("0");
			}
		});
		
		bt = (Button)findViewById(R.id.buttonbackspace);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(mNumber.length() > 0){
					mNumber = mNumber.substring(0, mNumber.length() - 1);
					mPad.setText(getPadText(mNumber));
				}
				
				if(mNumber.length() <= 0)
					setPadText(getPadText(mNumber));
			}
		});
		
		//result
		bt = (Button)findViewById(R.id.buttonresult);		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					filterString(mNumber);
				}catch(Exception e){
					gotError();
				}	
			}
		});
	}
	
	public void setPadText(String str){
		//xu ly truoc hop ban dau mac dinh co gia tri la 0
		/*if(mNumber.length() == 1 && mNumber.charAt(0) == '0'){
			mNumber = "";
		}*/
		if(mNumber.length() == 1 && mNumber.charAt(0) == '0'){
			if(str.equals("-")){
				mNumber = "0";
			}
			else
				mNumber = "";
		}
		
		
		mNumber += str;
		mPad.setText(getPadText(mNumber));
	}
	
	String getPadText(String input){
		/*
		 * sin: s
		 * cos: c
		 * tan: t
		 * cotang: g
		 * log: l
		 * ln: n
		 * sqrt: q
		 * mu: ^
		 * */
		
		String output = input;
		output = output.replaceAll("s", "sin");
		output = output.replaceAll("c", "cos");
		output = output.replaceAll("t", "tan"); 
		output = output.replaceAll("g", "cot");
		output = output.replaceAll("l", "log");
		output = output.replaceAll("q", "sqrt");
		output = output.replaceAll("p", "ln");
		
		return output;
	}
	
	//tach chuoi ra so va ki tu
	public void filterString(String str){
		
		String strNumbers = new String(str);
		String strCopy = new String(str);
		String test = "";
		int index = 0;
		
		while(strNumbers.length() > 0){
			
			for(int j = 0; j < mListOfSign.size(); j++){
				if(String.valueOf(strNumbers.charAt(index)).equals(mListOfSign.get(j))){						
					//mListSign.add(String.valueOf(strNumbers.charAt(index)));
					if(index>= 0 && index < strNumbers.length()){	
						
						String sign = String.valueOf(strNumbers.charAt(index));
						if(!sign.equals(""))
							mListSign.add(sign);	
						
						if(!(sign.equals("(") || sign.equals(""))){
							String num = strNumbers.substring(0, index);
							if(!num.equals(""))
								mListNumber.add(num);
						}					
						
						strNumbers = strNumbers.substring(index + 1);
						
						//xu ly giai thua vi dau giai thua nam sau so
						if(sign.equals("!")){
							String result = singleOperation(mListNumber.get(mListNumber.size() - 1), sign);
							mListNumber.set(mListNumber.size() - 1, result);
							mListSign.remove(mListSign.size() - 1);
						}
						
						if(sign.equals(")")){
							//xu ly trong dau ngoac							
							processBracket(mListSign.size() - 1);
						}											
						
						index = -1;
						
						break;
					}
				}
			}		
			
			index++;
			
			if(index >= strNumbers.length())
			{
				if(strNumbers.length() > 0){
					mListNumber.add(strNumbers);
				}				
				break;
			}				
		}
		
		mPad.setText("number: " + mListNumber + " sign: " + mListSign);
		
		String resultStr = countByNumberAndSign(mListNumber, mListSign);
		mListNumber.clear();
		mListSign.clear();
		mNumber = "0";
		
		//neu ket qua la so nguyen thi de 1 so
		//neu khong xu ly doan nay se ra so double VD: 5.0
		double result = Double.valueOf(resultStr);
		if(result % (int)result == 0){
			resultStr = String.valueOf((int)result);
		}
		
		mPad.setText(resultStr);
	}
	
	public void processBracket(int closeBracketIndex){

		boolean isFoundOpenBracket = false;		
		int openBracketIndex = closeBracketIndex;
		//tim kiem dau ngoac mo?
		for(int pos = closeBracketIndex; pos >= 0; pos--){			
			if(mListSign.get(pos).equals("(")){
				isFoundOpenBracket = true;			
				openBracketIndex = pos;
				//tong so phep toan dc thuc hien
				int totalOperation = closeBracketIndex - pos - 1; 
				
				List<String> numbers = new ArrayList<String>();
				List<String> signs = new ArrayList<String>();
				
				//nhung so so trong ngoac
				for(int i = totalOperation + 1; i > 0; i--){
					numbers.add(mListNumber.get(mListNumber.size() - i));
				}
				
				//lay cac phep tinh trong ngoac
				for(int i = pos + 1; i < closeBracketIndex; i++){
					signs.add(mListSign.get(i));
				}
				
				String result = countByNumberAndSign(numbers, signs);
				
				for(int ind = 0; ind < totalOperation; ind++){
					mListNumber.remove(mListNumber.size() - 1);
				}
				mListNumber.set(mListNumber.size() - 1, result);
				
				for(int ind = 0; ind <= totalOperation + 1; ind++){
					mListSign.remove(mListSign.size() - 1);
				}
				
				break;
			}		
		}

	
		if(!isFoundOpenBracket){
			gotError();
			return;
		}
	}

	public void gotError(){
		mPad.setText("ERROR");
	}
	
	String countByNumberAndSign(List<String> numbers, List<String> signs){
		//xu ly khi co gia tri am
		//VD: -30 + 5
		//luc nay so luong so = so phep tinh
		//truong hop khac coi nhu sai, chi ton phai 1 phep tinh
		//VD: --30+5 coi nhu la error
		
		//xu ly cac phep nhan truoc
		boolean isHighPriorityDone = false; //cac phep uu tien da dc thuc hien het chua
		boolean isHaveOperation = false;
		
		//tinh toan cac phep co do uu tin cao nhat
		while(signs.size() > 0){	
			isHaveOperation = false;
			
			//o day la cac phep mu~
			for(int i = 0; i < signs.size(); i++){
				for(int j = 0; j < mListOfFirstSign.size(); j++){
					if(signs.get(i).equals(mListOfFirstSign.get(j))){
						isHaveOperation = true;
						String result = singleOperation(numbers.get(i), signs.get(i));
						numbers.set(i, result);
						signs.remove(i);
						
						break;
					}
				}
				
				if(isHaveOperation)
					break;
			}
			
			if(!isHaveOperation)
				break;
		}	
		
		//tinh toan cac phep toan co do uu tien ke tiep
		//cac phep sin, cos, sqrt....
		while(signs.size() > 0){
			isHaveOperation = false;
			
			//o day la cac phep mu~
			for(int i = 0; i < signs.size(); i++){
				for(int j = 0; j < mListOfHigherPrioritySign.size(); j++){
					if(signs.get(i).equals(mListOfHigherPrioritySign.get(j))){
						isHaveOperation = true;
						if(signs.get(i).equals("^")){
							String result = singleOperation(numbers.get(i), signs.get(i), numbers.get(i + 1));
							numbers.set(i, result);
							numbers.remove(i + 1);
							signs.remove(i);
						}
						else{							
							String result = singleOperation(numbers.get(i), signs.get(i));
							signs.remove(i);
							numbers.set(i, result);
						}
						break;
					}
				}
				
				if(isHaveOperation)
					break;
			}
			
			if(!isHaveOperation)
				break;
		}
		
		//cac phep toan co do uu tien sau cung
		//cac phep cong tru nhan chia
		while(signs.size() > 0){	
			if(!isHighPriorityDone){
				isHighPriorityDone = true;
				
				for(int j = 0; j < signs.size(); j++){
					for(int k = 0; k < mListOfHighPrioritySign.size(); k++){
						if(signs.get(j).equals(mListOfHighPrioritySign.get(k))){
							isHighPriorityDone = false;
							break;
						}
					}
					
					if(!isHighPriorityDone)
						break;
				}
			}
			
			for(int i = 0; i < signs.size(); i++){
				if((signs.get(i).equals("+") || signs.get(i).equals("-")) 
						&& !isHighPriorityDone)
					continue;
				
				String a = numbers.get(i);
				String b = numbers.get(i + 1);					
				String result = singleOperation(a, signs.get(i), b);
				
				numbers.set(i, result);
				numbers.remove(i + 1);
				signs.remove(i);				
				break;
			}								
		}
		
		return numbers.get(0);
	}
	
	String singleOperation(String a, String sign, String b){
		
		if(sign.equals("+")){
			return String.valueOf(Double.valueOf(a) + Double.valueOf(b));
		}
		
		if(sign.equals("-")){
			return String.valueOf(Double.valueOf(a) - Double.valueOf(b));
		}
		
		if(sign.equals("x")){
			return String.valueOf(Double.valueOf(a) * Double.valueOf(b));
		}
		
		if(sign.equals("/")){
			return String.valueOf(Double.valueOf(a) / Double.valueOf(b));
		}
		
		if(sign.equals("^")){
			return String.valueOf(Math.pow(Double.valueOf(a), Double.valueOf(b)));
		}
		
		if(sign.equals("%")){
			return String.valueOf(Double.valueOf(a) % Double.valueOf(b));
		}
		
		return "";
	}
	
	String singleOperation(String a, String sign){
		if(sign.equals("s")){
			return String.valueOf(Math.sin(Double.valueOf(a)));
		}
		
		if(sign.equals("c")){
			return String.valueOf(Math.cos(Double.valueOf(a)));
		}
		
		if(sign.equals("t")){
			return String.valueOf(Math.tan(Double.valueOf(a)));
		}
		
		if(sign.equals("g")){
			return String.valueOf(1 / Math.tan(Double.valueOf(a)));
		}
		
		if(sign.equals("q")){
			return String.valueOf(Math.sqrt(Double.valueOf(a)));
		}
		
		if(sign.equals("l")){
			return String.valueOf(Math.log10(Double.valueOf(a)));
		}
		
		if(sign.equals("p")){
			return String.valueOf(Math.log(Double.valueOf(a)));
		}
		
		if(sign.equals("!")){
			int in = Integer.valueOf(a);
			long result = 1;
			
			for(int i = 1; i <= in; i++)
				result *= i;
			
			return String.valueOf(result);
		}
		
		return "";
	}
	
	//kiem tra xem chuoi co hop le de tinh toan khong
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
