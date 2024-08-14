package 测试5;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonFactor {

  @Autowired
  private Map<String, Person> personTypeMap;

  public Person getPerson(String personType) {
    return personTypeMap.get(personType);
  }
}

