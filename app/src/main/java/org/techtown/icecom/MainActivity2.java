package org.techtown.icecom;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {
    private ArrayList<MyItem>data =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView = (ListView) findViewById(R.id.listView);
        EditText editText1 = (EditText)findViewById(R.id.editText1) ;
        EditText editText2 = (EditText)findViewById(R.id.editText2) ;
        EditText editText3 = (EditText)findViewById(R.id.editText3) ;
        data=new ArrayList<>();
        MyItem m1=new MyItem("진라면","950원","진라면은 오뚜기라면이 제조하고 오뚜기가 판매하는 라면이다. 맛의 종류로는 순한맛과 매운맛의 두 가지 종류가 있으며, 컵라면 타입으로 진라면큰컵과 미니컵타입 순한맛과 매운맛 2가지가 더 있다.",R.drawable.ramen1,R.drawable.ramen11);
        MyItem m2=new MyItem("참깨라면","1200원","밥과 가장 잘 어울리는 라면으로 손 꼽힌다. 국물 자체가 얼큰한 편이고, 여기에 계란 블럭 건더기와 조미 참기름과 참깨의 고소한 맛이 더해져 다른 라면에 밥을 말아 먹는 것과는 차원이 다른 맛을 자랑한다.",R.drawable.ramen2,R.drawable.ramen22);
        MyItem m3=new MyItem("신라면","950원","대한민국의 인스턴트 라면. 1986년부터 주식회사 농심에서 생산하고 있다. 인스턴트 라면 시장에서 2021년 기준 판매 순위 1위를 지키고 있다. 라면계의 베스트셀러이자 스테디셀러로, 지금의 농심을 만든 일등 공신. 또한 현재 한국인들에게 \"라면\"하면 항상 떠오르는 가장 유명한 국민라면이기도 하다.",R.drawable.ramen3,R.drawable.ramen33);
        MyItem m4=new MyItem("육개장 사발면","850원","육개장에서 이름을 딴 것으로 추정되는 농심의 컵라면. 정식명칭은 '육개장 사발면'이다.\n출시 이후 39년째 오랫동안 계속 우리나라 컵라면 판매량 부동의 1위를 계속 차지하고 있는 대한민국 대표 국민 컵라면.",R.drawable.ramen4,R.drawable.ramen44);
        MyItem m5=new MyItem("진짬뽕","1350원","오뚜기에서 진짜장이 발매된 후에 출시된 해물짬뽕라면으로 북경짬뽕의 프리미엄 제품에 해당된다. 굵은 면발의 매운 해물맛 라면이다.",R.drawable.ramen5,R.drawable.ramen55);
        MyItem m6=new MyItem("앵그리 짜파구리","500원","농심의 인스턴트 라면 제품인 짜파게티와 너구리를 섞은 요리다. 너구리의 굵은 면과 매운 스프가 짜파게티와 잘 어울려 일반적인 짜파게티에서 조금 더 쫄깃하고 매콤한 맛이 난다.",R.drawable.ramen6,R.drawable.ramen66);
        MyItem m7=new MyItem("인생 라면","1500원","GS 유어스 PB상품. 제품명 자체가 말 그대로 인생라면이다. 주로 용기면으로 판매 되지만 봉지면도 생산 및 판매되고 있다.",R.drawable.ramen7,R.drawable.ramen77);
        MyItem m8=new MyItem("틈새 라면","1500원","명동 어느 골목에 있는 동명의 라면전문점 특제메뉴 '빨계떡' 을 상품화한 것으로 맵고 화끈한 맛으로 유명한 음식이다. 메뉴명의 의미는 빨간국물에 계란과 떡이 들어간 라면이라는 뜻.",R.drawable.ramen8,R.drawable.ramen88);
        MyItem m9=new MyItem("짜파게티","1050원","춘장을 이용한 짜장 소스를 가루분말화하여 만든 제품이지만, 라면의 식감이 짜장면의 면발과 다르고, 소스 맛도 미묘하게 다르기 때문에 결과적으로 짜장면 맛과는 거리가 멀어졌다.",R.drawable.ramen9,R.drawable.ramen99);
        MyItem m10=new MyItem("왕뚜껑","1050원"," 특징은 뭐니뭐니해도 스낵면처럼 얇은 면발이다. 농심 육개장 사발면과 마찬가지로 얇은 면발의 선두주자들이며, 면을 호로록 빠르게 먹기 좋아하는 사람들에게 적합한 라면이다.",R.drawable.ramen10,R.drawable.ramen1010);
        data.add(m1);
        data.add(m2);
        data.add(m3);
        data.add(m4);
        data.add(m5);
        data.add(m6);
        data.add(m7);
        data.add(m8);
        data.add(m9);
        data.add(m10);
        MyAdapter adapter=new MyAdapter(this,R.layout.activity_my_item,data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Intent intent=new Intent(getApplicationContext(),RamenDetail.class);
                intent.putExtra("resId", Integer.toString(data.get(position).getResId()));
                intent.putExtra("resId2", Integer.toString(data.get(position).getResId2()));
                intent.putExtra("name", data.get(position).getName());
                intent.putExtra("explain", data.get(position).getExplain());
                intent.putExtra("explain2", data.get(position).getExplain2());
                startActivity(intent);
            }
        });
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText1.getText().toString();
                String price = editText2.getText().toString();
                String explain = editText3.getText().toString();
                adapter.addItem(new MyItem(name,price,explain, R.drawable.photo,R.drawable.photo));
                adapter.notifyDataSetChanged();
            }
        });
    }
    class MyAdapter extends BaseAdapter{
        private LayoutInflater inflater;
        private ArrayList<MyItem> data;
        private int layout;
        public MyAdapter(Context context, int layout, ArrayList<MyItem> data) {
            this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.data = data;
            this.layout = layout;
        }
        @Override
        public int getCount(){
            return data.size();
        }
        public void addItem(MyItem item){
            data.add(item);
        }
        @Override
        public Object getItem(int position) {
            return data.get(position);
        }
        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final MyItem potion=data.get(position);
            if (convertView == null) {
                convertView = inflater.inflate(layout, parent, false);
            }
            MyItem myItem = data.get(position);

            ImageView profile = (ImageView) convertView.findViewById(R.id.imageView);
            profile.setImageResource(myItem.getResId());

            TextView name = (TextView) convertView.findViewById(R.id.textView1);
            name.setText(myItem.getName());
            return convertView;
        }
        }
    }
