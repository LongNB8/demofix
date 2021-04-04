
package hnx.quickfix.messages;

import quickfix.FieldNotFound;


public class Stock extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "S";
	

	public Stock() {
		super();
		getHeader().setField(new hnx.quickfix.fields.MsgType(MSGTYPE));
	}
	
	public void set(hnx.quickfix.fields.IDIndex value) {
		setField(value);
	}

	public hnx.quickfix.fields.IDIndex get(hnx.quickfix.fields.IDIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.IDIndex getIDIndex() throws FieldNotFound {
		return get(new hnx.quickfix.fields.IDIndex());
	}

	public boolean isSet(hnx.quickfix.fields.IDIndex field) {
		return isSetField(field);
	}

	public boolean isSetIDIndex() {
		return isSetField(1);
	}

	public void set(hnx.quickfix.fields.IndexCode value) {
		setField(value);
	}

	public hnx.quickfix.fields.IndexCode get(hnx.quickfix.fields.IndexCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.IndexCode getIndexCode() throws FieldNotFound {
		return get(new hnx.quickfix.fields.IndexCode());
	}

	public boolean isSet(hnx.quickfix.fields.IndexCode field) {
		return isSetField(field);
	}

	public boolean isSetIndexCode() {
		return isSetField(2);
	}

	public void set(hnx.quickfix.fields.IDSymbol value) {
		setField(value);
	}

	public hnx.quickfix.fields.IDSymbol get(hnx.quickfix.fields.IDSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.IDSymbol getIDSymbol() throws FieldNotFound {
		return get(new hnx.quickfix.fields.IDSymbol());
	}

	public boolean isSet(hnx.quickfix.fields.IDSymbol field) {
		return isSetField(field);
	}

	public boolean isSetIDSymbol() {
		return isSetField(15);
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

	public void set(hnx.quickfix.fields.TotalQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalQtty get(hnx.quickfix.fields.TotalQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalQtty getTotalQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalQtty());
	}

	public boolean isSet(hnx.quickfix.fields.TotalQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalQtty() {
		return isSetField(7);
	}

	public void set(hnx.quickfix.fields.Weighted value) {
		setField(value);
	}

	public hnx.quickfix.fields.Weighted get(hnx.quickfix.fields.Weighted value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Weighted getWeighted() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Weighted());
	}

	public boolean isSet(hnx.quickfix.fields.Weighted field) {
		return isSetField(field);
	}

	public boolean isSetWeighted() {
		return isSetField(12);
	}

	public void set(hnx.quickfix.fields.AddDate value) {
		setField(value);
	}

	public hnx.quickfix.fields.AddDate get(hnx.quickfix.fields.AddDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.AddDate getAddDate() throws FieldNotFound {
		return get(new hnx.quickfix.fields.AddDate());
	}

	public boolean isSet(hnx.quickfix.fields.AddDate field) {
		return isSetField(field);
	}

	public boolean isSetAddDate() {
		return isSetField(28);
	}

}
