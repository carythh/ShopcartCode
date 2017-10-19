package com.duanc.app.shopcart;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 购物数量加减
 * Created by duanzc on 2017/09/14.
 */

public class AddMinusView extends LinearLayout implements View.OnClickListener {

    private Context mContext;
    private TextView btn_add, btn_minus;
    private TextView tv_num;

    private int buynum = 1; //购买数量
    private int inventory = 10000; //商品库存

    private onNumListener onNumListener;

    public AddMinusView(Context context) {
        super(context);
    }

    public AddMinusView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        View view = LayoutInflater.from(context).inflate(R.layout.view_add_minus, this);
        btn_add = view.findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        btn_minus = view.findViewById(R.id.btn_minus);
        btn_minus.setOnClickListener(this);
        tv_num = findViewById(R.id.tv_num);

        //获取自定义属性的相关内容
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.shopbutton);
        int addtextcolor = typedArray.getColor(R.styleable.shopbutton_addtextcolor, getResources().getColor(R.color.black));
        int minustextcolor = typedArray.getColor(R.styleable.shopbutton_minustextcolor, getResources().getColor(R.color.black));
        int addtextbg = typedArray.getResourceId(R.styleable.shopbutton_addtextbg, R.color.red);
        int minustextbg = typedArray.getResourceId(R.styleable.shopbutton_minustextbg, R.color.blue);
        float buttonwidth = typedArray.getDimension(R.styleable.shopbutton_buttonwidth, 50);
        float buttonheight = typedArray.getDimension(R.styleable.shopbutton_buttonheight, 20);
        float textwidth = typedArray.getDimension(R.styleable.shopbutton_textwidth, 40);
        int textcolor = typedArray.getColor(R.styleable.shopbutton_textcolor, getResources().getColor(R.color.black));
        int textbg = typedArray.getResourceId(R.styleable.shopbutton_textbg, R.color.blue);
        float alltextsize = typedArray.getDimension(R.styleable.shopbutton_alltextsize, 10);
        typedArray.recycle();

        btn_add.setTextColor(addtextcolor);
        btn_add.setBackgroundResource(addtextbg);
        btn_add.setWidth((int) buttonwidth);
        btn_add.setHeight((int) buttonheight);
        btn_minus.setTextColor(minustextcolor);
        btn_minus.setBackgroundResource(minustextbg);
        btn_minus.setWidth((int) buttonwidth);
        btn_minus.setHeight((int) buttonheight);
        tv_num.setWidth((int) textwidth);
        tv_num.setHeight((int) buttonheight);
        tv_num.setTextColor(textcolor);
        tv_num.setBackgroundResource(textbg);
        btn_add.setTextSize(alltextsize);
        btn_minus.setTextSize(alltextsize);
        tv_num.setTextSize(alltextsize);
    }


    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_add) {
            if (buynum < inventory) {
                buynum++;
                tv_num.setText(buynum + "");
                onNumListener.onNowNum(buynum);
            } else {
                Toast.makeText(mContext, "已达到可购买上限", Toast.LENGTH_SHORT).show();
            }


        } else if (i == R.id.btn_minus) {
            if (buynum > 1) {
                buynum--;
                onNumListener.onNowNum(buynum);
                tv_num.setText(buynum + "");
            }


        }

    }


    /**
     * 设置库存最大数
     */
    public AddMinusView setInventory(int inventory) {
        this.inventory = inventory;
        return this;
    }

    public AddMinusView setOnNowNumListener(onNumListener onNowNumListener) {
        this.onNumListener = onNowNumListener;
        return this;
    }

    public interface onNumListener {
        void onNowNum(int pos);
    }
}
