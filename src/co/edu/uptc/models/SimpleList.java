package co.edu.uptc.models;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import co.edu.uptc.pojos.Node;

public class SimpleList <T> implements List<T>{

    private Node<T> head;
    private Node<T> last;

    public boolean add(T info) {
        Node<T> newNode = new Node<T>();
        newNode.setData(info);
        if(head == null) {
            head = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        return true;
    }

    public void showList() {
        Node<T> current = head;
        while(current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public T get(int index) {
        Node<T> current = head;
        int count = 0;
        while(current != null) {
            if(count == index) {
                return current.getData();
            }
            count++;
            current = current.getNext();
        }
        throw new IndexOutOfBoundsException("Index: " + index);
    }
    
    @Override
    public T set(int index, T element) {
        int conta=0;
        Node<T> aux = head;
        while (aux != null) {
            if (conta==index) {
                aux.setData(element);
                return aux.getData();
            }
            aux = aux.getNext();
            conta++;
        }
        return null;
    }

    public int size() {
        Node<T> current = head;
        int count = 0;
        while(current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @SuppressWarnings("hiding")
    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public void add(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }
}
