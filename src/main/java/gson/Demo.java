package gson;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author xujian
 * 2021-02-08 13:39
 **/
public class Demo {
    public static void main(String[] args) {
        MyOneWayEntry myOneWayEntry2 = new MyOneWayEntry(2);
        MyOneWayEntry myOneWayEntry1 = new MyOneWayEntry(1);
        //让myOneWayEntry2的prev指针指向myOneWayEntry1
        myOneWayEntry2.setPrev(myOneWayEntry1);
        //让myOneWayEntry1的next指针指向myOneWayEntry2
        myOneWayEntry1.setNext(myOneWayEntry2);
        Gson gson = new Gson();
        System.out.println(gson.toJson(myOneWayEntry1));

        MyLinkedHashMap myLinkedHashMap = new MyLinkedHashMap();
        MyLinkedHashMap.MyDoubleLinkEntry first = new MyLinkedHashMap.MyDoubleLinkEntry(1);
        MyLinkedHashMap.MyDoubleLinkEntry second = new MyLinkedHashMap.MyDoubleLinkEntry(2);
        first.setAfter(second);
        second.setBefore(first);
        myLinkedHashMap.setHead(first);
        System.out.println(gson.toJson(myLinkedHashMap));

        Map<String,Object> map = new LinkedHashMap<>();
        map.put("name","xujian");
        map.put("age",23);
        for (Map.Entry<String,Object> entry : map.entrySet()) {
            System.out.println(gson.toJson(entry));
        }
        System.out.println(gson.toJson(map));
    }
}
