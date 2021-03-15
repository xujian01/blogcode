package javaagent.demo;

import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

/**
 * @author xujian
 * 2021-03-12 13:45
 **/
public class MyAttachMain {
    public static void main(String[] args) {
        VirtualMachine vm = null;
        try {
            vm = VirtualMachine.attach("3188");//MyBizMain进程ID
            vm.loadAgent("/Users/jarry/IdeaProjects/agent-demo/target/agent-demo-1.0-SNAPSHOT.jar");//java agent jar包路径
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (vm != null) {
                try {
                    vm.detach();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
