package 测试5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired
  public PersonFactor personFactor;

  @GetMapping("/teacher")
  public void getTeacher(){
    Person teacher = personFactor.getPerson("teacher");
    teacher.eat();
  }
}

