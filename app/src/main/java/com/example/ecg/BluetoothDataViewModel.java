package com.example.ecg;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class BluetoothDataViewModel extends ViewModel {


    private final MutableLiveData<BluetoothLiveData> data =
            new MutableLiveData<>(
                    new BluetoothLiveData(new ArrayList<>())
            );


    public void addReading(final int value) {
        final List<Integer> tmp = this.data.getValue().values;
        tmp.add(value);

        this.data.postValue(new BluetoothLiveData(tmp));
    }
    public MutableLiveData<BluetoothLiveData> getReadings() {
        return this.data;
    }


}

