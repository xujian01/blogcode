package gson;

/**
 * 自定义链表
 * @author xujian
 * 2021-02-05 14:28
 **/
public class MyOneWayEntry {
    int value;
    MyOneWayEntry next;
    MyOneWayEntry prev;

    public MyOneWayEntry(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(MyOneWayEntry next) {
        this.next = next;
    }

    public void setPrev(MyOneWayEntry prev) {
        this.prev = prev;
    }
}
