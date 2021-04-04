
package hnx.quickfix.messages;

import quickfix.FieldNotFound;


public class DerivativesInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "DI";
	

	public DerivativesInfo() {
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

	public void set(hnx.quickfix.fields.Underlying value) {
		setField(value);
	}

	public hnx.quickfix.fields.Underlying get(hnx.quickfix.fields.Underlying value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Underlying getUnderlying() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Underlying());
	}

	public boolean isSet(hnx.quickfix.fields.Underlying field) {
		return isSetField(field);
	}

	public boolean isSetUnderlying() {
		return isSetField(800);
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

	public void set(hnx.quickfix.fields.TradeSesStatus value) {
		setField(value);
	}

	public hnx.quickfix.fields.TradeSesStatus get(hnx.quickfix.fields.TradeSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.TradeSesStatus getTradeSesStatus() throws FieldNotFound {
		return get(new hnx.quickfix.fields.TradeSesStatus());
	}

	public boolean isSet(hnx.quickfix.fields.TradeSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradeSesStatus() {
		return isSetField(340);
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

	public void set(hnx.quickfix.fields.OpenInterest value) {
		setField(value);
	}

	public hnx.quickfix.fields.OpenInterest get(hnx.quickfix.fields.OpenInterest value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.OpenInterest getOpenInterest() throws FieldNotFound {
		return get(new hnx.quickfix.fields.OpenInterest());
	}

	public boolean isSet(hnx.quickfix.fields.OpenInterest field) {
		return isSetField(field);
	}

	public boolean isSetOpenInterest() {
		return isSetField(801);
	}

	public void set(hnx.quickfix.fields.OpenInterestChange value) {
		setField(value);
	}

	public hnx.quickfix.fields.OpenInterestChange get(hnx.quickfix.fields.OpenInterestChange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.OpenInterestChange getOpenInterestChange() throws FieldNotFound {
		return get(new hnx.quickfix.fields.OpenInterestChange());
	}

	public boolean isSet(hnx.quickfix.fields.OpenInterestChange field) {
		return isSetField(field);
	}

	public boolean isSetOpenInterestChange() {
		return isSetField(8011);
	}

	public void set(hnx.quickfix.fields.FirstTradingDate value) {
		setField(value);
	}

	public hnx.quickfix.fields.FirstTradingDate get(hnx.quickfix.fields.FirstTradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.FirstTradingDate getFirstTradingDate() throws FieldNotFound {
		return get(new hnx.quickfix.fields.FirstTradingDate());
	}

	public boolean isSet(hnx.quickfix.fields.FirstTradingDate field) {
		return isSetField(field);
	}

	public boolean isSetFirstTradingDate() {
		return isSetField(802);
	}

	public void set(hnx.quickfix.fields.LastTradingDate value) {
		setField(value);
	}

	public hnx.quickfix.fields.LastTradingDate get(hnx.quickfix.fields.LastTradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.LastTradingDate getLastTradingDate() throws FieldNotFound {
		return get(new hnx.quickfix.fields.LastTradingDate());
	}

	public boolean isSet(hnx.quickfix.fields.LastTradingDate field) {
		return isSetField(field);
	}

	public boolean isSetLastTradingDate() {
		return isSetField(803);
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

	public void set(hnx.quickfix.fields.OpenQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.OpenQtty get(hnx.quickfix.fields.OpenQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.OpenQtty getOpenQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.OpenQtty());
	}

	public boolean isSet(hnx.quickfix.fields.OpenQtty field) {
		return isSetField(field);
	}

	public boolean isSetOpenQtty() {
		return isSetField(804);
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

	public void set(hnx.quickfix.fields.CloseQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.CloseQtty get(hnx.quickfix.fields.CloseQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CloseQtty getCloseQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CloseQtty());
	}

	public boolean isSet(hnx.quickfix.fields.CloseQtty field) {
		return isSetField(field);
	}

	public boolean isSetCloseQtty() {
		return isSetField(805);
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

	public void set(hnx.quickfix.fields.NM_BuyForeignQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.NM_BuyForeignQtty get(hnx.quickfix.fields.NM_BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.NM_BuyForeignQtty getNM_BuyForeignQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.NM_BuyForeignQtty());
	}

	public boolean isSet(hnx.quickfix.fields.NM_BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_BuyForeignQtty() {
		return isSetField(814);
	}

	public void set(hnx.quickfix.fields.PT_BuyForeignQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.PT_BuyForeignQtty get(hnx.quickfix.fields.PT_BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PT_BuyForeignQtty getPT_BuyForeignQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PT_BuyForeignQtty());
	}

	public boolean isSet(hnx.quickfix.fields.PT_BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_BuyForeignQtty() {
		return isSetField(815);
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

	public void set(hnx.quickfix.fields.NM_BuyForeignValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.NM_BuyForeignValue get(hnx.quickfix.fields.NM_BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.NM_BuyForeignValue getNM_BuyForeignValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.NM_BuyForeignValue());
	}

	public boolean isSet(hnx.quickfix.fields.NM_BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_BuyForeignValue() {
		return isSetField(8141);
	}

	public void set(hnx.quickfix.fields.PT_BuyForeignValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.PT_BuyForeignValue get(hnx.quickfix.fields.PT_BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PT_BuyForeignValue getPT_BuyForeignValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PT_BuyForeignValue());
	}

	public boolean isSet(hnx.quickfix.fields.PT_BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_BuyForeignValue() {
		return isSetField(8151);
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

	public void set(hnx.quickfix.fields.NM_SellForeignQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.NM_SellForeignQtty get(hnx.quickfix.fields.NM_SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.NM_SellForeignQtty getNM_SellForeignQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.NM_SellForeignQtty());
	}

	public boolean isSet(hnx.quickfix.fields.NM_SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_SellForeignQtty() {
		return isSetField(816);
	}

	public void set(hnx.quickfix.fields.PT_SellForeignQtty value) {
		setField(value);
	}

	public hnx.quickfix.fields.PT_SellForeignQtty get(hnx.quickfix.fields.PT_SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PT_SellForeignQtty getPT_SellForeignQtty() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PT_SellForeignQtty());
	}

	public boolean isSet(hnx.quickfix.fields.PT_SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_SellForeignQtty() {
		return isSetField(817);
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

	public void set(hnx.quickfix.fields.NM_SellForeignValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.NM_SellForeignValue get(hnx.quickfix.fields.NM_SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.NM_SellForeignValue getNM_SellForeignValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.NM_SellForeignValue());
	}

	public boolean isSet(hnx.quickfix.fields.NM_SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_SellForeignValue() {
		return isSetField(8161);
	}

	public void set(hnx.quickfix.fields.PT_SellForeignValue value) {
		setField(value);
	}

	public hnx.quickfix.fields.PT_SellForeignValue get(hnx.quickfix.fields.PT_SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.PT_SellForeignValue getPT_SellForeignValue() throws FieldNotFound {
		return get(new hnx.quickfix.fields.PT_SellForeignValue());
	}

	public boolean isSet(hnx.quickfix.fields.PT_SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_SellForeignValue() {
		return isSetField(8171);
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

}
