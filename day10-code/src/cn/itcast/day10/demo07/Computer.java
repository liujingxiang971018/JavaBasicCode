package cn.itcast.day10.demo07;

public class Computer {
    public void PowerOn(){
        System.out.println("笔记本开机");
    }
    public void PowerOff(){
        System.out.println("笔记本关机");
    }
    //使用USB设备的方法
    public void usbdevice(USB usb){
        usb.open();
        usb.close();

        //如果各自usb还有特有方法，则需要使用instanceof关键词进行判断，再使用其特有方法。
    }
}
