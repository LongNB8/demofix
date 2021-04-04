
package hnx.quickfix.messages;

import quickfix.FieldNotFound;


public class TopPriceOddLot extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "PO";
	

	public TopPriceOddLot() {
		super();
		getHeader().setField(new hnx.quickfix.fields.MsgType(MSGTYPE));
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

	public void set(hnx.quickfix.fields.BoardCode value) {
		setField(value);
	}

	public hnx.quickfix.fields.BoardCode get(hnx.quickfix.fields.BoardCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BoardCode getBoardCode() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BoardCode());
	}

	public boolean isSet(hnx.quickfix.fields.BoardCode field) {
		return isSetField(field);
	}

	public boolean isSetBoardCode() {
		return isSetField(425);
	}

	public void set(hnx.quickfix.fields.BestBidPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.BestBidPrice get(hnx.quickfix.fields.BestBidPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BestBidPrice getBestBidPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BestBidPrice());
	}

	public boolean isSet(hnx.quickfix.fields.BestBidPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestBidPrice() {
		return isSetField(132);
	}

	public void set(hnx.quickfix.fields.BestBidQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.BestBidQtty get(hnx.quickfix.fields.BestBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BestBidQtty getBestBidQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BestBidQtty());
	}

	public boolean isSet(hnx.quickfix.fields.BestBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestBidQtty() {
		return isSetField(1321);
	}

	public void set(hnx.quickfix.fields.BestOfferPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.BestOfferPrice get(hnx.quickfix.fields.BestOfferPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BestOfferPrice getBestOfferPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BestOfferPrice());
	}

	public boolean isSet(hnx.quickfix.fields.BestOfferPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferPrice() {
		return isSetField(133);
	}

	public void set(hnx.quickfix.fields.BestOfferQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.BestOfferQtty get(hnx.quickfix.fields.BestOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BestOfferQtty getBestOfferQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BestOfferQtty());
	}

	public boolean isSet(hnx.quickfix.fields.BestOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferQtty() {
		return isSetField(1331);
	}

	public void set(hnx.quickfix.fields.TotalBidQtty_OD value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalBidQtty_OD get(hnx.quickfix.fields.TotalBidQtty_OD value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalBidQtty_OD getTotalBidQtty_OD() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalBidQtty_OD());
	}

	public boolean isSet(hnx.quickfix.fields.TotalBidQtty_OD field) {
		return isSetField(field);
	}

	public boolean isSetTotalBidQtty_OD() {
		return isSetField(1341);
	}

	public void set(hnx.quickfix.fields.TotalOfferQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalOfferQtty get(hnx.quickfix.fields.TotalOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalOfferQtty getTotalOfferQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalOfferQtty());
	}

	public boolean isSet(hnx.quickfix.fields.TotalOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty() {
		return isSetField(135);
	}

	public void set(hnx.quickfix.fields.TotalOfferQtty_OD value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalOfferQtty_OD get(hnx.quickfix.fields.TotalOfferQtty_OD value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalOfferQtty_OD getTotalOfferQtty_OD() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalOfferQtty_OD());
	}

	public boolean isSet(hnx.quickfix.fields.TotalOfferQtty_OD field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty_OD() {
		return isSetField(1351);
	}

	public void set(hnx.quickfix.fields.OfferPrice_2 value) {
		setField(value);
	}

	public hnx.quickfix.fields.OfferPrice_2 get(hnx.quickfix.fields.OfferPrice_2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.OfferPrice_2 getOfferPrice_2() throws FieldNotFound {
		return get(new hnx.quickfix.fields.OfferPrice_2());
	}

	public boolean isSet(hnx.quickfix.fields.OfferPrice_2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferPrice_2() {
		return isSetField(136);
	}

	public void set(hnx.quickfix.fields.OfferQtty_2 value) {
		setField(value);
	}

	public hnx.quickfix.fields.OfferQtty_2 get(hnx.quickfix.fields.OfferQtty_2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.OfferQtty_2 getOfferQtty_2() throws FieldNotFound {
		return get(new hnx.quickfix.fields.OfferQtty_2());
	}

	public boolean isSet(hnx.quickfix.fields.OfferQtty_2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferQtty_2() {
		return isSetField(1361);
	}

	public void set(hnx.quickfix.fields.OpenPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.OpenPrice get(hnx.quickfix.fields.OpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.OpenPrice getOpenPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.OpenPrice());
	}

	public boolean isSet(hnx.quickfix.fields.OpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetOpenPrice() {
		return isSetField(137);
	}

	public void set(hnx.quickfix.fields.OfferQtty_3 value) {
		setField(value);
	}

	public hnx.quickfix.fields.OfferQtty_3 get(hnx.quickfix.fields.OfferQtty_3 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.OfferQtty_3 getOfferQtty_3() throws FieldNotFound {
		return get(new hnx.quickfix.fields.OfferQtty_3());
	}

	public boolean isSet(hnx.quickfix.fields.OfferQtty_3 field) {
		return isSetField(field);
	}

	public boolean isSetOfferQtty_3() {
		return isSetField(1371);
	}

}
