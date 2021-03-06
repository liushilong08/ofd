package io.onee.ofd.test;

import org.junit.jupiter.api.Test;
import sun.font.FontDesignMetrics;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * Created by admin on 2020/4/26 15:41:13.
 */
public class FontTest {
    
    /**
     * https://www.iteye.com/blog/shuaijie506-2205672
     * https://blog.csdn.net/iteye_5916/article/details/81599511
     *
     * @throws IOException
     * @throws FontFormatException
     */
    @Test
    public void advTest() throws IOException, FontFormatException {
        //fontSize 转 mm
        String filePath = this.getClass().getResource("/font/HYKaiTiJ.ttf").getFile();
        Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filePath));
        font = font.deriveFont(14f);
        FontDesignMetrics fm = FontDesignMetrics.getMetrics(font);
        char[] chars = new char[256];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) i;
        }
    
        List<Float> advCache = new ArrayList<>();
        for (char s : chars) {
            int strWid = 1;
//            int strWid = fm.stringWidth(s);
            int charWid = fm.charWidth(s);
            System.out.println("strWidth: " + strWid + "    charWidth: " + charWid + "   height: " + fm.getHeight());
            BigDecimal d = new BigDecimal(charWid).divide(new BigDecimal(14),6,ROUND_HALF_UP);
            advCache.add(d.floatValue());
        }
        String result = advCache.stream().map(aFloat -> aFloat.toString() + "f").collect(Collectors.joining(","));
        System.out.println(result);
    }
    
    @Test
    public void fontTest() throws IOException, FontFormatException {
        //fontSize 转 mm
        String filePath = this.getClass().getResource("/font/HYKaiTiJ.ttf").getFile();
        Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filePath));
        font = font.deriveFont(14f);
        FontDesignMetrics fm = FontDesignMetrics.getMetrics(font);

        //DeltaX="3.18 3.18 3.18 3.18 3.18 3.18">系统设计说明书 小五
        //DeltaX="8.11 7.76 7.76 7.76 7.76 7.76 7.76 7.76 7.76 7.76 7.76 7.76">运营管理平台系统设计说明书</ofd:TextCode> 二号
        //<ofd:TextCode X="0.0" Yc="4.94" DeltaX="4.94 4.94 4.94">版本号：</ofd:TextCode> 四号
        //<ofd:TextCode X="0.0" Y="3.88" DeltaX="3.88 3.53 3.88 3.53 3.88 3.53 3.88 3.53 3.88 3.53 3.88 3.53">发送短信验证码给用户手机号</ofd:TextCode>  五号
        //<ofd:TextCode X="0.0" Y="4.23" DeltaX="3.88 3.53 3.88">暂不录入</ofd:TextCode>
    
    
        //22号字  strWidth: 22    charWidth: 22   height: 23
        //8号字   strWidth: 8     charWidth: 8    height: 9
        String dd = "abcdefghijklmnopqrstuvwxyz哈";
        for (char s : dd.toCharArray()) {
            int charWid = fm.charWidth(s);
            float delta1 = getCharWidthScale(s, font.getSize2D());
            float delta2 = getCharWidthScaleNew(s, font.getSize2D());
            System.out.println(String.format("char: %s | charWidth: %s | height: %s | halfWid: %s | dynamicWid: %s", s, charWid, fm
                    .getHeight(), delta1, delta2));
        }
    }
    
    /**
     * 获取字符占比
     *
     * @param txt 字符
     * @return 0~1 占比
     */
    public float getCharWidthScale(char txt, float pointSize) {
        // 如果存在字符映射那么从字符映射中获取宽度占比
        //1 inch = 2.54cm;   1 inch = 72 point(点/磅); 所以1 point = 0.0003527778(m) = 0.3527778 (mm)
        // default metrics for compatibility with legacy code
    
        double d = (txt >= 32 && txt <= 126) ? 0.5 : 1;
        BigDecimal rate = new BigDecimal(0.352778);
        BigDecimal mm = new BigDecimal(pointSize).multiply(rate).multiply(new BigDecimal(d));
        return mm.setScale(3, ROUND_HALF_UP).floatValue();
    }
    
    public float getCharWidthScaleNew(char txt, float pointSize) {
        float[] advCache = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.5f, 0.5f, 0.5f, 1.0f, 0.5f, 0.714286f, 0.785714f, 0.5f, 0.285714f, 0.285714f, 0.5f, 0.714286f, 0.5f, 0.714286f, 0.5f, 0.642857f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.785714f, 0.714286f, 0.785714f, 0.5f, 1.0f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.571429f, 0.5f, 0.214286f, 0.428571f, 0.571429f, 0.428571f, 0.571429f, 0.5f, 0.5f, 0.428571f, 0.5f, 0.571429f, 0.428571f, 0.5f, 0.5f, 0.5f, 0.642857f, 0.5f, 0.428571f, 0.5f, 0.285714f, 0.642857f, 0.285714f, 0.357143f, 0.5f, 0.5f, 0.428571f, 0.357143f, 0.357143f, 0.357143f, 0.357143f, 0.357143f, 0.428571f, 0.357143f, 0.142857f, 0.285714f, 0.5f, 0.142857f, 0.571429f, 0.357143f, 0.357143f, 0.357143f, 0.357143f, 0.285714f, 0.357143f, 0.357143f, 0.357143f, 0.428571f, 0.571429f, 0.5f, 0.5f, 0.357143f, 0.285714f, 0.214286f, 0.285714f, 0.428571f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
        if (txt < 256) {
            pointSize = advCache[txt] * pointSize;
        }
        BigDecimal rate = new BigDecimal(0.352778);
        BigDecimal mm = new BigDecimal(pointSize).multiply(rate);
        return mm.setScale(3, ROUND_HALF_UP).floatValue();
    }
    
    
    
    /**
     * fontSize（pt） 转换为 mm
     */
    @Test
    public void sdsd() {
        //1 inch = 2.54cm;   1 inch = 72 point(点/磅); 所以1 point = 0.0003527778(m) = 0.3527778 (mm)
        BigDecimal rate = new BigDecimal("0.3527778");
        List<Integer> fontSizeList = Arrays.asList(1,14);
        for (Integer fontSize : fontSizeList) {
    
            BigDecimal mm = new BigDecimal(fontSize).multiply(rate, MathContext.DECIMAL32);
    
            System.out.println(String.format("fontSize: %s,  mm-double: %s,  mm-float: %s, mm-last3: %s", fontSize, mm.doubleValue(), mm
                    .floatValue(),mm.setScale(3, ROUND_HALF_UP)));
        }
    }
    
}
