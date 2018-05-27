package TGS_Run;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;

public class State_Process5 implements State{
	public String doAction(String msg) throws UnsupportedEncodingException, ParseException {
		String result="";
		
		result=TGS_process_5(msg);
		result="000110"+result;
		return result;
	}
	
	
public String TGS_process_5(String msg) throws UnsupportedEncodingException, ParseException {
		
		TGS_5nums_Proc Proc5=new TGS_5nums_Proc();
		
		String result=Proc5.process(msg);
		
		
		return result;
		
	}
}
