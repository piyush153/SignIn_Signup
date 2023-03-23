package com.piyush.taskfirst.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.piyush.taskfirst.modals.DataModel;
import com.piyush.taskfirst.repository.SetRepository;

import java.util.List;

public class ViewModal extends AndroidViewModel {

    SetRepository setRepository;
    LiveData<List<DataModel>> userList;

    public ViewModal(@NonNull Application application) {
        super(application);
        setRepository=new SetRepository(application);
        userList=setRepository.userDetails();
    }
}
