import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void test1() {
        String[] a = new String[1];
        a[0] = "";
        assertEquals("[[]]", Solution.groupAnagrams(a).toString() );
    }
    @org.junit.jupiter.api.Test
    void test2() {
        String[] a = new String []{"eat","tea","tan","ate","nat","bat"};
        assertEquals("[[eat, tea, ate], [tan, nat], [bat]]", Solution.groupAnagrams(a).toString() );
    }

    @org.junit.jupiter.api.Test
    void test3() {
        String[] a = new String []{"bdddddddddd","bbbbbbbbbbc"};
        assertEquals("[[bbbbbbbbbbc], [bdddddddddd]]", Solution.groupAnagrams(a).toString() );
    }
}