package com.example.ecg;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class BluetoothLiveData {
    public List<Integer> values;

    public BluetoothLiveData(List<Integer> es) {
        this.values = es;
    }
}
