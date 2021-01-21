package quickfix;

import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.SingleSessionEventHandlingStrategy;
import quickfix.mina.initiator.AbstractSocketInitiator;

public class SingleSessionSocketInitiator extends AbstractSocketInitiator {
    private final SingleSessionEventHandlingStrategy eventHandlingStrategy;

    protected SingleSessionSocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
                                           SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory,
                                           SingleSessionEventHandlingStrategy eventHandlingStrategy) throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        this.eventHandlingStrategy = eventHandlingStrategy;
    }

    @Override
    public void start() throws ConfigError, RuntimeError {

    }

    public void initialize() {

    }

    @Override
    public void stop(boolean force) {

    }

    @Override
    protected EventHandlingStrategy getEventHandlingStrategy() {
        return null;
    }
}
