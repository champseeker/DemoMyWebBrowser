package sg.edu.rp.c346.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://www.rp.edu.sg/soi/full-time-diplomas/details/r47";
                wvMyPage.loadUrl(url);
                WebSettings webSettings = wvMyPage.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.setAllowFileAccess(false);
                webSettings.setBuiltInZoomControls(true);

            }
        });

    }
}
