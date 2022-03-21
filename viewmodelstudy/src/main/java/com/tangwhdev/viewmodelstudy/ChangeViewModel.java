package com.tangwhdev.viewmodelstudy;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChangeViewModel extends ViewModel {
    MutableLiveData<Integer> progress = new MutableLiveData<>();

    public Integer getProgress() {
        return progress.getValue();
    }

    public void setProgress(int progress) {
        this.progress.setValue(progress);
    }
}
