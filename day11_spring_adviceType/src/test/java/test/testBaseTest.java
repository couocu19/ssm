package test;
import com.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBaseTest {

    @Test
    public void testAdd(){

        //获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        AccountService as = ac.getBean("accountService",AccountService.class);

        as.addAccount();
        System.out.println("--------------");
        as.deleteAccount();
        System.out.println("--------------");
        as.updateAccount(2);
    }



}
