public class PC {
    private CPU cpu;
    private HardDisk HD;

    public void setCPU(CPU c) {
        cpu = c;
    }

    public void setHardDisk(HardDisk h) {
        HD = h;
    }

    public void show() {
        System.out.println("CPU速度：" + cpu.getSpeed());
        System.out.println("硬盘容量：" + HD.getAmount());
    }
}

