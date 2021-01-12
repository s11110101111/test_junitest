package org.example.test_junitest.sobes.colections_maps;

import org.example.test_junitest.sobes.bitwise_bit_shift_operators.BitUtils;
import org.example.test_junitest.sobes.enum_test.ColorANSI;

import java.util.Objects;

public class Hash_Map<K, V> {


    static class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V newValue) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        public int HashCode() {
            int k = Objects.hashCode(key);
            int v = Objects.hashCode(value);
            System.out.println("HashCode node \n" + BitUtils.intBinaryToString(k));
            System.out.println(BitUtils.intBinaryToString(v));
            int code = k ^ v;
            System.out.println(BitUtils.intBinaryToString(code));
            return code;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;

            Node<?, ?> node = (Node<?, ?>) o;

            if (Objects.equals(key, node.getKey()) && Objects.equals(value, node.getValue())) {
                return true;
            }
            return false;
        }


        public String toString() {
            return ColorANSI.GREEN.fillColor(key + " = " + value);
        }
    }
}
