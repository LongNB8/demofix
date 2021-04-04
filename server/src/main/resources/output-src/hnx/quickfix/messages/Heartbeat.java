
package hnx.quickfix.messages;

import quickfix.FieldNotFound;


public class Heartbeat extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "0";
	

	public Heartbeat() {
		super();
		getHeader().setField(new hnx.quickfix.fields.MsgType(MSGTYPE));
	}
	
	public void set(hnx.quickfix.fields.TestReqID value) {
		setField(value);
	}

	public hnx.quickfix.fields.TestReqID get(hnx.quickfix.fields.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TestReqID getTestReqID() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TestReqID());
	}

	public boolean isSet(hnx.quickfix.fields.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
