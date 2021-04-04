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

import quickfix.FieldNotFound;
  
import quickfix.field.*;


public class Message extends quickfix.Message {

	static final long serialVersionUID = 20050617;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		
		getHeader().setField(new BeginString("FIX.4.4"));
			
	}

    @Override
    protected Header newHeader() {
        return new Header(this);
    }

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = 20050617;

		public Header(Message msg) {
			// JNI compatibility
		}
		
	public void set(hnx.quickfix.fields.BeginString value) {
		setField(value);
	}

	public hnx.quickfix.fields.BeginString get(hnx.quickfix.fields.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BeginString getBeginString() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BeginString());
	}

	public boolean isSet(hnx.quickfix.fields.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(hnx.quickfix.fields.BodyLength value) {
		setField(value);
	}

	public hnx.quickfix.fields.BodyLength get(hnx.quickfix.fields.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.BodyLength getBodyLength() throws FieldNotFound {
		return get(new hnx.quickfix.fields.BodyLength());
	}

	public boolean isSet(hnx.quickfix.fields.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(hnx.quickfix.fields.MsgType value) {
		setField(value);
	}

	public hnx.quickfix.fields.MsgType get(hnx.quickfix.fields.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.MsgType getMsgType() throws FieldNotFound {
		return get(new hnx.quickfix.fields.MsgType());
	}

	public boolean isSet(hnx.quickfix.fields.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(hnx.quickfix.fields.SenderCompID value) {
		setField(value);
	}

	public hnx.quickfix.fields.SenderCompID get(hnx.quickfix.fields.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SenderCompID());
	}

	public boolean isSet(hnx.quickfix.fields.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(hnx.quickfix.fields.SendingTime value) {
		setField(value);
	}

	public hnx.quickfix.fields.SendingTime get(hnx.quickfix.fields.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SendingTime getSendingTime() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SendingTime());
	}

	public boolean isSet(hnx.quickfix.fields.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	}
	
	
	public void set(hnx.quickfix.fields.SignatureLength value) {
		setField(value);
	}

	public hnx.quickfix.fields.SignatureLength get(hnx.quickfix.fields.SignatureLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.SignatureLength getSignatureLength() throws FieldNotFound {
		return get(new hnx.quickfix.fields.SignatureLength());
	}

	public boolean isSet(hnx.quickfix.fields.SignatureLength field) {
		return isSetField(field);
	}

	public boolean isSetSignatureLength() {
		return isSetField(93);
	}

	public void set(hnx.quickfix.fields.Signature value) {
		setField(value);
	}

	public hnx.quickfix.fields.Signature get(hnx.quickfix.fields.Signature value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.Signature getSignature() throws FieldNotFound {
		return get(new hnx.quickfix.fields.Signature());
	}

	public boolean isSet(hnx.quickfix.fields.Signature field) {
		return isSetField(field);
	}

	public boolean isSetSignature() {
		return isSetField(89);
	}

	public void set(hnx.quickfix.fields.CheckSum value) {
		setField(value);
	}

	public hnx.quickfix.fields.CheckSum get(hnx.quickfix.fields.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public hnx.quickfix.fields.CheckSum getCheckSum() throws FieldNotFound {
		return get(new hnx.quickfix.fields.CheckSum());
	}

	public boolean isSet(hnx.quickfix.fields.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
