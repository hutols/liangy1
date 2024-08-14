package Strategy.AnntStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author LY
 * @version 1.0
 * @date 2024/1/2 16:36
 */

@Component(RelTp.Rel_1)
public class a implements Strategy {

    @Override
    public void all(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}

