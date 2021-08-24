package pl.kru.USBdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();


}
