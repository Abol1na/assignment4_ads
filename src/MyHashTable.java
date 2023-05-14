public class MyHashTable<K, V> {
    private class HashNode<K, V>{
        private K key;
        private V value;
        private HashNode<K, V> next;
        public HashNode(K key, V value){
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString(){
            return "{" + key + " " + value + "}";
        }
    }
    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;
    public MyHashTable(){
        //the default constructor with the default size of 11
        chainArray = new HashNode[M];
    }
    public MyHashTable(int M){
        //the constructor takes an integer and sets M to the give value
        this.M = M;
        chainArray = new HashNode[M];
    }
    private int hash(K key){
        //calculate the hash code for a provided key and then return the index that corresponds to the resulting hash code
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode) % M;
        return index;
    }
    public void put(K key, V value){

    }
    public V get(K key){

    }
    public V remove(K key){

    }
    public boolean contains(V value){

    }
    public K getKey(V value){

    }
}

