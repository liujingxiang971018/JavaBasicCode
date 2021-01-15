package cn.itcast.day10.demo07;

public class demo01Main {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.PowerOn();
        //使用USB设备,多态写法
        USB usb=new Mouse();
        computer.usbdevice(usb);

        //创建一个USB键盘
        KeyBoard keyBoard=new KeyBoard();//没有使用多态写法
        //方法参数是usb类型，传递进去的是实现类对象
        computer.usbdevice(keyBoard);//正确写法,也发生了向上转型

        computer.PowerOff();
    }
}
