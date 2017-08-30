package TDD;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TDDTestList{

    private TDDList list;

    @BeforeTest
    public void before(){
        list=new TDDList();
    }

    @Test
    public void testSize(){
        Assert.assertEquals(list.size(),0);
    }


    @Test
    public void testAdd(){
        list.add("s");
    }
}
