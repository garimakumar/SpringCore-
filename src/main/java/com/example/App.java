package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
    	Year2021 y21=ac.getBean(Year2021.class);
    	Year2022 y22=ac.getBean(Year2022.class);
    	Year2023 y23=ac.getBean(Year2023.class);
    	y21.SamsungSeries();
    	y21.OppoSeries();
    	y21.IphoneSeries();
    	y22.SamsungSeries();
    	y22.OppoSeries();
    	y22.IphoneSeries();
    	y23.SamsungSeries();
    	y23.OppoSeries();
    	y23.IphoneSeries();
    	
    }
}
