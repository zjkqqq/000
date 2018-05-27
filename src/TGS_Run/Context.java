package TGS_Run;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;

public class Context implements State{
	private State state;
	
	public void setState(State sta) {
		this.state=sta;
	}
	
	public State getState() {
		return this.state;
	}
	
	public String doAction(String msg) throws UnsupportedEncodingException, ParseException {
		return this.state.doAction(msg);
	}
}
