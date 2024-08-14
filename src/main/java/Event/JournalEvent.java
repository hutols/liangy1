package Event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/12 15:44
 */

public class JournalEvent extends ApplicationEvent {
    private JournalData journalData;

    public JournalEvent(Object source, JournalData journalData) {
        super(source);
        this.journalData = journalData;
    }

    public JournalData getJournalData() {
        return this.journalData;
    }
}

