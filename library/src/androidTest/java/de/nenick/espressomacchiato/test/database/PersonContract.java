package de.nenick.espressomacchiato.test.database;

import android.provider.BaseColumns;

public class PersonContract {

    public static final String SQL_CREATE =
            "CREATE TABLE " + Entry.TABLE_NAME + " (" +
                    Entry._ID + " INTEGER PRIMARY KEY," +
                    Entry.COLUMN_NAME + " TEXT" + " )";

    public static abstract class Entry implements BaseColumns {
        public static final String TABLE_NAME = "person";
        public static final String COLUMN_NAME = "name";
    }
}
