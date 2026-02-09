package com.akinalbayrak.dicerollerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // XML'deki bileşenleri (Button ve ImageView) Java tarafına bağlıyoruz.
        ImageView diceImage = findViewById(R.id.diceImage);
        Button rollButton = findViewById(R.id.rollButton);

        // Butona tıklandığında yapılacak işlemler:
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1 ile 6 arasında rastgele bir tam sayı üretir.
                java.util.Random random = new java.util.Random();
                int sayi = random.nextInt(6) + 1;
                System.out.println("Zar atıldı: " + sayi);

                // Üretilen sayıya göre drawable klasöründeki resmi ImageView'da gösterir.
                if (sayi == 1) {
                    diceImage.setImageResource(R.drawable.dice1);
                } else if (sayi == 2) {
                    diceImage.setImageResource(R.drawable.dice2);
                } else if (sayi == 3) {
                    diceImage.setImageResource(R.drawable.dice3);
                } else if (sayi == 4) {
                    diceImage.setImageResource(R.drawable.dice4);
                } else if (sayi == 5) {
                    diceImage.setImageResource(R.drawable.dice5);
                } else {
                    diceImage.setImageResource(R.drawable.dice6);
                }
            }
        });
    }
}