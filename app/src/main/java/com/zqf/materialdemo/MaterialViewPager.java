package com.zqf.materialdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：zqf
 * Time：2018/10/31 15:45
 * desc：
 */
public class MaterialViewPager extends AppCompatActivity {
    ViewPager mViewPager;
    List<Fragment> mFragments;
    String[] mTitles = new String[]{"主页", "微博", "相册"};
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.material_viewpagerlayout);
        // 第一步，初始化ViewPager和TabLayout
        mViewPager = findViewById(R.id.viewpager);
        mTabLayout = findViewById(R.id.tabs);
        setupViewPager();
    }

    private void setupViewPager() {

        mFragments = new ArrayList<>();
        for (int i = 0; i < mTitles.length; i++) {
            ListFragment listFragment = ListFragment.newInstance(mTitles[i]);
            mFragments.add(listFragment);
        }
        // 第二步：为ViewPager设置适配器
        BaseFragmentAdapter adapter = new BaseFragmentAdapter(getSupportFragmentManager(), mFragments, mTitles);

        mViewPager.setAdapter(adapter);
        //  第三步：将ViewPager与TableLayout 绑定在一起
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
