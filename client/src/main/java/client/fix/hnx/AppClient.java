package client.fix.hnx;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.FileStoreFactory;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.LogFactory;
import quickfix.Message;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.RejectLogon;
import quickfix.ScreenLogFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketInitiator;
import quickfix.UnsupportedMessageType;
import quickfix.fix42.MessageCracker;
import quickfix.fix42.NewOrderList;
import quickfix.fix42.NewOrderSingle;

/**
 * Hello world!
 *
 */
public class AppClient extends MessageCracker implements Application
{

    private static volatile SessionID sessionID;

    @Override
    public void fromAdmin(Message arg0, SessionID arg1)
            throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fromApp(Message arg0, SessionID arg1)
            throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        // TODO Auto-generated method stub
        System.out.println("From app:" + arg0);
        crack(arg0, arg1);
        
    }

    @Override
    public void onCreate(SessionID arg0) {
        // TODO Auto-generated method stub
        System.out.println("OnCreate session:" + arg0);
        
    }

    @Override
    public void onLogon(SessionID arg0) {
        // TODO Auto-generated method stub
        System.out.println("Logon");
        AppClient.sessionID = arg0;
        
    }

    @Override
    public void onLogout(SessionID arg0) {
        // TODO Auto-generated method stub
        System.out.println("Logout");
        AppClient.sessionID = null;

        
    }

    @Override
    public void toAdmin(Message arg0, SessionID arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void toApp(Message arg0, SessionID arg1) throws DoNotSend {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onMessage(NewOrderSingle message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        System.out.println("###NewOrder Received:" + message.toString());
        System.out.println("###Symbol" + message.getSymbol().toString());
        System.out.println("###Side" + message.getSide().toString());
        System.out.println("###Type" + message.getOrdType().toString());
        System.out.println("###TransactioTime" + message.getTransactTime().toString());

    }
    
    public static void main( String[] args ) throws ConfigError, InterruptedException
    {
        SessionSettings settings = new SessionSettings("./client.cfg");

        Application application = new AppClient();
        MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
        LogFactory logFactory = new ScreenLogFactory( true, true, true);
        MessageFactory messageFactory = new DefaultMessageFactory();

        SocketInitiator initiator = new SocketInitiator(application, messageStoreFactory, settings, logFactory, messageFactory);
        initiator.start();

        while (sessionID == null) {
            Thread.sleep(1000);
        }


       
    }
}
