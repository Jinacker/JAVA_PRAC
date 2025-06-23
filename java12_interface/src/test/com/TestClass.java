package test.com;

import java.io.Serializable;

public class TestClass implements TestInter03,TestInter04, Serializable {
    @Override
    public void sleep() {
        System.out.println("TestClass sleep()...");
    }

    public void study(){
        System.out.println("TestClass study()....");
    }

}
