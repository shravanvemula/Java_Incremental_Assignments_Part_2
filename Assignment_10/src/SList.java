public class SList<E>  {

     SLLNode<E> head=new SLLNode<>(null);
     SListIterator<E> iterator;

    SList(){
        iterator=new SListIterator<E>(head);
    }
    public  SListIterator<E> iterator()
    {
        return iterator;
    }
    public String toString() {


        SListIterator<E> it = this.iterator();
        if(it.getHead() == null) return "SList: []";  //if List is empty

        StringBuilder s = new StringBuilder();

        while(it.hasNext()) {

            s.append(it.next() + (it.hasNext() ? ", " : ""));
        }
        it.setCurrentNode();
        return "SList: [" + s.toString() + "]";
    }

}



