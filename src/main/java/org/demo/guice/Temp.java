package org.demo.guice;

public class Temp {
    public static void main(String[] args) {
        Object[][] a={{1,2,1},{2,1,2,3}};
        System.out.println(a.length);

        String[][] as=new String[][]{};

       Object[][] b= new Object[][]{
                {3,1,2},
                {4,2,2}
        };
        System.out.println(((Object[][]) b).length);
    }
}
