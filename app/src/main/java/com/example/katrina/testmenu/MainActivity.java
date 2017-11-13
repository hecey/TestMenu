package com.example.katrina.testmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        //createMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
        //return menuChoice(item);
    }
//    private void createMenu(Menu menu) {
//        MenuItem mnu1 = menu.add(0, 0, 0, "Item 1");
//        {
//            mnu1.setAlphabeticShortcut('a');
//        }
//        MenuItem mnu2 = menu.add(0, 1, 1, "Item 2");
//        {
//            mnu2.setAlphabeticShortcut('b');
//        }
//        MenuItem mnu3 = menu.add(0, 2, 2, "Item 3");
//        {
//            mnu3.setAlphabeticShortcut('c');
//        }
//        MenuItem mnu4 = menu.add(0, 3, 3, "Item 4");
//        {
//            mnu4.setAlphabeticShortcut('d');
//        }
//        menu.add(0, 4, 4, "Item 5");
//        menu.add(0, 5, 5, "Item 6");
//        menu.add(0, 6, 6, "Item 7");
//    }
//
//    private boolean menuChoice(MenuItem item) {
//        switch (item.getItemId()) {
//            case 0:
//                Toast.makeText(this, "You clicked on Item 1",
//                        Toast.LENGTH_LONG).show();
//                return true;
//            case 1:
//                Toast.makeText(this, "You clicked on Item 2",
//                        Toast.LENGTH_LONG).show();
//                return true;
//            case 2:
//                Toast.makeText(this, "You clicked on Item 3",
//                        Toast.LENGTH_LONG).show();
//                return true;
//            case 3:
//                Toast.makeText(this, "You clicked on Item 4",
//                        Toast.LENGTH_LONG).show();
//                return true;
//            case 4:
//                Toast.makeText(this, "You clicked on Item 5",
//                        Toast.LENGTH_LONG).show();
//                return true;
//            case 5:
//                Toast.makeText(this, "You clicked on Item 6",
//                        Toast.LENGTH_LONG).show();
//                return true;
//            case 6:
//                Toast.makeText(this, "You clicked on Item 7",
//                        Toast.LENGTH_LONG).show();
//                return true;
//        }
//        return false;
//    }
}
