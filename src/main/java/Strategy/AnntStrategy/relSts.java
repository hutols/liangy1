package Strategy.AnntStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/2 16:32
 */

@Component
public class relSts {
    @Autowired
    private Map<String, Strategy> strategyMap;

    public Strategy getInt(String a) {
        return strategyMap.get(a);
    }
}

