
package hnx.quickfix.messages;

import quickfix.FieldNotFound;


public class BoardInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BI";
	

	public BoardInfo() {
		super();
		getHeader().setField(new hnx.quickfix.fields.MsgType(MSGTYPE));
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

	public void set(hnx.quickfix.fields.BoardStatus value) {
		setField(value);
	}

	public hnx.quickfix.fields.BoardStatus get(hnx.quickfix.fields.BoardStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BoardStatus getBoardStatus() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BoardStatus());
	}

	public boolean isSet(hnx.quickfix.fields.BoardStatus field) {
		return isSetField(field);
	}

	public boolean isSetBoardStatus() {
		return isSetField(426);
	}

	public void set(hnx.quickfix.fields.TradingSessionID value) {
		setField(value);
	}

	public hnx.quickfix.fields.TradingSessionID get(hnx.quickfix.fields.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TradingSessionID());
	}

	public boolean isSet(hnx.quickfix.fields.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(hnx.quickfix.fields.TradSecStatus value) {
		setField(value);
	}

	public hnx.quickfix.fields.TradSecStatus get(hnx.quickfix.fields.TradSecStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TradSecStatus getTradSecStatus() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TradSecStatus());
	}

	public boolean isSet(hnx.quickfix.fields.TradSecStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSecStatus() {
		return isSetField(340);
	}

	public void set(hnx.quickfix.fields.Name value) {
		setField(value);
	}

	public hnx.quickfix.fields.Name get(hnx.quickfix.fields.Name value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Name getName() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Name());
	}

	public boolean isSet(hnx.quickfix.fields.Name field) {
		return isSetField(field);
	}

	public boolean isSetName() {
		return isSetField(421);
	}

	public void set(hnx.quickfix.fields.Shortname value) {
		setField(value);
	}

	public hnx.quickfix.fields.Shortname get(hnx.quickfix.fields.Shortname value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Shortname getShortname() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Shortname());
	}

	public boolean isSet(hnx.quickfix.fields.Shortname field) {
		return isSetField(field);
	}

	public boolean isSetShortname() {
		return isSetField(422);
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

	public void set(hnx.quickfix.fields.Time value) {
		setField(value);
	}

	public hnx.quickfix.fields.Time get(hnx.quickfix.fields.Time value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Time getTime() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Time());
	}

	public boolean isSet(hnx.quickfix.fields.Time field) {
		return isSetField(field);
	}

	public boolean isSetTime() {
		return isSetField(399);
	}

	public void set(hnx.quickfix.fields.TotalTrade value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalTrade get(hnx.quickfix.fields.TotalTrade value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalTrade getTotalTrade() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalTrade());
	}

	public boolean isSet(hnx.quickfix.fields.TotalTrade field) {
		return isSetField(field);
	}

	public boolean isSetTotalTrade() {
		return isSetField(270);
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

	public void set(hnx.quickfix.fields.numSymbolAdvances value) {
		setField(value);
	}

	public hnx.quickfix.fields.numSymbolAdvances get(hnx.quickfix.fields.numSymbolAdvances value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.numSymbolAdvances getnumSymbolAdvances() throws FieldNotFound {
		return get(new hnx.quickfix.fields.numSymbolAdvances());
	}

	public boolean isSet(hnx.quickfix.fields.numSymbolAdvances field) {
		return isSetField(field);
	}

	public boolean isSetnumSymbolAdvances() {
		return isSetField(251);
	}

	public void set(hnx.quickfix.fields.numSymbolNochange value) {
		setField(value);
	}

	public hnx.quickfix.fields.numSymbolNochange get(hnx.quickfix.fields.numSymbolNochange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.numSymbolNochange getnumSymbolNochange() throws FieldNotFound {
		return get(new hnx.quickfix.fields.numSymbolNochange());
	}

	public boolean isSet(hnx.quickfix.fields.numSymbolNochange field) {
		return isSetField(field);
	}

	public boolean isSetnumSymbolNochange() {
		return isSetField(252);
	}

	public void set(hnx.quickfix.fields.numSymbolDeclines value) {
		setField(value);
	}

	public hnx.quickfix.fields.numSymbolDeclines get(hnx.quickfix.fields.numSymbolDeclines value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.numSymbolDeclines getnumSymbolDeclines() throws FieldNotFound {
		return get(new hnx.quickfix.fields.numSymbolDeclines());
	}

	public boolean isSet(hnx.quickfix.fields.numSymbolDeclines field) {
		return isSetField(field);
	}

	public boolean isSetnumSymbolDeclines() {
		return isSetField(253);
	}

	public void set(hnx.quickfix.fields.DateNo value) {
		setField(value);
	}

	public hnx.quickfix.fields.DateNo get(hnx.quickfix.fields.DateNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.DateNo getDateNo() throws FieldNotFound {
		return get(new hnx.quickfix.fields.DateNo());
	}

	public boolean isSet(hnx.quickfix.fields.DateNo field) {
		return isSetField(field);
	}

	public boolean isSetDateNo() {
		return isSetField(17);
	}

	public void set(hnx.quickfix.fields.totalNormalTradedQttyRd value) {
		setField(value);
	}

	public hnx.quickfix.fields.totalNormalTradedQttyRd get(hnx.quickfix.fields.totalNormalTradedQttyRd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.totalNormalTradedQttyRd gettotalNormalTradedQttyRd() throws FieldNotFound {
		return get(new hnx.quickfix.fields.totalNormalTradedQttyRd());
	}

	public boolean isSet(hnx.quickfix.fields.totalNormalTradedQttyRd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedQttyRd() {
		return isSetField(220);
	}

	public void set(hnx.quickfix.fields.totalNormalTradedValueRd value) {
		setField(value);
	}

	public hnx.quickfix.fields.totalNormalTradedValueRd get(hnx.quickfix.fields.totalNormalTradedValueRd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.totalNormalTradedValueRd gettotalNormalTradedValueRd() throws FieldNotFound {
		return get(new hnx.quickfix.fields.totalNormalTradedValueRd());
	}

	public boolean isSet(hnx.quickfix.fields.totalNormalTradedValueRd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedValueRd() {
		return isSetField(221);
	}

	public void set(hnx.quickfix.fields.totalNormalTradedQttyOd value) {
		setField(value);
	}

	public hnx.quickfix.fields.totalNormalTradedQttyOd get(hnx.quickfix.fields.totalNormalTradedQttyOd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.totalNormalTradedQttyOd gettotalNormalTradedQttyOd() throws FieldNotFound {
		return get(new hnx.quickfix.fields.totalNormalTradedQttyOd());
	}

	public boolean isSet(hnx.quickfix.fields.totalNormalTradedQttyOd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedQttyOd() {
		return isSetField(210);
	}

	public void set(hnx.quickfix.fields.totalNormalTradedValueOd value) {
		setField(value);
	}

	public hnx.quickfix.fields.totalNormalTradedValueOd get(hnx.quickfix.fields.totalNormalTradedValueOd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.totalNormalTradedValueOd gettotalNormalTradedValueOd() throws FieldNotFound {
		return get(new hnx.quickfix.fields.totalNormalTradedValueOd());
	}

	public boolean isSet(hnx.quickfix.fields.totalNormalTradedValueOd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedValueOd() {
		return isSetField(211);
	}

	public void set(hnx.quickfix.fields.totalPTTradedQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.totalPTTradedQtty get(hnx.quickfix.fields.totalPTTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.totalPTTradedQtty gettotalPTTradedQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.totalPTTradedQtty());
	}

	public boolean isSet(hnx.quickfix.fields.totalPTTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSettotalPTTradedQtty() {
		return isSetField(240);
	}

	public void set(hnx.quickfix.fields.totalPTTradedValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.totalPTTradedValue get(hnx.quickfix.fields.totalPTTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.totalPTTradedValue gettotalPTTradedValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.totalPTTradedValue());
	}

	public boolean isSet(hnx.quickfix.fields.totalPTTradedValue field) {
		return isSetField(field);
	}

	public boolean isSettotalPTTradedValue() {
		return isSetField(241);
	}

	public void set(hnx.quickfix.fields.MarketCode value) {
		setField(value);
	}

	public hnx.quickfix.fields.MarketCode get(hnx.quickfix.fields.MarketCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.MarketCode getMarketCode() throws FieldNotFound {
		return get(new hnx.quickfix.fields.MarketCode());
	}

	public boolean isSet(hnx.quickfix.fields.MarketCode field) {
		return isSetField(field);
	}

	public boolean isSetMarketCode() {
		return isSetField(341);
	}

}
