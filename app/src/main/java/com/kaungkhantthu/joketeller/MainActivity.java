package com.kaungkhantthu.joketeller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextView txt_title,txt_content;
Button btn_next,btn_previous;
    ImageView img_joke;
RadioButton rdbtn_funny,rdbtn_sofunny;
    ArrayList<Jokes> jokesList;
    int currentindex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        jokesList = new ArrayList<>();
        jokesList.add(new Jokes(R.drawable.joke_1,"အညီအမျှ","နောက်တစ်နှစ်ပေါ့\n" +
                "လင်မယား ၂ ယောက်စကားများရန်ဖြစ်ရာမှကွာရှင်းပြတ်ဆဲရန်တရားရုံးတွင်စီစဉ်နေကြသည်\n" +
                "တရားသူကြီး : မင်းတို့မှာကလေး ၃ ယောက်ရှိတာဘယ်လိုခွဲမလဲ?\n" +
                "လင်မယား ၂ ယောက်တွေဝေသွားပြီးမိနစ်အနည်းငယ်ကြာစဉ်းစားကာ 'တရားသူကြီးမင်းခင်ဗျား ကျနော်တို့တစ်နှစ်တာအချိန်အတွင်းနောက်တစ်ယောက်ထပ်မွေးပြီးပြန်လာခဲ့ပါ့မယ်' ဟုပြောလိုက်သည်။\n" +
                "၉ လခန့်ကြာသော် အမြွှာပူးလေးမွေးလေသည်။"));

        jokesList.add(new Jokes(R.drawable.joke_2,"အလျှင်မလိုပါ\n",
                        "ပြေးနေသော ပီတာလေး နောက်ကို ရဲသား တစ်ဦး ပြေးလိုက်နေသည်ကို၊ လမ်းထောင့်တွင်ရပ်နေသော ရဲမှုးကြီး တွေ့သဖြင့် လှမ်းမေးလိုက်သည်။ \n" +
                                "\"ဟေ့ . .ရဲသား . . မင်းဘာလို့ ဟိုကလေး နောက်ကို အတင်း ပြေးလိုက်နေရတာလဲ\"\n" +
                                "\"သူ ကျွန်တော့်ကို . . နောက် ဆယ့်ငါးမိနစ်ကြာရင် ဖင်ကို လာနမ်းလှည့်လို့ ပြောလို့ပါ ရဲမှုးကြီး\"\n" +
                                "\"နောက်ဆယ့်ငါးမိနစ်မှဆို အချိန်ရသားပဲ၊ ဘာလို့ အတင်းပြေးလိုက်နေတာလဲ\"\n"));
        jokesList.add(new Jokes(R.drawable.joke_3,"တိုင်းပြည်ကို ချောက်ထဲမကျအောင် ကယ်လိုက်လို့ပါ\n",
                       "ဆင်းရဲရာမှ အလွန်ချမ်းသာလာသော သဌေးများကို သတင်းတစ်ခုမှ အင်တာဗျူးသည်။\n" +
                               "U.S သဌေး။ ။ ကျွန်တော် နယူးယောက်ကိုစရောက်တုန်းက တော်တော်ဆင်းရဲတာဗျ။ လက်ထဲမှာ ဆင့် ၅၀ ပဲပါတာနဲ့ ပန်းသီးတစ်လုံးဝယ်တယ်။ ၁ ဒေါ်လာနဲ့ပြန်ရောင်းတယ်။ နောက်ပန်းသီးနှစ်လုံး ဝယ်တယ် ထပ်ရောင်းတယ်\n" +
                               "သတင်းထောက်။ ။ ဒီလိုနဲ့များလာတာပေါ့\n" +
                               "U.S သဌေး။ ။ မဟုတ်ဘူးဗျ ပန်းသီးရောင်းနေရင်း အဒေါ်ဆုံးသွားလို့ ဒေါ်လာတစ်သန်း အမွေရတယ်လေ\n" +
                               "---------------------------------------\n" +
                               "Russia သဌေး။ ။ ကျွန်တော်အခုနေတဲ့ စံအိမ်ကြီးက အရင်က ကျွန်တော် ဒရိုက်ဘာလုပ်ခဲ့တာပေါ့။\n" +
                               "သတင်းထောက်။ ။ အော် ဒရိုက်ဘာဘဝကနေ သဌေးဖြစ်အောင် ဘယ်လိုလုပ်ခဲ့ရလဲ။\n" +
                               "Russia သဌေး။ ။ စံအိမ်ပိုင်ရှင်သဌေးကြီးရဲ့ သမီးနဲ့ညားသွားတယ်လေ\n" +
                               "---------------------------------------\n" +
                               "သတင်းထောက်စိတ်ပျက်လက်ပျက်နှင့်မြန်မာနိုင်ငံရောက်လာသည်။\n" +
                               "သတင်းထောက်။ ။ ဟိုလေ ခုလို ကျိကျိတက်ချမ်းသာလာတာဘယ်လိုချမ်းသာလာလဲသိချင်လို့ပါ။\n" +
                               "ဘဘကြီး လက်ထဲက ဖတ်လက်စ စာအုပ်ကိုချပြီး မျက်မှောင်ကြုံ့ကြည့်သည်။\n" +
                               "ဘဘကြီး။ ။ ဒါကရှင်းပါတယ်။ တိုင်းပြည်ချောက်ထဲမကျအောင် ကယ်လိုက်ပါတယ်"));

        btn_next = (Button) findViewById(R.id.btn_next);
        btn_previous = (Button) findViewById(R.id.btn_previous);
        txt_title = (TextView)findViewById(R.id.txt_title);
        txt_content = (TextView) findViewById(R.id.txt_content);
        img_joke = (ImageView)findViewById(R.id.img_joke);
        rdbtn_funny = (RadioButton) findViewById(R.id.rdBtn_funny);
        rdbtn_sofunny = (RadioButton) findViewById(R.id.rdBtn_sofunny);


        setData();
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentindex < jokesList.size()-1){
                    ++currentindex;
                            setData();
                }else if(currentindex ==  jokesList.size()-1){
                    Toast.makeText(MainActivity.this, "There is no more item", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentindex > 0){
                    currentindex--;
                    setData();
                }else if(currentindex ==  0){
                    Toast.makeText(MainActivity.this, "There is no previous item", Toast.LENGTH_SHORT).show();
                }
            }
        });
       rdbtn_funny.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               jokesList.get(currentindex).setSoFunny(false);
           }
       });
        rdbtn_sofunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jokesList.get(currentindex).setSoFunny(true);
            }
        });
    }

    private void setData(){
        txt_title.setText(jokesList.get(currentindex).getTitle());
        txt_content.setText(jokesList.get(currentindex).getContent());
        img_joke.setImageResource(jokesList.get(currentindex).getImage());
        if(jokesList.get(currentindex).isSoFunny()){
            rdbtn_sofunny.setChecked(true);
        }else rdbtn_funny.setChecked(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
