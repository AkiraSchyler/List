package uaslp.objetos.list.linkedlist;

public class LinkedListIterator {
    Nodo currentNode;
    private void LinkedListIterator(Nodo Head){
        currentNode=Head;
    }
    public String next(){
        String value=currentNode.data;
        currentNode=currentNode.next;
        return value;
    }

    public boolean hasNext() {
        if(currentNode == null) {
            return false;
        } else {
            return true;
        }
    }
}
