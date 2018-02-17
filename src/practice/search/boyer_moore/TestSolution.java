package practice.search.boyer_moore;


import org.junit.Before;
import org.junit.Test;
import practice.sort.bubblesort.MySolution;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private BoyerMooreSearch boyerMooreSearch;

    @Before
    public void setup(){
        boyerMooreSearch = new BoyerMooreSearch();
    }

    @Test (expected = IllegalArgumentException.class)
    public void test(){
        boyerMooreSearch.search(null, "query");
    }

    @Test (expected = IllegalArgumentException.class)
    public void test2(){
        boyerMooreSearch.search("", "query");
    }

    @Test (expected = IllegalArgumentException.class)
    public void test3(){
        boyerMooreSearch.search("target", null);
    }

    @Test
    public void test4(){
        assertThat(boyerMooreSearch.search("target", "")).isFalse();
    }

    @Test
    public void test5(){
        assertThat(boyerMooreSearch.search("target", "ar")).isTrue();
    }

    @Test
    public void test6(){
        assertThat(boyerMooreSearch.search("target", "target")).isTrue();
    }

    @Test
    public void test7(){
        assertThat(boyerMooreSearch.search("target", "tar")).isTrue();
    }

    @Test
    public void test8(){
        assertThat(boyerMooreSearch.search("target", "get")).isTrue();
    }

    @Test
    public void test9(){
        assertThat(boyerMooreSearch.search("target", "query")).isFalse();
    }

    @Test
    public void test10() {
        assertThat(boyerMooreSearch.search("aaabacabcdabcde", "dxbc")).isFalse();
    }

    @Test
    public void test11() {
        assertThat(boyerMooreSearch.search("aaababcabcdabcde", "dabc")).isTrue();
    }

    @Test
    public void test12() {
        assertThat(boyerMooreSearch.search("aabaabcaabcdaabcde", "abcda")).isTrue();
    }

}
