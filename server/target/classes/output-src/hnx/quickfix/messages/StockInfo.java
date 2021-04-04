
package hnx.quickfix.messages;

import quickfix.FieldNotFound;


public class StockInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "SI";
	

	public StockInfo() {
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

	public void set(hnx.quickfix.fields.SymbolID value) {
		setField(value);
	}

	public hnx.quickfix.fields.SymbolID get(hnx.quickfix.fields.SymbolID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SymbolID getSymbolID() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SymbolID());
	}

	public boolean isSet(hnx.quickfix.fields.SymbolID field) {
		return isSetField(field);
	}

	public boolean isSetSymbolID() {
		return isSetField(15);
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

	public void set(hnx.quickfix.fields.TradSesStatus value) {
		setField(value);
	}

	public hnx.quickfix.fields.TradSesStatus get(hnx.quickfix.fields.TradSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TradSesStatus getTradSesStatus() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TradSesStatus());
	}

	public boolean isSet(hnx.quickfix.fields.TradSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatus() {
		return isSetField();
	}

	public void set(hnx.quickfix.fields.SecurityTradingStatus value) {
		setField(value);
	}

	public hnx.quickfix.fields.SecurityTradingStatus get(hnx.quickfix.fields.SecurityTradingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SecurityTradingStatus getSecurityTradingStatus() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SecurityTradingStatus());
	}

	public boolean isSet(hnx.quickfix.fields.SecurityTradingStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityTradingStatus() {
		return isSetField(326);
	}

	public void set(hnx.quickfix.fields.ListingStatus value) {
		setField(value);
	}

	public hnx.quickfix.fields.ListingStatus get(hnx.quickfix.fields.ListingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.ListingStatus getListingStatus() throws FieldNotFound {
		return get(new hnx.quickfix.fields.ListingStatus());
	}

	public boolean isSet(hnx.quickfix.fields.ListingStatus field) {
		return isSetField(field);
	}

	public boolean isSetListingStatus() {
		return isSetField(327);
	}

	public void set(hnx.quickfix.fields.SecurityType value) {
		setField(value);
	}

	public hnx.quickfix.fields.SecurityType get(hnx.quickfix.fields.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SecurityType getSecurityType() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SecurityType());
	}

	public boolean isSet(hnx.quickfix.fields.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(hnx.quickfix.fields.IssueDate value) {
		setField(value);
	}

	public hnx.quickfix.fields.IssueDate get(hnx.quickfix.fields.IssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.IssueDate getIssueDate() throws FieldNotFound {
		return get(new hnx.quickfix.fields.IssueDate());
	}

	public boolean isSet(hnx.quickfix.fields.IssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIssueDate() {
		return isSetField(225);
	}

	public void set(hnx.quickfix.fields.Issuer value) {
		setField(value);
	}

	public hnx.quickfix.fields.Issuer get(hnx.quickfix.fields.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Issuer getIssuer() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Issuer());
	}

	public boolean isSet(hnx.quickfix.fields.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(hnx.quickfix.fields.SecurityDesc value) {
		setField(value);
	}

	public hnx.quickfix.fields.SecurityDesc get(hnx.quickfix.fields.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SecurityDesc());
	}

	public boolean isSet(hnx.quickfix.fields.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
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

	public void set(hnx.quickfix.fields.TotalBidQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalBidQtty get(hnx.quickfix.fields.TotalBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalBidQtty getTotalBidQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalBidQtty());
	}

	public boolean isSet(hnx.quickfix.fields.TotalBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalBidQtty() {
		return isSetField(134);
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

	public void set(hnx.quickfix.fields.BasicPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.BasicPrice get(hnx.quickfix.fields.BasicPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BasicPrice getBasicPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BasicPrice());
	}

	public boolean isSet(hnx.quickfix.fields.BasicPrice field) {
		return isSetField(field);
	}

	public boolean isSetBasicPrice() {
		return isSetField(260);
	}

	public void set(hnx.quickfix.fields.FloorPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.FloorPrice get(hnx.quickfix.fields.FloorPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.FloorPrice getFloorPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.FloorPrice());
	}

	public boolean isSet(hnx.quickfix.fields.FloorPrice field) {
		return isSetField(field);
	}

	public boolean isSetFloorPrice() {
		return isSetField(333);
	}

	public void set(hnx.quickfix.fields.CeilingPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.CeilingPrice get(hnx.quickfix.fields.CeilingPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CeilingPrice getCeilingPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CeilingPrice());
	}

	public boolean isSet(hnx.quickfix.fields.CeilingPrice field) {
		return isSetField(field);
	}

	public boolean isSetCeilingPrice() {
		return isSetField(332);
	}

	public void set(hnx.quickfix.fields.FloorPricePT value) {
		setField(value);
	}

	public hnx.quickfix.fields.FloorPricePT get(hnx.quickfix.fields.FloorPricePT value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.FloorPricePT getFloorPricePT() throws FieldNotFound {
		return get(new hnx.quickfix.fields.FloorPricePT());
	}

	public boolean isSet(hnx.quickfix.fields.FloorPricePT field) {
		return isSetField(field);
	}

	public boolean isSetFloorPricePT() {
		return isSetField(3331);
	}

	public void set(hnx.quickfix.fields.CeilingPricePT value) {
		setField(value);
	}

	public hnx.quickfix.fields.CeilingPricePT get(hnx.quickfix.fields.CeilingPricePT value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CeilingPricePT getCeilingPricePT() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CeilingPricePT());
	}

	public boolean isSet(hnx.quickfix.fields.CeilingPricePT field) {
		return isSetField(field);
	}

	public boolean isSetCeilingPricePT() {
		return isSetField(3321);
	}

	public void set(hnx.quickfix.fields.Parvalue value) {
		setField(value);
	}

	public hnx.quickfix.fields.Parvalue get(hnx.quickfix.fields.Parvalue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Parvalue getParvalue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Parvalue());
	}

	public boolean isSet(hnx.quickfix.fields.Parvalue field) {
		return isSetField(field);
	}

	public boolean isSetParvalue() {
		return isSetField(334);
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

	public void set(hnx.quickfix.fields.PriorOpenPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.PriorOpenPrice get(hnx.quickfix.fields.PriorOpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PriorOpenPrice getPriorOpenPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PriorOpenPrice());
	}

	public boolean isSet(hnx.quickfix.fields.PriorOpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetPriorOpenPrice() {
		return isSetField(138);
	}

	public void set(hnx.quickfix.fields.ClosePrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.ClosePrice get(hnx.quickfix.fields.ClosePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.ClosePrice getClosePrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.ClosePrice());
	}

	public boolean isSet(hnx.quickfix.fields.ClosePrice field) {
		return isSetField(field);
	}

	public boolean isSetClosePrice() {
		return isSetField(139);
	}

	public void set(hnx.quickfix.fields.PriorClosePrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.PriorClosePrice get(hnx.quickfix.fields.PriorClosePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PriorClosePrice getPriorClosePrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PriorClosePrice());
	}

	public boolean isSet(hnx.quickfix.fields.PriorClosePrice field) {
		return isSetField(field);
	}

	public boolean isSetPriorClosePrice() {
		return isSetField(140);
	}

	public void set(hnx.quickfix.fields.TotalVolumeTraded value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalVolumeTraded get(hnx.quickfix.fields.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalVolumeTraded());
	}

	public boolean isSet(hnx.quickfix.fields.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
	}

	public void set(hnx.quickfix.fields.TotalValueTraded value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalValueTraded get(hnx.quickfix.fields.TotalValueTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalValueTraded getTotalValueTraded() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalValueTraded());
	}

	public boolean isSet(hnx.quickfix.fields.TotalValueTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalValueTraded() {
		return isSetField(3871);
	}

	public void set(hnx.quickfix.fields.MidPx value) {
		setField(value);
	}

	public hnx.quickfix.fields.MidPx get(hnx.quickfix.fields.MidPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.MidPx getMidPx() throws FieldNotFound {
		return get(new hnx.quickfix.fields.MidPx());
	}

	public boolean isSet(hnx.quickfix.fields.MidPx field) {
		return isSetField(field);
	}

	public boolean isSetMidPx() {
		return isSetField(631);
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

	public void set(hnx.quickfix.fields.TradingUnit value) {
		setField(value);
	}

	public hnx.quickfix.fields.TradingUnit get(hnx.quickfix.fields.TradingUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TradingUnit getTradingUnit() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TradingUnit());
	}

	public boolean isSet(hnx.quickfix.fields.TradingUnit field) {
		return isSetField(field);
	}

	public boolean isSetTradingUnit() {
		return isSetField(400);
	}

	public void set(hnx.quickfix.fields.TotalListingQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalListingQtty get(hnx.quickfix.fields.TotalListingQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalListingQtty getTotalListingQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalListingQtty());
	}

	public boolean isSet(hnx.quickfix.fields.TotalListingQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalListingQtty() {
		return isSetField(109);
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

	public void set(hnx.quickfix.fields.AdjustQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.AdjustQtty get(hnx.quickfix.fields.AdjustQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.AdjustQtty getAdjustQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.AdjustQtty());
	}

	public boolean isSet(hnx.quickfix.fields.AdjustQtty field) {
		return isSetField(field);
	}

	public boolean isSetAdjustQtty() {
		return isSetField(230);
	}

	public void set(hnx.quickfix.fields.ReferenceStatus value) {
		setField(value);
	}

	public hnx.quickfix.fields.ReferenceStatus get(hnx.quickfix.fields.ReferenceStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.ReferenceStatus getReferenceStatus() throws FieldNotFound {
		return get(new hnx.quickfix.fields.ReferenceStatus());
	}

	public boolean isSet(hnx.quickfix.fields.ReferenceStatus field) {
		return isSetField(field);
	}

	public boolean isSetReferenceStatus() {
		return isSetField(232);
	}

	public void set(hnx.quickfix.fields.AdjustRate value) {
		setField(value);
	}

	public hnx.quickfix.fields.AdjustRate get(hnx.quickfix.fields.AdjustRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.AdjustRate getAdjustRate() throws FieldNotFound {
		return get(new hnx.quickfix.fields.AdjustRate());
	}

	public boolean isSet(hnx.quickfix.fields.AdjustRate field) {
		return isSetField(field);
	}

	public boolean isSetAdjustRate() {
		return isSetField(233);
	}

	public void set(hnx.quickfix.fields.DividentRate value) {
		setField(value);
	}

	public hnx.quickfix.fields.DividentRate get(hnx.quickfix.fields.DividentRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.DividentRate getDividentRate() throws FieldNotFound {
		return get(new hnx.quickfix.fields.DividentRate());
	}

	public boolean isSet(hnx.quickfix.fields.DividentRate field) {
		return isSetField(field);
	}

	public boolean isSetDividentRate() {
		return isSetField(244);
	}

	public void set(hnx.quickfix.fields.CurrentPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.CurrentPrice get(hnx.quickfix.fields.CurrentPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CurrentPrice getCurrentPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CurrentPrice());
	}

	public boolean isSet(hnx.quickfix.fields.CurrentPrice field) {
		return isSetField(field);
	}

	public boolean isSetCurrentPrice() {
		return isSetField(255);
	}

	public void set(hnx.quickfix.fields.CurrentQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.CurrentQtty get(hnx.quickfix.fields.CurrentQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CurrentQtty getCurrentQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CurrentQtty());
	}

	public boolean isSet(hnx.quickfix.fields.CurrentQtty field) {
		return isSetField(field);
	}

	public boolean isSetCurrentQtty() {
		return isSetField(2551);
	}

	public void set(hnx.quickfix.fields.HighestPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.HighestPrice get(hnx.quickfix.fields.HighestPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.HighestPrice getHighestPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.HighestPrice());
	}

	public boolean isSet(hnx.quickfix.fields.HighestPrice field) {
		return isSetField(field);
	}

	public boolean isSetHighestPrice() {
		return isSetField(266);
	}

	public void set(hnx.quickfix.fields.LowestPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.LowestPrice get(hnx.quickfix.fields.LowestPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.LowestPrice getLowestPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.LowestPrice());
	}

	public boolean isSet(hnx.quickfix.fields.LowestPrice field) {
		return isSetField(field);
	}

	public boolean isSetLowestPrice() {
		return isSetField(2661);
	}

	public void set(hnx.quickfix.fields.PriorPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.PriorPrice get(hnx.quickfix.fields.PriorPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PriorPrice getPriorPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PriorPrice());
	}

	public boolean isSet(hnx.quickfix.fields.PriorPrice field) {
		return isSetField(field);
	}

	public boolean isSetPriorPrice() {
		return isSetField(277);
	}

	public void set(hnx.quickfix.fields.MatchValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.MatchValue get(hnx.quickfix.fields.MatchValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.MatchValue getMatchValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.MatchValue());
	}

	public boolean isSet(hnx.quickfix.fields.MatchValue field) {
		return isSetField(field);
	}

	public boolean isSetMatchValue() {
		return isSetField(310);
	}

	public void set(hnx.quickfix.fields.OfferCount value) {
		setField(value);
	}

	public hnx.quickfix.fields.OfferCount get(hnx.quickfix.fields.OfferCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.OfferCount getOfferCount() throws FieldNotFound {
		return get(new hnx.quickfix.fields.OfferCount());
	}

	public boolean isSet(hnx.quickfix.fields.OfferCount field) {
		return isSetField(field);
	}

	public boolean isSetOfferCount() {
		return isSetField(320);
	}

	public void set(hnx.quickfix.fields.BidCount value) {
		setField(value);
	}

	public hnx.quickfix.fields.BidCount get(hnx.quickfix.fields.BidCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BidCount getBidCount() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BidCount());
	}

	public boolean isSet(hnx.quickfix.fields.BidCount field) {
		return isSetField(field);
	}

	public boolean isSetBidCount() {
		return isSetField(321);
	}

	public void set(hnx.quickfix.fields.NM_TotalTradedQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.NM_TotalTradedQtty get(hnx.quickfix.fields.NM_TotalTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.NM_TotalTradedQtty getNM_TotalTradedQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.NM_TotalTradedQtty());
	}

	public boolean isSet(hnx.quickfix.fields.NM_TotalTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_TotalTradedQtty() {
		return isSetField(391);
	}

	public void set(hnx.quickfix.fields.NM_TotalTradedValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.NM_TotalTradedValue get(hnx.quickfix.fields.NM_TotalTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.NM_TotalTradedValue getNM_TotalTradedValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.NM_TotalTradedValue());
	}

	public boolean isSet(hnx.quickfix.fields.NM_TotalTradedValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_TotalTradedValue() {
		return isSetField(392);
	}

	public void set(hnx.quickfix.fields.PT_MatchQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.PT_MatchQtty get(hnx.quickfix.fields.PT_MatchQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PT_MatchQtty getPT_MatchQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PT_MatchQtty());
	}

	public boolean isSet(hnx.quickfix.fields.PT_MatchQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_MatchQtty() {
		return isSetField(393);
	}

	public void set(hnx.quickfix.fields.PT_MatchPrice value) {
		setField(value);
	}

	public hnx.quickfix.fields.PT_MatchPrice get(hnx.quickfix.fields.PT_MatchPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PT_MatchPrice getPT_MatchPrice() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PT_MatchPrice());
	}

	public boolean isSet(hnx.quickfix.fields.PT_MatchPrice field) {
		return isSetField(field);
	}

	public boolean isSetPT_MatchPrice() {
		return isSetField(3931);
	}

	public void set(hnx.quickfix.fields.PT_TotalTradedQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.PT_TotalTradedQtty get(hnx.quickfix.fields.PT_TotalTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PT_TotalTradedQtty getPT_TotalTradedQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PT_TotalTradedQtty());
	}

	public boolean isSet(hnx.quickfix.fields.PT_TotalTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_TotalTradedQtty() {
		return isSetField(394);
	}

	public void set(hnx.quickfix.fields.PT_TotalTradedValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.PT_TotalTradedValue get(hnx.quickfix.fields.PT_TotalTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PT_TotalTradedValue getPT_TotalTradedValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PT_TotalTradedValue());
	}

	public boolean isSet(hnx.quickfix.fields.PT_TotalTradedValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_TotalTradedValue() {
		return isSetField(9141);
	}

	public void set(hnx.quickfix.fields.TotalBuyTradingQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalBuyTradingQtty get(hnx.quickfix.fields.TotalBuyTradingQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalBuyTradingQtty getTotalBuyTradingQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalBuyTradingQtty());
	}

	public boolean isSet(hnx.quickfix.fields.TotalBuyTradingQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalBuyTradingQtty() {
		return isSetField(395);
	}

	public void set(hnx.quickfix.fields.BuyCount value) {
		setField(value);
	}

	public hnx.quickfix.fields.BuyCount get(hnx.quickfix.fields.BuyCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BuyCount getBuyCount() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BuyCount());
	}

	public boolean isSet(hnx.quickfix.fields.BuyCount field) {
		return isSetField(field);
	}

	public boolean isSetBuyCount() {
		return isSetField(3951);
	}

	public void set(hnx.quickfix.fields.TotalBuyTradingValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalBuyTradingValue get(hnx.quickfix.fields.TotalBuyTradingValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalBuyTradingValue getTotalBuyTradingValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalBuyTradingValue());
	}

	public boolean isSet(hnx.quickfix.fields.TotalBuyTradingValue field) {
		return isSetField(field);
	}

	public boolean isSetTotalBuyTradingValue() {
		return isSetField(396);
	}

	public void set(hnx.quickfix.fields.TotalSellTradingQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalSellTradingQtty get(hnx.quickfix.fields.TotalSellTradingQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalSellTradingQtty getTotalSellTradingQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalSellTradingQtty());
	}

	public boolean isSet(hnx.quickfix.fields.TotalSellTradingQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalSellTradingQtty() {
		return isSetField(3961);
	}

	public void set(hnx.quickfix.fields.SellCount value) {
		setField(value);
	}

	public hnx.quickfix.fields.SellCount get(hnx.quickfix.fields.SellCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SellCount getSellCount() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SellCount());
	}

	public boolean isSet(hnx.quickfix.fields.SellCount field) {
		return isSetField(field);
	}

	public boolean isSetSellCount() {
		return isSetField(3962);
	}

	public void set(hnx.quickfix.fields.TotalSellTradingValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.TotalSellTradingValue get(hnx.quickfix.fields.TotalSellTradingValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TotalSellTradingValue getTotalSellTradingValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TotalSellTradingValue());
	}

	public boolean isSet(hnx.quickfix.fields.TotalSellTradingValue field) {
		return isSetField(field);
	}

	public boolean isSetTotalSellTradingValue() {
		return isSetField(3962);
	}

	public void set(hnx.quickfix.fields.BuyForeignQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.BuyForeignQtty get(hnx.quickfix.fields.BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BuyForeignQtty getBuyForeignQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BuyForeignQtty());
	}

	public boolean isSet(hnx.quickfix.fields.BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetBuyForeignQtty() {
		return isSetField(397);
	}

	public void set(hnx.quickfix.fields.BuyForeignValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.BuyForeignValue get(hnx.quickfix.fields.BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BuyForeignValue getBuyForeignValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BuyForeignValue());
	}

	public boolean isSet(hnx.quickfix.fields.BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetBuyForeignValue() {
		return isSetField(3971);
	}

	public void set(hnx.quickfix.fields.SellForeignQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.SellForeignQtty get(hnx.quickfix.fields.SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SellForeignQtty getSellForeignQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SellForeignQtty());
	}

	public boolean isSet(hnx.quickfix.fields.SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetSellForeignQtty() {
		return isSetField(398);
	}

	public void set(hnx.quickfix.fields.SellForeignValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.SellForeignValue get(hnx.quickfix.fields.SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SellForeignValue getSellForeignValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SellForeignValue());
	}

	public boolean isSet(hnx.quickfix.fields.SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetSellForeignValue() {
		return isSetField(3981);
	}

	public void set(hnx.quickfix.fields.RemainForeignQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.RemainForeignQtty get(hnx.quickfix.fields.RemainForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.RemainForeignQtty getRemainForeignQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.RemainForeignQtty());
	}

	public boolean isSet(hnx.quickfix.fields.RemainForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetRemainForeignQtty() {
		return isSetField(3301);
	}

	public void set(hnx.quickfix.fields.MaturityDate value) {
		setField(value);
	}

	public hnx.quickfix.fields.MaturityDate get(hnx.quickfix.fields.MaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.MaturityDate getMaturityDate() throws FieldNotFound {
		return get(new hnx.quickfix.fields.MaturityDate());
	}

	public boolean isSet(hnx.quickfix.fields.MaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDate() {
		return isSetField(541);
	}

	public void set(hnx.quickfix.fields.CouponRate value) {
		setField(value);
	}

	public hnx.quickfix.fields.CouponRate get(hnx.quickfix.fields.CouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CouponRate getCouponRate() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CouponRate());
	}

	public boolean isSet(hnx.quickfix.fields.CouponRate field) {
		return isSetField(field);
	}

	public boolean isSetCouponRate() {
		return isSetField(223);
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

}
