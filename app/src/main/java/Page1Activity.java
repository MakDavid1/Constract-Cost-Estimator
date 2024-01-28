import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Page1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        Button buttonOption1 = findViewById(R.id.buttonOption1);
        Button buttonOption2 = findViewById(R.id.buttonOption2);

        buttonOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действия при нажатии на Кнопку 1
                goToNextPage(); // Метод для перехода на следующую страницу
            }
        });

        buttonOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действия при нажатии на Кнопку 2
                goToNextPage(); // Метод для перехода на следующую страницу
            }
        });
    }

    // Метод для перехода на следующую страницу
    private void goToNextPage() {
        Intent intent = new Intent(this, Page2Activity.class);
        startActivity(intent);
    }

    // Метод, вызываемый при нажатии на Кнопку 1
    public void onButtonOption1Click(View view) {
        goToNextPage();
    }

    // Метод, вызываемый при нажатии на Кнопку 2
    public void onButtonOption2Click(View view) {
        goToNextPage();
    }
}
