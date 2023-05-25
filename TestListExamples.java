import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }
}

/**
public class ListTest{
  IsMoon sc = new IsMoon();
  @Test
  public void testFilter(){
      //List<String> listOfString = new List<String>(){"dog", "elephant", "lizzard", "cat", "mouse"};
      List<String> lst = Arrays.asList("moon", "smoon", "lizzard", "cat", "mouse");
      List<String> lst2 = Arrays.asList("moon", "smoon");
      assertArrayEquals((lst2).toArray(), ListExamples.filter(lst, sc).toArray());
  }
}
*/
