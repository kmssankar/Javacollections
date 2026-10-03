package org.javacollections.concurrent.collections;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashmapExample {

    public static void main(String[] args){

        ConcurrentHashMap<Integer, Device> deviceMap = new ConcurrentHashMap<>();
        //deviceMap.putIfAbsent(1, new Device(1, "test", DeviceType.BLE_DEVICE));
        ExecutorService  executorService = Executors.newVirtualThreadPerTaskExecutor();

        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                deviceMap.putIfAbsent(i, new Device(i, "test_"+i, DeviceType.BLE_DEVICE));
            }
        };

        Runnable task2 = () -> {
            for (int i = 1; i <= 10; i++) {
                deviceMap.computeIfPresent(i, (key, value) -> {
                    value.deviceName = "test Computed";
                    return value;
                });
            }
        };
        executorService.submit(task);
        executorService.submit(task2);


        deviceMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

    }
}

enum DeviceType {
    BLE_DEVICE,
    WIFI_DEVICE,

}

class Device {
    int deviceId;
    String deviceName;
    DeviceType deviceType;

    public Device(int deviceId, String deviceName, DeviceType deviceType) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
    }

    @Override
    public boolean equals(Object obj) {
        Device device = (Device) obj;
        return super.equals(device.deviceId == this.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, deviceName, deviceType);
    }

    @Override
    public String toString() {
        return this.deviceId + " " + this.deviceName + " " + this.deviceType;
    }
}
