package 测试5;

import org.springframework.stereotype.Component;

@Component(PersonType.DOCTOR)
public class Doctor implements Person{

  @Override
  public void eat() {
    System.out.println("医生吃");
  }

  @Override
  public void run() {
    System.out.println("医生跑");
  }
}

