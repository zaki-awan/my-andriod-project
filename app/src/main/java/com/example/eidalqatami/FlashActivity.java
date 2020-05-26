package com.example.eidalqatami;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import android.os.Handler;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FlashActivity extends AppCompatActivity {

    private TextView txtTimerDay, txtTimerHours, txtTimerMinutes, txtTimerSeconds;
    private Handler handler;
    private Runnable runnable;

    private TextView iphoneproTimerDay, iphoneProHours, iphoneProMinutes, iphoneProSeconds;
    private  Handler handleriphonePro;
    private Runnable runnableiphonePro;

    private TextView iphonesevenTimerDay, iphonesevenTimerHours, iphonesevenTimerMinutes, iphonesevenTimerSeconds;
    private Handler handleriphonesevenplus;
    private Runnable runnableiphonesevenplus;

    private TextView iphoneeightplusTimerDay, iphoneeightplusTimerHour, iphoneeightplusTimerMinutes, iphoneeightplusTimerSeconds;
    private Handler handleriphoneeightplus;
    private Runnable runnableiphoneeightplus;

    private TextView aplleipadairTimerDay, appleipadairTimerHour, appleipadairTimerMinutes, appleipadairTimerSeconds;
    private Handler handlerappleipadair;
    private Runnable runnableappleipadair;

    private TextView huaweimediapadTimerDay, huaweimediapadTimerHour, huaweimediapadTimerMinutes, huaweimediapadTimerSeconds;
    private Handler handlerhuaweimediapad;
    private Runnable runnablehuaweimediapad;

    private TextView galaxytabTimerDay, galaxytabTimerHours, galaxytabTimerMinutes,galaxytabTimerSeconds;
    private Handler handlergalaxytab;
    private Runnable runnablegalaxytab;

    private TextView philipsledTimerDay, philipsledTimerHours, philipsledTimerMinutes, philipsledTimerSeconds;
    private Handler handlerphilipsled;
    private Runnable runnablephilipsled;

    private TextView huaweibandwathTimerDay, huaweibandwathTimerHours, huaweibandwathTimerMinutes, huaweibandwathTimerSeconds;
    private Handler handlerhuaweibandwath;
    private Runnable runnablehuaweibandwath;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String title = getIntent().getStringExtra("");
        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


///// countdown Timer

        txtTimerDay = (TextView) findViewById(R.id.txtTimerDay);
        txtTimerHours = (TextView) findViewById(R.id.txtTimerHours);
        txtTimerMinutes = (TextView) findViewById(R.id.txtTimerMinutes);
        txtTimerSeconds = (TextView) findViewById(R.id.txtTimerSeconds);

        countDownStart();

 ///// iphone Pro Timer


        iphoneproTimerDay = (TextView) findViewById(R.id.iphoneprotxtTimerDay);
        iphoneProHours = (TextView) findViewById(R.id.iphoneprotxtTimerHours);
        iphoneProMinutes = (TextView) findViewById(R.id.iphoneprotxtTimerMinutes);
        iphoneProSeconds = (TextView) findViewById(R.id.iphoneprotxtTimerSeconds);

        countDown1Start();

//// iphone7plus timer

        iphonesevenTimerDay = (TextView) findViewById(R.id.iphone7TimerDay);
        iphonesevenTimerHours = (TextView) findViewById(R.id.iphone7TimerHours);
        iphonesevenTimerMinutes = (TextView) findViewById(R.id.iphone7TimerMinutes);
        iphonesevenTimerSeconds = (TextView) findViewById(R.id.iphone7TimerSeconds);

        countDown2Start();

///// iphone eight plus timer

        iphoneeightplusTimerDay = (TextView) findViewById(R.id.iphone8plusTimerDay);
        iphoneeightplusTimerHour = (TextView) findViewById(R.id.iphone8plusTimerHours);
        iphoneeightplusTimerMinutes = (TextView) findViewById(R.id.iphone8plusTimerMinutes);
        iphoneeightplusTimerSeconds = (TextView) findViewById(R.id.iphone8plusTimerSeconds);

        countDown3Start();

///// apple ipad air timer

        aplleipadairTimerDay = (TextView) findViewById(R.id.appleipadairTimerDay);
        appleipadairTimerHour = (TextView) findViewById(R.id.appleipadairTimerHours);
        appleipadairTimerMinutes = (TextView) findViewById(R.id.appleipadairTimerMinutes);
        appleipadairTimerSeconds = (TextView) findViewById(R.id.appleipadairTimerSeconds);

        countDown4start();

//// huaweimediapad timer

        huaweimediapadTimerDay = (TextView) findViewById(R.id.huaweimediapadTimerDay);
        huaweimediapadTimerHour = (TextView) findViewById(R.id.huaweimediapadTimerHours);
        huaweimediapadTimerMinutes = (TextView) findViewById(R.id.huaweimediapadTimerMinutes);
        huaweimediapadTimerSeconds = (TextView) findViewById(R.id.huaweimediapadTimerSeconds);

        countDownhuaweimediapadstart();

//// samsun galaxy tab timer

        galaxytabTimerDay = (TextView) findViewById(R.id.galaxytabTimerDay);
        galaxytabTimerHours = (TextView) findViewById(R.id.galaxytabTimerHours);
        galaxytabTimerMinutes = (TextView) findViewById(R.id.galaxytabTimerMinutes);
        galaxytabTimerSeconds = (TextView) findViewById(R.id.galaxytabTimerSeconds);

        countDowngalaxytabstart();

//// Philips Samart Led

        philipsledTimerDay = (TextView) findViewById(R.id.philipsledTimerDay);
        philipsledTimerHours = (TextView) findViewById(R.id.philipsledTimerHours);
        philipsledTimerMinutes = (TextView) findViewById(R.id.philipsledTimerMinutes);
        philipsledTimerSeconds = (TextView) findViewById(R.id.philipsledTimerSeconds);

        countDownphilipsledstart();

////// huaweib andwath Timer

        huaweibandwathTimerDay= (TextView) findViewById(R.id.huaweibandwathTimerDay);
        huaweibandwathTimerHours= (TextView) findViewById(R.id.huaweibandwathTimerHours);
        huaweibandwathTimerMinutes= (TextView) findViewById(R.id.huaweibandwathTimerMinutes);
        huaweibandwathTimerSeconds= (TextView) findViewById(R.id.huaweibandwathTimerSeconds);

        countDownhuaweibandwathstart();









    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.main_search_icon) {
            return true;
        } else if (id == android.R.id.home) {
            finish();
            return true;

        }
        return super.onOptionsItemSelected(item);

    }

    public void countDownStart() {

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtTimerDay.setText("" + String.format("%02d", days));
                        txtTimerHours.setText("" + String.format("%02d", hours));
                        txtTimerMinutes.setText(""
                                + String.format("%02d", minutes));
                        txtTimerSeconds.setText(""
                                + String.format("%02d", seconds));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        };

        handler.postDelayed(runnable, 1 * 1000);


    }

    public void countDown1Start(){

        handleriphonePro = new Handler();

        runnableiphonePro = new Runnable() {
            @Override
            public void run() {
                handleriphonePro.postDelayed(this,1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        iphoneproTimerDay.setText("" + String.format("%02d", days));
                        iphoneProHours.setText("" + String.format("%02d", hours));
                        iphoneProMinutes.setText(""
                                + String.format("%02d", minutes));
                        iphoneProSeconds.setText(""
                                + String.format("%02d", seconds));

                    }
            }catch (Exception e){

                    e.printStackTrace();
                }
            }
        };

        handleriphonePro.postDelayed(runnableiphonePro, 1 * 1000);
    }


    public void countDown2Start(){

        handleriphonesevenplus = new Handler();
        runnableiphonesevenplus = new Runnable() {
            @Override
            public void run() {

                handleriphonesevenplus.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        iphonesevenTimerDay.setText("" + String.format("%02d", days));
                        iphonesevenTimerHours.setText("" + String.format("%02d", hours));
                        iphonesevenTimerMinutes.setText(""
                                + String.format("%02d", minutes));
                        iphonesevenTimerSeconds.setText(""
                                + String.format("%02d", seconds));

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        handleriphonesevenplus.postDelayed(runnableiphonesevenplus, 1 * 1000);


    }


    public void countDown3Start(){

        handleriphoneeightplus = new Handler();
        runnableiphoneeightplus = new Runnable() {
            @Override
            public void run() {

                handleriphoneeightplus.postDelayed(this,1000);

                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        iphoneeightplusTimerDay.setText("" + String.format("%02d", days));
                        iphoneeightplusTimerHour.setText("" + String.format("%02d", hours));
                        iphoneeightplusTimerMinutes.setText("" + String.format("%02d", minutes));
                        iphoneeightplusTimerSeconds.setText("" + String.format("%02d", seconds));

                    }

                }catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        handleriphoneeightplus.postDelayed(runnableiphoneeightplus, 1 * 1000);


    }

    public void countDown4start(){

        handlerappleipadair = new Handler();
        runnableappleipadair = new Runnable() {
            @Override
            public void run() {
                handlerappleipadair.postDelayed(this,1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        aplleipadairTimerDay.setText("" + String.format("%02d", days));
                        appleipadairTimerHour.setText("" + String.format("%02d", hours));
                        appleipadairTimerMinutes.setText(""
                                + String.format("%02d", minutes));
                        appleipadairTimerSeconds.setText(""
                                + String.format("%02d", seconds));

                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        handlerappleipadair.postDelayed(runnableappleipadair, 1 * 1000);


    }

    public void countDownhuaweimediapadstart() {

        handlerhuaweimediapad = new Handler();
        runnablehuaweimediapad = new Runnable() {
            @Override
            public void run() {

                handlerhuaweimediapad.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        huaweimediapadTimerDay.setText("" + String.format("%02d", days));
                        huaweimediapadTimerHour.setText("" + String.format("%02d", hours));
                        huaweimediapadTimerMinutes.setText(""
                                + String.format("%02d", minutes));
                        huaweimediapadTimerSeconds.setText(""
                                + String.format("%02d", seconds));

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        };
        handlerhuaweimediapad.postDelayed(runnablehuaweimediapad, 1 * 1000);
    }

    public void countDowngalaxytabstart(){

        handlergalaxytab = new Handler();
        runnablegalaxytab = new Runnable() {
            @Override
            public void run() {

                handlergalaxytab.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        galaxytabTimerDay.setText("" + String.format("%02d", days));
                        galaxytabTimerHours.setText("" + String.format("%02d", hours));
                        galaxytabTimerMinutes.setText(""
                                + String.format("%02d", minutes));
                        galaxytabTimerSeconds.setText(""
                                + String.format("%02d", seconds));

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        handlergalaxytab.postDelayed(runnablegalaxytab, 1 * 1000);
    }

    public void countDownphilipsledstart(){

        handlerphilipsled = new Handler();
        runnablephilipsled = new Runnable() {
            @Override
            public void run() {

                handlerphilipsled.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        philipsledTimerDay.setText("" + String.format("%02d", days));
                        philipsledTimerHours.setText("" + String.format("%02d", hours));
                        philipsledTimerMinutes.setText(""
                                + String.format("%02d", minutes));
                        philipsledTimerSeconds.setText(""
                                + String.format("%02d", seconds));

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        handlerphilipsled.postDelayed(runnablephilipsled, 1 * 1000);
    }

    public void countDownhuaweibandwathstart(){
        handlerhuaweibandwath = new Handler();
        runnablehuaweibandwath = new Runnable() {
            @Override
            public void run() {

                handlerhuaweibandwath.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        huaweibandwathTimerDay.setText("" + String.format("%02d", days));
                        huaweibandwathTimerHours.setText("" + String.format("%02d", hours));
                        huaweibandwathTimerMinutes.setText(""
                                + String.format("%02d", minutes));
                        huaweibandwathTimerSeconds.setText(""
                                + String.format("%02d", seconds));

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        handlerhuaweibandwath.postDelayed(runnablehuaweibandwath, 1 * 1000);


    }




}

