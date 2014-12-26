package com.naman14.newsstand;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ScrollViewFragment extends ScrollTabHolderFragment implements NotifyingScrollView.OnScrollChangedListener {

    private static final String ARG_POSITION = "position";


    private NotifyingScrollView mScrollView;

    TextView title;
    TextView titleShortDescription;
    TextView titleDescription;
    TextView textSendEmail;
    TextView textContact;
    TextView textEmail;
    LinearLayout layout1;
    LinearLayout layout2;

    ImageView titleImage;

    private int mPosition;
    private CardView cardView;

    public static Fragment newInstance(int position) {
        ScrollViewFragment f = new ScrollViewFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPosition = getArguments().getInt(ARG_POSITION);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_scrollview, null);

        mScrollView = (NotifyingScrollView) v.findViewById(R.id.scrollview);
        mScrollView.setOnScrollChangedListener(this);
        layout1=(LinearLayout) v.findViewById(R.id.layout1);
        layout2=(LinearLayout) v.findViewById(R.id.layout2);
        titleDescription =(TextView) v.findViewById(R.id.titleDescription);
        titleShortDescription = (TextView) v.findViewById(R.id.titleShortDescription);
        title = (TextView) v.findViewById(R.id.title);

        textContact = (TextView) v.findViewById(R.id.textContact);
        textEmail = (TextView) v.findViewById(R.id.textEmail);
        textSendEmail = (TextView) v.findViewById(R.id.textSendEmail);


        textSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = textEmail.getText().toString();
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setType("text/plain");
                emailIntent.setData(Uri.parse("mailto:"+email));
                emailIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(emailIntent);
            }
        });

        titleImage =(ImageView) v.findViewById(R.id.titleImage);
        cardView =(CardView) v.findViewById(R.id.cardView);
        cardView.setPadding(30,30,30,30);

        if (mPosition==0){
            layout1.setBackgroundColor(getResources().getColor(R.color.pink_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.pink_transparent));
            titleDescription.setText("On April 27, 2009, the Android 1.5 update was released, based on Linux kernel 2.6.27. This was the first release to officially use a codename based on a dessert item (\"Cupcake\"), a theme which would be used for all releases henceforth. The update included several new features and UI amendments");
            title.setText("Cupcake");
            titleShortDescription.setText("Api level 3");
            titleImage.setImageResource(R.drawable.cupcake);}
        if (mPosition==1) {
            layout1.setBackgroundColor(getResources().getColor(R.color.green_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.green_transparent));
            titleDescription.setText("On September 15, 2009, the Android 1.6 SDK – dubbed Donut – was released, based on Linux kernel 2.6.29. Included in the update were numerous new features");
            title.setText("Donut");
            titleShortDescription.setText("Api level 4");
            titleImage.setImageResource(R.drawable.donut);

        }
        if (mPosition==2) {
            layout1.setBackgroundColor(getResources().getColor(R.color.red_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.red_transparent));
            titleDescription.setText("On October 26, 2009, the Android 2.0 SDK – codenamed Eclair – was released, based on Linux kernel 2.6.29");
            title.setText("Eclair");
            titleShortDescription.setText("Api level 5");
            titleImage.setImageResource(R.drawable.eclair);

        }
        if (mPosition==3) {
            layout1.setBackgroundColor(getResources().getColor(R.color.blue_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.blue_transparent));
            titleDescription.setText("On May 20, 2010, the SDK for Android 2.2 (Froyo, short for frozen yogurt) was released, based on Linux kernel 2.6.32. ");
            title.setText("Froyo");
            titleShortDescription.setText("Api level 8");
            titleImage.setImageResource(R.drawable.froyo);

        }
        if (mPosition==4) {
            layout1.setBackgroundColor(getResources().getColor(R.color.pink_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.pink_transparent));
            titleDescription.setText("On December 6, 2010, the Android 2.3 (Gingerbread) SDK was released, based on Linux kernel 2.6.35");
            title.setText("Gingerbread");
            titleShortDescription.setText("Api level 9");
            titleImage.setImageResource(R.drawable.gingerbread);

        }
        if (mPosition==5) {
            layout1.setBackgroundColor(getResources().getColor(R.color.purple_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.purple_transparent));
            titleDescription.setText("On February 22, 2011, the Android 3.0 (Honeycomb) SDK – the first tablet-only Android update – was released, based on Linux kernel 2.6.36.The first device featuring this version, the Motorola Xoom tablet, was released on February 24, 2011. ");
            title.setText("Honeycomb");
            titleShortDescription.setText("Api level 11");
            titleImage.setImageResource(R.drawable.honeycomb);

        }
        if (mPosition==6) {
            layout1.setBackgroundColor(getResources().getColor(R.color.green_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.green_transparent));
            titleDescription.setText("The SDK for Android 4.0.1 (Ice Cream Sandwich), based on Linux kernel 3.0.1, was publicly released on October 19, 2011. Google's Gabe Cohen stated that Android 4.0 was \"theoretically compatible\" with any Android 2.3.x device in production at that time. The source code for Android 4.0 became available on November 14, 2011. Ice Cream Sandwich was the last version to officially support Adobe Systems' Flash player. ");
            title.setText("Ice Cream Sandwich");
            titleShortDescription.setText("Api Level 14");
            titleImage.setImageResource(R.drawable.ics);

        }
        if (mPosition==7) {
            layout1.setBackgroundColor(getResources().getColor(R.color.red_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.red_transparent));
            titleDescription.setText("Google announced Android 4.1 (Jelly Bean) at the Google I/O conference on June 27, 2012. Based on Linux kernel 3.0.31, Jelly Bean was an incremental update with the primary aim of improving the functionality and performance of the user interface. The performance improvement involved \"Project Butter\", which uses touch anticipation, triple buffering, extended vsync timing and a fixed frame rate of 60 fps to create a fluid and \"buttery-smooth\" UI. Android 4.1 Jelly Bean was released to the Android Open Source Project on July 9, 2012, and the Nexus 7 tablet, the first device to run Jelly Bean, was released on July 13, 2012. ");
            title.setText("Jellybean");
            titleShortDescription.setText("Api level 16");
            titleImage.setImageResource(R.drawable.jellybean);

        }
        if (mPosition==8) {
            layout1.setBackgroundColor(getResources().getColor(R.color.pink_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.pink_transparent));
            titleDescription.setText("Google announced Android 4.4 KitKat on September 3, 2013. Although initially under the \"Key Lime Pie\" (\"KLP\") codename, the name was changed because \"very few people actually know the taste of a key lime pie.\" Some technology bloggers also expected the \"Key Lime Pie\" release to be Android 5.[125] KitKat debuted on Google's Nexus 5 on October 31, 2013, and has been optimised to run on a greater range of devices than earlier Android versions, having 512 MB of RAM as a recommended minimum; those improvements were known as \"Project Svelte\" internally at Google. The required minimum amount of RAM available to Android is 340 MB, and all devices with less than 512 MB of RAM must report themselves as \"low RAM\" devices. ");
            title.setText("Kitkat");
            titleShortDescription.setText("Api level 19");
            titleImage.setImageResource(R.drawable.kitkat);

        }

        if (mPosition==9) {
            layout1.setBackgroundColor(getResources().getColor(R.color.blue_transparent));
            layout2.setBackgroundColor(getResources().getColor(R.color.blue_transparent));
            titleDescription.setText("Android 5.0 \"Lollipop\" was unveiled under the codename \"Android L\" on June 25, 2014 during Google I/O, and became available as official over-the-air (OTA) updates on November 12, 2014 for select devices that run distributions of Android serviced by Google, including Nexus and Google Play edition devices. Its source code was made available on November 3, 2014.\n" +
                    "Lollipop brings a redesigned user interface built around a responsive design language referred to as \"material design\". Other changes include improvements to the notifications, which can be accessed from the lockscreen and displayed within applications as top-of-the-screen banners. Google also made internal changes to the platform, with the Android Runtime (ART) officially replacing Dalvik for improved application performance, and with changes intended to improve and optimize battery usage, known internally as Project Volta. ");
            title.setText("Lollipop");
            titleShortDescription.setText("Api level 21");
            titleImage.setImageResource(R.drawable.lollipop);

        }


        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }

    @Override
    public void adjustScroll(int scrollHeight, int headerTranslationY)
    {
        mScrollView.setScrollY(headerTranslationY - scrollHeight);
    }

    @Override
    public void onScrollChanged(ScrollView view, int l, int t, int oldl, int oldt)
    {
        if (mScrollTabHolder != null)
            mScrollTabHolder.onScroll(view, l, t, oldl, oldt, mPosition);

    }



}
