
package hnx.quickfix.messages;

import quickfix.FieldNotFound;


public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new hnx.quickfix.fields.MsgType(MSGTYPE));
	}
	
	public Logon(hnx.quickfix.fields.Status status) {
		this();
		setField(status);
	}
	
	public void set(hnx.quickfix.fields.Username value) {
		setField(value);
	}

	public hnx.quickfix.fields.Username get(hnx.quickfix.fields.Username value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Username getUsername() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Username());
	}

	public boolean isSet(hnx.quickfix.fields.Username field) {
		return isSetField(field);
	}

	public boolean isSetUsername() {
		return isSetField(553);
	}

	public void set(hnx.quickfix.fields.Password value) {
		setField(value);
	}

	public hnx.quickfix.fields.Password get(hnx.quickfix.fields.Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Password getPassword() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Password());
	}

	public boolean isSet(hnx.quickfix.fields.Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(554);
	}

	public void set(hnx.quickfix.fields.Status value) {
		setField(value);
	}

	public hnx.quickfix.fields.Status get(hnx.quickfix.fields.Status value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Status getStatus() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Status());
	}

	public boolean isSet(hnx.quickfix.fields.Status field) {
		return isSetField(field);
	}

	public boolean isSetStatus() {
		return isSetField(552);
	}

}
