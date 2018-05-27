package TGS_Run;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;

public interface State {
	public String doAction(String msg) throws UnsupportedEncodingException, ParseException;
}
