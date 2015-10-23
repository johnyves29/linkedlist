
package linkedlistapp;

public class LinkedList
{
    private ListNode first;
    public LinkedList()
    {
        first = null;
    }
    public void insertFirst(int x, double y)
    {
        ListNode newListNode = new ListNode(x, y);
        newListNode.next = first;
        first = newListNode;
    }
    public void deleteFirst()
    {
        System.out.print("deleting item ");
        first.displayData();
        first = first.next;
    }
    public boolean isEmpty()
    {
        return (first == null);
    }
    public void displayList()
    {
        System.out.println("LinkedList (first-->last)");
        ListNode current = first;
        if(isEmpty())
        {
            System.out.println("The LinkedList is Empty.");
        }
        else
        {
            while(current != null)
            {
                current.displayData();
                current = current.next;
            }
        }
    }
    public void displayListSum()
    {
        ListNode current = first;
        double sum=0;
        if(!isEmpty())
        {
            while(current != null)
            {
                sum += current.getDData();
                current = current.next;
            }
        }
    }
    public boolean find(int key)
    {
        System.out.print("Finding " + key + "...\n");
        ListNode current = first;
        if(!isEmpty())
        {
            while(current != null)
            {
                if(key == current.getIData())
                {
                    System.out.print("EUREKA!\n");
                    return true;
                }
                current = current.next;
                System.out.print(".");
            }
        }
        System.out.print("Not Found!\n");
        return false;
    }
    public void delete(int key)
    {
        ListNode current = first;
        ListNode previous = first;
        if(!isEmpty())
        {
            while(key != current.getIData())
            {
                if(current.next == null)
                {
                    System.out.print("none");
                    return;
                }
                else
                {
                    previous = current;
                    current = current.next;
                }
            }
            if(current == first)
            {
                deleteFirst();
            }
            else
            {
                System.out.print("removing " + current.getIData() + "...");
                previous.next = current.next;
            }
        }
    }
}
