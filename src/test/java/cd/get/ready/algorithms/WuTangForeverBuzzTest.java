package cd.get.ready.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class WuTangForeverBuzzTest {

    @Test
    public void wuTangClanTest(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();
        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTangForever\n";
        String actual = wuTangForeverBuzz.wuTangClan(15);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void wuTangClanTest2(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();
        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n"+
                "11\nWu\n13\n14\nWuTangForever\n16\n17\nWu\n19\nTang\nWu\n22\n"+
                "23\nWu\nTang\n26\nWu\n28\n29\nWuTangForever\n31\n32\nWu\n34\nTang\nWu\n37\n38\nWu\nTang\n";
        String actual = wuTangForeverBuzz.wuTangClan(40);
        Assert.assertEquals(expected,actual);
    }
}
