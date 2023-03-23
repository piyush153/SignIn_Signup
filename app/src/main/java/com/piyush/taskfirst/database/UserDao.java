package com.piyush.taskfirst.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.piyush.taskfirst.modals.DataModel;

import java.util.List;

@Dao
public interface UserDao {

        @Query("select * from details")
         List<DataModel> getAllDetails();

        @Insert
        void addTx(DataModel details);

        @Update
        void updateTx(DataModel details);

        @Delete
        void deleteTx(DataModel details);
}


