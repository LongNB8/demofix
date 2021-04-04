
package hnx.quickfix.messages;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TopNPrice extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "TP";
	

	public TopNPrice() {
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

	public void set(hnx.quickfix.fields.NoTopPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.NoTopPrice get(hnx.quickfix.fields.NoTopPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.NoTopPrice getNoTopPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.NoTopPrice());
	}

	public boolean isSet(hnx.quickfix.fields.NoTopPrice field) {
		return isSetField(field);
	}

	public boolean isSetNoTopPrice() {
		return isSetField(555);
	}

	public static class NoTopPrice extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {556, 132, 1321, 133, 1331, 0};

		public NoTopPrice() {
			super(555, 556, ORDER);
		}
		
	public void set(hnx.quickfix.fields.NumTopPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.NumTopPrice get(hnx.quickfix.fields.NumTopPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.NumTopPrice getNumTopPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.NumTopPrice());
	}

	public boolean isSet(hnx.quickfix.fields.NumTopPrice field) {
		return isSetField(field);
	}

	public boolean isSetNumTopPrice() {
		return isSetField(556);
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

	}

}
