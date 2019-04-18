package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTestApplicationTests {

    
    
    
    
    
    @Test
    public void contextLoads() {

        //找出四位整数a,b,c,d中满足(ab+cd)(ab+cd)=abcd的数。
        for(int i=1000; i<=9999; i++) {
            int a = i / 1000;
            int b = i / 100 % 10;
            int c = i % 100 / 10;
            int d = i % 10;
            if (((a * 10 + b) + (c * 10 + d)) * ((a * 10 + b) + (c * 10 + d)) == i) {
                System.out.println(i);
            }
        }
    }

}
