
package hnx.quickfix.messages;

import quickfix.FieldNotFound;


public class AutionMatch extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "EP";
	

	public AutionMatch() {
		super();
		getHeader().setField(new hnx.quickfix.fields.MsgType(MSGTYPE));
	}
	
	public void set(hnx.quickfix.fields.ActionType value) {
		setField(value);
	}

	public hnx.quickfix.fields.ActionType get(hnx.quickfix.fields.ActionType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.ActionType getActionType() throws FieldNotFound {
		return get(new hnx.quickfix.fields.ActionType());
	}

	public boolean isSet(hnx.quickfix.fields.ActionType field) {
		return isSetField(field);
	}

	public boolean isSetActionType() {
		return isSetField(33);
	}

	public void set(hnx.quickfix.fields.Symbol value) {
		setField(value);
	}

	public hnx.quickfix.fields.Symbol get(hnx.quickfix.fields.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Symbol getSymbol() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Symbol());
	}

	public boolean isSet(hnx.quickfix.fields.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(hnx.quickfix.fields.MatchPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.MatchPrice get(hnx.quickfix.fields.MatchPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.MatchPrice getMatchPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.MatchPrice());
	}

	public boolean isSet(hnx.quickfix.fields.MatchPrice field) {
		return isSetField(field);
	}

	public boolean isSetMatchPrice() {
		return isSetField(31);
	}

	public void set(hnx.quickfix.fields.MatchQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.MatchQtty get(hnx.quickfix.fields.MatchQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.MatchQtty getMatchQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.MatchQtty());
	}

	public boolean isSet(hnx.quickfix.fields.MatchQtty field) {
		return isSetField(field);
	}

	public boolean isSetMatchQtty() {
		return isSetField(32);
	}

}
