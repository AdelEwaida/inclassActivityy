//package edu.cs.birzeit.assignment33.;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class CarsActivity extends AppCompatActivity {
//
////    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ArrayAdapter<Cars> listAdapter = new ArrayAdapter<Cars>(this,
//                android.R.layout.simple_list_item_1,
//                Drink.drinks);
//
//        ListView listView = (ListView)findViewById(R.id.main_menu);
//        listView.setAdapter(listAdapter);
//
//        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent,
//                                    View view,
//                                    int position,
//                                    long id) {
//                Intent intent = new Intent(CarsActivity.this,
//                        DrinkDetail.class);
//                intent.putExtra("drink_id", (int)id);
//                startActivity(intent);
//
//            }
//        };
//        listView.setOnItemClickListener(itemClickListener);
//    }
//}
