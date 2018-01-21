package q16_25;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestSolution {

    private LRUCache cache;

    @Before
    public void setup() {

    }


    @Test
    public void test() {
        cache = new LRUCache<String, String>(3);

        assertThat(cache.get("Any key")).isNull();

        String key1 = "key1";
        String value1 = "value1";
        cache.put(key1, value1);
        assertThat(cache.get(key1)).isEqualTo(value1);
        assertThat(cache.getHead().key).isEqualTo(key1);
        assertThat(cache.getTail().key).isEqualTo(key1);
        assertThat(cache.getCacheSize()).isEqualTo(1);

        String key2 = "key2";
        String value2 = "value2";
        cache.put(key2, value2);
        String key3 = "key3";
        String value3 = "value3";
        cache.put(key3, value3);

        assertThat(cache.getCacheSize()).isEqualTo(3);
        assertThat(cache.getHead().key).isEqualTo(key1);
        assertThat(cache.getTail().key).isEqualTo(key3);


        String key4 = "key4";
        String value4 = "value4";
        cache.put(key4, value4);

        assertThat(cache.getCacheSize()).isEqualTo(3);
        assertThat(cache.getHead().key).isEqualTo(key2);
        assertThat(cache.getTail().key).isEqualTo(key4);


        assertThat(cache.get(key3)).isEqualTo(value3);

        assertThat(cache.getHead().key).isEqualTo(key2);
        assertThat(cache.getTail().key).isEqualTo(key3);


        assertThat(cache.get(key3)).isEqualTo(value3);

        assertThat(cache.getHead().key).isEqualTo(key2);
        assertThat(cache.getTail().key).isEqualTo(key3);


        assertThat(cache.get(key2)).isEqualTo(value2);

        assertThat(cache.getHead().key).isEqualTo(key4);
        assertThat(cache.getTail().key).isEqualTo(key2);

        String key5 = "key5";
        String value5 = "value5";
        cache.put(key5, value5);

        assertThat(cache.getCacheSize()).isEqualTo(3);
        assertThat(cache.getHead().key).isEqualTo(key3);
        assertThat(cache.getTail().key).isEqualTo(key5);
    }

}
