
package linkedlistapp;

public class LinkedListApp
{
    public static void main(String[] args)
    {
        LinkedList theList = new LinkedList();
        theList.displayList();
        int i;
//fill-up the LinkedList
        for(i=1; i<10; i++)
        {
            theList.insertFirst(i, (i * 3.1416));
        }
        theList.displayList();
        theList.find(0);
        theList.delete(6);
        theList.delete(4);
        theList.delete(2);
//empty the LinkedList
        while(!theList.isEmpty())
        {
            theList.deleteFirst();
        }
        theList.displayList();
    }
}
