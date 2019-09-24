package chainmode;

import java.util.Objects;

public abstract class MaterialProcessor {
    private MaterialProcessor processor;
    public void process(Material material) {
        System.out.println("当前为处理器为："+this.getProcessName());
        if (canProcess(material)) {
            doProcess(material);
        } else if (Objects.nonNull(processor)) {
            System.out.println("切换处理器...");
            processor.process(material);
        } else {
            fail(material);
        }
    }
    abstract void doProcess(Material material);
    public void fail(Material material) {
        System.out.println("处理结束，"+material.getName()+"不能被处理！");
    }
    public abstract boolean canProcess(Material material);
    public MaterialProcessor setProcessor(MaterialProcessor processor) {
        this.processor = processor;
        return processor;
    }
    abstract String getProcessName();
}
