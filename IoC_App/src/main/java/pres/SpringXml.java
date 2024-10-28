package pres;

import dao.ICalcul;
import metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        ICalcul cal = (ICalcul) context.getBean(ICalcul.class);
        System.out.println(cal.getValue());
        IGestion gest = (IGestion) context.getBean(IGestion.class);
        System.out.println(gest.calcul());
    }
}
