public class Test {
    public static void main(String[] args)
    {
        // 创建一个CPU对象并设置它的speed
        CPU cpu = new CPU();
        cpu.setSpeed(2200);  // 设置CPU的速度为2200

        // 创建一个HardDisk对象并设置它的amount
        HardDisk disk = new HardDisk();
        disk.setAmount(200);  // 设置硬盘的容量为200

        // 创建一个PC对象
        PC pc = new PC();

        // 调用setCPU方法，将cpu对象设置到PC中
        pc.setCPU(cpu);

        // 调用setHardDisk方法，将disk对象设置到PC中
        pc.setHardDisk(disk);

        // 调用PC的show方法，显示CPU和硬盘信息
        pc.show();
    }
}

