
package hnx.quickfix.messages;

import quickfix.FieldNotFound;


public class Index extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "I";
	

	public Index() {
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

	public void set(hnx.quickfix.fields.Value value) {
		setField(value);
	}

	public hnx.quickfix.fields.Value get(hnx.quickfix.fields.Value value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Value getValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Value());
	}

	public boolean isSet(hnx.quickfix.fields.Value field) {
		return isSetField(field);
	}

	public boolean isSetValue() {
		return isSetField(3);
	}

	public void set(hnx.quickfix.fields.CalTime value) {
		setField(value);
	}

	public hnx.quickfix.fields.CalTime get(hnx.quickfix.fields.CalTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CalTime getCalTime() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CalTime());
	}

	public boolean isSet(hnx.quickfix.fields.CalTime field) {
		return isSetField(field);
	}

	public boolean isSetCalTime() {
		return isSetField(4);
	}

	public void set(hnx.quickfix.fields.Change value) {
		setField(value);
	}

	public hnx.quickfix.fields.Change get(hnx.quickfix.fields.Change value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Change getChange() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Change());
	}

	public boolean isSet(hnx.quickfix.fields.Change field) {
		return isSetField(field);
	}

	public boolean isSetChange() {
		return isSetField(5);
	}

	public void set(hnx.quickfix.fields.RatioChange value) {
		setField(value);
	}

	public hnx.quickfix.fields.RatioChange get(hnx.quickfix.fields.RatioChange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.RatioChange getRatioChange() throws FieldNotFound {
		return get(new hnx.quickfix.fields.RatioChange());
	}

	public boolean isSet(hnx.quickfix.fields.RatioChange field) {
		return isSetField(field);
	}

	public boolean isSetRatioChange() {
		return isSetField(6);
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

	public void set(hnx.quickfix.fields.TotalValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalValue get(hnx.quickfix.fields.TotalValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalValue getTotalValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalValue());
	}

	public boolean isSet(hnx.quickfix.fields.TotalValue field) {
		return isSetField(field);
	}

	public boolean isSetTotalValue() {
		return isSetField(14);
	}

	public void set(hnx.quickfix.fields.TradingDate value) {
		setField(value);
	}

	public hnx.quickfix.fields.TradingDate get(hnx.quickfix.fields.TradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TradingDate getTradingDate() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TradingDate());
	}

	public boolean isSet(hnx.quickfix.fields.TradingDate field) {
		return isSetField(field);
	}

	public boolean isSetTradingDate() {
		return isSetField(388);
	}

	public void set(hnx.quickfix.fields.CurrentStatus value) {
		setField(value);
	}

	public hnx.quickfix.fields.CurrentStatus get(hnx.quickfix.fields.CurrentStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CurrentStatus getCurrentStatus() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CurrentStatus());
	}

	public boolean isSet(hnx.quickfix.fields.CurrentStatus field) {
		return isSetField(field);
	}

	public boolean isSetCurrentStatus() {
		return isSetField(21);
	}

	public void set(hnx.quickfix.fields.TotalStock value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalStock get(hnx.quickfix.fields.TotalStock value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalStock getTotalStock() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalStock());
	}

	public boolean isSet(hnx.quickfix.fields.TotalStock field) {
		return isSetField(field);
	}

	public boolean isSetTotalStock() {
		return isSetField(22);
	}

	public void set(hnx.quickfix.fields.PriorIndexVal value) {
		setField(value);
	}

	public hnx.quickfix.fields.PriorIndexVal get(hnx.quickfix.fields.PriorIndexVal value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PriorIndexVal getPriorIndexVal() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PriorIndexVal());
	}

	public boolean isSet(hnx.quickfix.fields.PriorIndexVal field) {
		return isSetField(field);
	}

	public boolean isSetPriorIndexVal() {
		return isSetField(23);
	}

	public void set(hnx.quickfix.fields.HighestIndex value) {
		setField(value);
	}

	public hnx.quickfix.fields.HighestIndex get(hnx.quickfix.fields.HighestIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.HighestIndex getHighestIndex() throws FieldNotFound {
		return get(new hnx.quickfix.fields.HighestIndex());
	}

	public boolean isSet(hnx.quickfix.fields.HighestIndex field) {
		return isSetField(field);
	}

	public boolean isSetHighestIndex() {
		return isSetField(24);
	}

	public void set(hnx.quickfix.fields.LowestIndex value) {
		setField(value);
	}

	public hnx.quickfix.fields.LowestIndex get(hnx.quickfix.fields.LowestIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.LowestIndex getLowestIndex() throws FieldNotFound {
		return get(new hnx.quickfix.fields.LowestIndex());
	}

	public boolean isSet(hnx.quickfix.fields.LowestIndex field) {
		return isSetField(field);
	}

	public boolean isSetLowestIndex() {
		return isSetField(25);
	}

	public void set(hnx.quickfix.fields.CloseIndex value) {
		setField(value);
	}

	public hnx.quickfix.fields.CloseIndex get(hnx.quickfix.fields.CloseIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CloseIndex getCloseIndex() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CloseIndex());
	}

	public boolean isSet(hnx.quickfix.fields.CloseIndex field) {
		return isSetField(field);
	}

	public boolean isSetCloseIndex() {
		return isSetField(26);
	}

	public void set(hnx.quickfix.fields.TypeIndex value) {
		setField(value);
	}

	public hnx.quickfix.fields.TypeIndex get(hnx.quickfix.fields.TypeIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TypeIndex getTypeIndex() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TypeIndex());
	}

	public boolean isSet(hnx.quickfix.fields.TypeIndex field) {
		return isSetField(field);
	}

	public boolean isSetTypeIndex() {
		return isSetField(27);
	}

	public void set(hnx.quickfix.fields.IndexName value) {
		setField(value);
	}

	public hnx.quickfix.fields.IndexName get(hnx.quickfix.fields.IndexName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.IndexName getIndexName() throws FieldNotFound {
		return get(new hnx.quickfix.fields.IndexName());
	}

	public boolean isSet(hnx.quickfix.fields.IndexName field) {
		return isSetField(field);
	}

	public boolean isSetIndexName() {
		return isSetField(18);
	}

}
