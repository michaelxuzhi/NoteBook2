package com.example.michaelxuzhi.notebook2;

        import android.app.Activity;
        import android.content.ContentValues;
      //import android.content.Intent;
        import android.database.sqlite.SQLiteDatabase;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

        import java.util.Date;
        import java.text.SimpleDateFormat;

public class Addcontent extends Activity implements View.OnClickListener {


    private EditText ettext;
    private SQLiteDatabase dbWriter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_list);
        Button savebtn = (Button) findViewById(R.id.add_save);
        Button deletebtn = (Button) findViewById(R.id.add_delete);
        ettext = (EditText) findViewById(R.id.add_etv);
        savebtn.setOnClickListener(this);
        deletebtn.setOnClickListener(this);
        NotesDB notesDB = new NotesDB(this);
        dbWriter = notesDB.getWritableDatabase();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_save:
                addDB();
                finish();
                break;
            case R.id.add_delete:
                finish();
                break;
        }
    }

    private void addDB() {
        ContentValues cv = new ContentValues();
        cv.put(NotesDB.CONTENT, ettext.getText().toString());
        cv.put(NotesDB.TIME, getTime());
        dbWriter.insert(NotesDB.TABLE_NAME, null, cv);
    }

    public String getTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss");
        Date curDate = new Date();
        String str = format.format(curDate);
        return str;
    }
}