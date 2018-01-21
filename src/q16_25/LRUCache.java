package q16_25;

import java.util.HashMap;

public class LRUCache<K, V> {

    private int size;

    private HashMap<K, Node> cache;
    private Node<K, V> head;
    private Node<K, V> tail;

    public LRUCache(int size) {
        this.size = size;
        cache = new HashMap<>(size);
    }

    public V get(K key) {
        Node<K, V> node = cache.get(key);
        if (node == null) {
            return null;
        }

        if (node != tail) {
            Node next = node.next;
            Node prev = node.prev;

            next.prev = prev;

            if (prev == null) {
                head = next;
            } else {
                prev.next = next;
            }

            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        }

        return node.value;
    }

    public void put(K key, V value) {
        if (cache.size() == size) {

            Node<K, V> lru = head;
            cache.remove(lru.key);

            Node<K, V> next = head.next;
            next.prev = null;
            head.next = null;
            head = next;
        }

        Node<K, V> newNode = new Node(key, value);

        if (cache.isEmpty()) {
            head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
        }

        tail = newNode;

        cache.put(key, newNode);

    }

    public int getCacheSize() {
        return cache.size();
    }

    public Node<K, V> getHead() {
        return head;
    }

    public void setHead(Node<K, V> head) {
        this.head = head;
    }

    public Node<K, V> getTail() {
        return tail;
    }

    public void setTail(Node<K, V> tail) {
        this.tail = tail;
    }


}


