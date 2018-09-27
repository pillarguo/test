package com.imooc.girl;

import com.invoke.MethodInvoke;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    int expected;
    int input1;
    int input2;

    @Parameters
    public static Collection<Object[]> t(){
        return Arrays.asList(new Object[][]{
                {3,1,2},
                {4,2,2}
        });
    }

    public ParameterizedTest(int expected,int input1,int input2){
        this.expected=expected;
        this.input1=input1;
        this.input2=input2;
    }

    @Test
    public void testAdd(){
        assertEquals(expected, new MethodInvoke().add(input1,input2));
    }
}
