
package linkedlistapp;


public class ListNode
{
    private int xData;
    private double yData;
    public ListNode next;
    public ListNode(int x, double y)
    {
        xData = x;
        yData = y;
    }
    public ListNode(int x, double y, ListNode obj)
    {
        xData = x;
        yData = y;
        next = obj;
    }
    public double getDData()
    {
        return yData;
    }
    public int getIData()
    {
        return xData;
    }
    public void displayData()
    {
        System.out.println("{xData:" + xData +
                           ",yData:" + yData + "}");
    }
}
