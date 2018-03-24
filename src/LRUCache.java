import java.util.HashMap;

public class LRUCache {

    class Node {
        Integer k;
        Integer v;
        Node pre;
        Node next;

        public Node(Integer k, Integer v) {
            this.k = k;
            this.v= v;
            pre = null;
            next = null;
        }
    }

    private int capacity;
    private Node head = new Node(null, null);
    private Node tail = new Node(null, null);
    private HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.pre = head;

    }

    public int get(int key) {
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        else{
            Node current = node;

            //move current node to tail
            moveToTail(current);

        }
        return node.v;
    }

    public void put(int key, int value) {
        Node current = map.get(key);
        if(current!=null){
            current.v = value;
            moveToTail(current);
        }else {
            Node newNode = new Node(key, value);
            if(map.size() == capacity){
                //remove node
                Node headNextNode = head.next;
                head.next = headNextNode.next;
                headNextNode.next.pre = head;

                map.remove(headNextNode.k);


            }
            moveToTail(newNode);
            map.put(key, newNode);
        }

    }

    public void moveToTail(Node current){
        // not a new node
        if(current.pre != null && current.next != null){
            Node preNode = current.pre;
            Node nextNode = current.next;
            preNode.next = nextNode;
            nextNode.pre = preNode;
        }

        Node preTailNode = tail.pre;
        preTailNode.next = current;
        current.pre = preTailNode;
        current.next = tail;
        tail.pre = current;

    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* capacity */ );

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));       // returns -1 (not found)
        System.out.println(cache.get(3));       // returns 3
        System.out.println(cache.get(4));       // returns 4


    }
}
