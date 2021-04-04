/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package hnx.quickfix.messages;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case hnx.quickfix.messages.Heartbeat.MSGTYPE:
				return new hnx.quickfix.messages.Heartbeat();
	
			case hnx.quickfix.messages.Logon.MSGTYPE:
				return new hnx.quickfix.messages.Logon();
	
			case hnx.quickfix.messages.AutionMatch.MSGTYPE:
				return new hnx.quickfix.messages.AutionMatch();
	
			case hnx.quickfix.messages.BoardInfo.MSGTYPE:
				return new hnx.quickfix.messages.BoardInfo();
	
			case hnx.quickfix.messages.DerivativesInfo.MSGTYPE:
				return new hnx.quickfix.messages.DerivativesInfo();
	
			case hnx.quickfix.messages.Index.MSGTYPE:
				return new hnx.quickfix.messages.Index();
	
			case hnx.quickfix.messages.Stock.MSGTYPE:
				return new hnx.quickfix.messages.Stock();
	
			case hnx.quickfix.messages.StockInfo.MSGTYPE:
				return new hnx.quickfix.messages.StockInfo();
	
			case hnx.quickfix.messages.TopNPrice.MSGTYPE:
				return new hnx.quickfix.messages.TopNPrice();
	
			case hnx.quickfix.messages.TopPriceOddLot.MSGTYPE:
				return new hnx.quickfix.messages.TopPriceOddLot();
	
		}

		return new hnx.quickfix.messages.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case hnx.quickfix.messages.TopNPrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case hnx.quickfix.fields.NoTopPrice.FIELD:
					return new hnx.quickfix.messages.TopNPrice.NoTopPrice();
	
				}
				break;
	
		}

		return null;
	}
}
