package Event;

import org.springframework.context.ApplicationListener;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/12 15:55
 */

public class Server implements ApplicationListener<JournalEvent> {
    @Override
    public void onApplicationEvent(JournalEvent event) {
        JournalData journalData = event.getJournalData();
        System.out.println(journalData.getName());
        System.out.println(journalData.getAge());
    }
}

