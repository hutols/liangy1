package 测试5;

import org.springframework.stereotype.Component;

@Component(PersonType.WORKER)
public class Worker implements Person{

  @Override
  public void eat() {
    System.out.println("工人吃");
  }

  @Override
  public void run() {
    System.out.println("工人跑");
  }
}

