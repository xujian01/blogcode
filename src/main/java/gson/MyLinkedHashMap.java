package gson;

/**
 * 自定义简易LinkedHashMap
 * @author xujian
 * 2021-02-05 15:17
 **/
public class MyLinkedHashMap {
    MyLinkedHashMap.MyDoubleLinkEntry head;

    public void setHead(MyDoubleLinkEntry head) {
        this.head = head;
    }

    static class MyDoubleLinkEntry {
        MyDoubleLinkEntry before;
        MyDoubleLinkEntry after;
        int value;

        public MyDoubleLinkEntry(int value) {
            this.value = value;
        }

        public void setBefore(MyDoubleLinkEntry before) {
            this.before = before;
        }

        public void setAfter(MyDoubleLinkEntry after) {
            this.after = after;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
