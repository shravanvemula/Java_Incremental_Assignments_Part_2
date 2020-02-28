public class SListIterator<E> {

    int size;
    SLLNode<E> currentNode;
    SLLNode<E> head;

    public SListIterator(SLLNode<E> head)
    {

        size=0;
        this.head=head;


    }

    public void setCurrentNode(){
        currentNode=head.next;
    }
    public SLLNode<E> getHead(){
        return head.next;
    }

    public boolean hasNext()
    {
        return currentNode != null;
    }

    public E next()
    {
        E data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }

    public void insert(E data){

        SLLNode<E> newNode=new SLLNode<E>(data);
        SLLNode<E> temp=currentNode;
        if(currentNode==null){
            currentNode=newNode;

            head.next=currentNode;
        }
        else {


            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;


        }

        size++;

    }


    public void remove()
    {
        E removedValue;
        if(size>1) {
            SLLNode<E> secondLast = currentNode;
            while (secondLast.next!=null && secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            removedValue = secondLast.next.data;
            System.out.println("Removed name is "+removedValue);
            secondLast.next = null;
            size--;

        }
        else if(size==1){
            removedValue = currentNode.data;
            currentNode=null;
            System.out.println("Removed name is "+removedValue);
            size--;
        }
        else if(size==0){
            System.out.println("Name cannot be removed as list is empty");
        }


    }


}
