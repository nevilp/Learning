import java.util.HashMap;
import java.util.Map;

public class LRUCache<T> {

    private final int cacheCapacity;
    private int cacheSize;
    private final Map<String, Node> hashmap;
    private final DoublyLinkedList cacheQueLinkedList;

    LRUCache(final int cacheCapacity) {
        this.cacheCapacity = cacheCapacity;
        this.hashmap = new HashMap();
        this.cacheQueLinkedList = new DoublyLinkedList();
        this.cacheSize = 0;
    }

    public T get(final String key) {
        Node nodeFromhashMap = hashmap.get(key);
        if(nodeFromhashMap == null) {
            return null;
        }
        else {
            cacheQueLinkedList.moveNodeToFront(nodeFromhashMap);
            return hashmap.get(key).value;
        }
    }

    public void put(final String key, final T value) {
        Node currentNode = hashmap.get(key);
        if(currentNode != null) {
            currentNode.value = value;
            cacheQueLinkedList.moveNodeToFront(currentNode);
        }

        if(cacheSize == cacheCapacity) {
            String rearNodeKey = cacheQueLinkedList.getTailKey();
            cacheQueLinkedList.removeFromTail();
            hashmap.remove(rearNodeKey);
            cacheSize--;
        }

        Node node = new Node(key, value);
        cacheQueLinkedList.addNodeToFront(node);
        hashmap.put(key, node);
        cacheSize++;
    }

    private class Node {
        String key;
        T value;
        Node nextNode, prevNode;
        public Node(final String key, final T value) {
            this.key = key;
            this.value = value;
            this.nextNode = null;
            this.prevNode = null;
        }
    }

    private class DoublyLinkedList {
        private Node headNode, tailNode;
        public DoublyLinkedList() {
            headNode = tailNode = null;
        }

        private void addNodeToFront(final Node node) {
            if(tailNode == null) {
                headNode = tailNode = node;
                return;
            }
            node.nextNode = headNode;
            headNode.prevNode = node;
            headNode = node;
        }

        public void moveNodeToFront(final Node node) {
            if(headNode == node) {
                return;
            }

            if(node == tailNode) {
                tailNode = tailNode.prevNode;
                tailNode.nextNode = null;
            } else {
                node.prevNode.nextNode = node.nextNode;
                node.nextNode.prevNode = node.prevNode;
            }

            node.prevNode = null;
            node.nextNode = headNode;
            headNode.prevNode = node;
            headNode = node;
        }

        private void removeFromTail() {
            if(tailNode == null) {
                return;
            }

            System.out.println("Deleting key: " + tailNode.key);
            if(headNode == tailNode) {
                headNode = tailNode = null;
            } else {
                tailNode = tailNode.prevNode;
                tailNode.nextNode = null;
            }
        }

        private String getTailKey() {
            return tailNode.key;
        }
    }
}