import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void TestConstructor(){
        Judge J = new Judge();
    }
    @Test
    public void TestExample1(){
        Judge J = new Judge();
        int[][] T = {{1,2}};
        Assert.assertEquals(2,J.findJudge(2,T));
    }
    @Test
    public void TestExample2(){
        Judge J = new Judge();
        int[][] T = {{1,3},{2,3}};
        Assert.assertEquals(3,J.findJudge(3,T));
    }
    @Test
    public void TestExample3(){
        Judge J = new Judge();
        int[][] T = {{1,3},{2,3},{3,1}};
        Assert.assertEquals(-1,J.findJudge(3,T));
    }
    @Test
    public void TestExample4(){
        Judge J = new Judge();
        int[][] T = {{1,2},{2,3}};
        Assert.assertEquals(-1,J.findJudge(3,T));
    }
    @Test
    public void TestExample5(){
        Judge J = new Judge();
        int[][] T = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        Assert.assertEquals(3,J.findJudge(4,T));
    }
}
