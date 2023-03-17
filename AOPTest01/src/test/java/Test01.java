import com.aoptest.config.TestConfig;
import com.aoptest.sevrice.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {
    @org.junit.jupiter.api.Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
        Test test = (Test) applicationContext.getBean("tsevrice");
        test.test1();
        test.test02();
        test.test03();
        test.test04();
        test.test05();
    }
}
