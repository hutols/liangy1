package 测试5;

import org.springframework.stereotype.Component;

@Component(PersonType.TEACHER)
public class Teacher implements Person{

  @Override
  public void eat() {
    System.out.println("老师吃");
  }

  @Override
  public void run() {
    System.out.println("老师跑");
  }
}

