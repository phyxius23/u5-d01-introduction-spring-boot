package epicode.u5d01introductionspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import epicode.u5d01introductionspringboot.configs.MenuConfig;
import epicode.u5d01introductionspringboot.model.Menu;

@Component
public class MenuRunner implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);

    Menu menu = ctx.getBean(Menu.class);

    menu.print();

    ctx.close();
  }

}
