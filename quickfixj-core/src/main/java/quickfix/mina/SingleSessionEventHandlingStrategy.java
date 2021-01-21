package quickfix.mina;

import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;

public class SingleSessionEventHandlingStrategy implements EventHandlingStrategy{
    @Override
    public void onMessage(Session quickfixSession, Message message) {

    }

    @Override
    public SessionConnector getSessionConnector() {
        return null;
    }

    @Override
    public int getQueueSize() {
        return 0;
    }

    @Override
    public int getQueueSize(SessionID sessionID) {
        return 0;
    }
}
