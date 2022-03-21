package com.tangwhdev.room;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = Student.class,version = 3,exportSchema = true)
public abstract class MyDataBase extends RoomDatabase {
    public abstract StudentDao studentDao();

    public static MyDataBase instance;

    public static MyDataBase getInstance(Context context) {
        if (instance == null) {
            synchronized (MyDataBase.class){
                if(instance == null){
                    instance = Room
                            .databaseBuilder(context.getApplicationContext(),MyDataBase.class,"my_da.db")
                            .fallbackToDestructiveMigration()
                            .addMigrations(new MIGRATION_1_2(1,2),MIGRATION_2_3)
                            .build();
                }
            }
        }
        return instance;
    }

    static class MIGRATION_1_2 extends Migration{

        /**
         * Creates a new migration between {@code startVersion} and {@code endVersion}.
         *
         * @param startVersion The start version of the database.
         * @param endVersion   The end version of the database after this migration is applied.
         */
        public MIGRATION_1_2(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE Student ADD COLUMN sex INTEGER NOT NULL DEFAULT 1");
        }
    }

    static final Migration MIGRATION_2_3 =  new Migration(2,3){

        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE IF NOT EXISTS temp_student (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `the_age` INTEGER NOT NULL, `sex` TEXT)");
            database.execSQL("INSERT INTO temp_student (name,the_age,sex) SELECT name,the_age,sex from Student");
            database.execSQL("DROP TABLE Student");
            database.execSQL("ALTER TABLE temp_student RENAME TO Student");
        }

    };
}
