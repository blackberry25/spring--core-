package com.springcore.spel;

import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
        Demo ob=ac.getBean("demo",Demo.class);
        System.out.println(ob);
        // see it later why its not working
        // SpelExpressionParser temp=new SpelExpressionParser();
        // Expression expression= (Expression) temp.parseExpression("34+2");
        // System.out.println(expression.getValue());

    }
    
}
