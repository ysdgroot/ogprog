
import org.junit.Assert;
import org.junit.Test;

import dodona.junit.TabTitle;

@TabTitle("World")
public class TestWorld {

    @Test
    public void testHelloWorld() {
        Thing thing = new World();
        Assert.assertEquals(
            "Your method should return \"Hello, World!\"",
            "Hello, World!",
            thing.hello()
        );
    }

}
