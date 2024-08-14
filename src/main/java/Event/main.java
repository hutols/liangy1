package Event;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/12 15:43
 */

@Service
@RequiredArgsConstructor
public class main {


    private  ApplicationEventPublisher applicationEventPublisher;


    public void a() {
        JournalData journalData = new JournalData();
        journalData.setName("张三");
        journalData.setAge(23);
        applicationEventPublisher.publishEvent(new JournalEvent(this, journalData));
    }
}

