package com.piyush.taskfirst.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.piyush.taskfirst.database.DatabaseHelper;
import com.piyush.taskfirst.database.UserDao;
import com.piyush.taskfirst.modals.DataModel;

import java.util.List;

public class SetRepository {

    public UserDao userDao;
    public DatabaseHelper databaseHelper;
    public LiveData<List<DataModel>> userlist;

    public  SetRepository(Application application){

        databaseHelper=DatabaseHelper.getDB(application);
        //userDao = databaseHelper.userDao();
        userlist= (LiveData<List<DataModel>>)  databaseHelper.userDao().getAllDetails();
    }

    public  LiveData<List<DataModel>> userDetails(){
        return userlist;

    }

    public void insertUsers(final DataModel dataModel){
        new AsyncTask<Void,Void,Void>(){
            @Override
            protected Void doInBackground(Void... voids){
                databaseHelper.userDao().addTx(dataModel);
                return null;
            }
        }.execute();
    }

}
