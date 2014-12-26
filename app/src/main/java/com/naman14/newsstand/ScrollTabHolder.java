package com.naman14.newsstand;


import android.widget.ScrollView;

public interface ScrollTabHolder {

	void adjustScroll(int scrollHeight, int headerTranslationY);
    void onScroll(ScrollView view, int x, int y, int oldX, int oldY, int pagePosition);


}
