package com.example.hw6.bean;

import com.example.hw6.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "坚果", "瑞士巧克力", "德芙巧克力", "每日坚果", "火腿肠", "网红巧克力","红枣零食","魔芋爽"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "三只松鼠坚果大礼包1535g休闲零食干果礼盒送礼9袋装炒货开心果",
            "瑞士莲巧克力软心球 进口lindor巧克力球结婚喜糖果散装零食lindt",
            "德芙麦提莎麦丽素麦芽脆夹心原味巧克力球520g桶网红小零食品糖果",
            "【百草味-坚果大礼包1532g/9袋】每日坚果混合装休闲干果零食礼盒",
            "【齐善素食 佛家纯素火腿肠】即食零食热量脂卡豆制品素肉素香肠",
            "卜珂速溶松露型黑巧克力碗装网红零食糖果送女友（代可可脂）",
            "满减【好想你_美丽方218g】枣夹核桃新疆特产无核小包装红枣零食",
            "金磨坊魔芋爽魔芋素毛肚小零食整箱麻辣辣味零食小吃休闲食品礼包"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {138, 52, 79, 98, 20, 27,51,10};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.szss_s,R.drawable.rsqkl_s, R.drawable.dfqkl_s,
            R.drawable.mrjg_s, R.drawable.htc_s, R.drawable.whqkl_s,
            R.drawable.hzls_s, R.drawable.mys_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.szss, R.drawable.rsqkl, R.drawable.dfqkl,
            R.drawable.mrjg, R.drawable.htc, R.drawable.whqkl,
            R.drawable.hzls, R.drawable.mys
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
