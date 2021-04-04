package server.fix.hnx;

import quickfix.Acceptor;
import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.LogFactory;
import quickfix.Message;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.RejectLogon;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.UnsupportedMessageType;
import quickfix.field.ClOrdID;
import quickfix.field.HandlInst;
import quickfix.field.HeartBtInt;
import quickfix.field.OrdType;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.TransactTime;
import quickfix.fix42.Logon;
import quickfix.fix42.NewOrderSingle;

/**
 * Hello world!
 *
 */
public class AppServer implements Application
{
    public static void main( String[] args ) throws ConfigError
    {
       SessionSettings settings = new SessionSettings("./server.cfg");

       Application application = new AppServer();
       MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
       LogFactory logFactory = new ScreenLogFactory( true, true, true);
       MessageFactory messageFactory = new DefaultMessageFactory();
       //FileLogFactory fileLogFactory = new FileLogFactory(settings);
        //SocketAcceptor acceptor = new SocketAccep
        SocketAcceptor acceptor = new SocketAcceptor(application, messageStoreFactory, settings, logFactory, messageFactory);
        acceptor.start();

        SessionID sessionID = acceptor.getSessions().get(0);
        Session.lookupSession(sessionID).logon();

        Logon logon = new Logon();

        logon.set(new HeartBtInt(30));
        logon.set(new quickfix.field.ResetSeqNumFlag(true));
        logon.set(new quickfix.field.EncryptMethod(0));

        try {
            System.out.println("##logon:" + logon.toString());
            Session.sendToTarget(logon, sessionID);
        } catch (SessionNotFound e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Thread.sleep(10000);
            for (int i = 1; i< 10; i ++) {
                NewOrderSingle newOrderSingle = new NewOrderSingle(
                    new ClOrdID(String.valueOf(123+i)), 
                    new HandlInst('3'), 
                    new Symbol("SSSSSS.J" + i),
                    new Side(Side.BUY),
                    new TransactTime(),
                    new OrdType(OrdType.MARKET)
                    );
                System.out.println("##New Send" + i +":" + newOrderSingle.toString());
                Session.sendToTarget(newOrderSingle, sessionID);
            }
          
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SessionNotFound e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    @Override
    public void fromAdmin(Message arg0, SessionID arg1)
            throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fromApp(Message arg0, SessionID arg1)
            throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        // TODO Auto-generated method stub
        
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
        
    }

    @Override
    public void onLogout(SessionID arg0) {
        // TODO Auto-generated method stub
        System.out.println("Logout");
        
    }

    @Override
    public void toAdmin(Message arg0, SessionID arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void toApp(Message arg0, SessionID arg1) throws DoNotSend {
        // TODO Auto-generated method stub
        System.out.println("Send mess to app:" + arg0);
        
    }
}
