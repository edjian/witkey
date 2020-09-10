package co.zhenxi.modules.pcshop.rest.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @Author: Jia Hao Hao
 * @Date: 2020-09-01 17:30
 * @Description: KaptchaConfig
 **/

@Component
public class KaptchaConfig {
    @Bean
    public DefaultKaptcha getDefaultKaptcha(){
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.put("kaptcha.border","no");
        //边框颜色，合法值rgb(and optional alpha)或者 white,black,blue，默认值black
        properties.put("kaptcha.border.color","blue");
        //边框厚度，合法值>0,默认值为1
        properties.put("kaptcha.border.thickness",2);
        //图片宽度，默认值200
        properties.put("kaptcha.image.width",200);
        //图片高度，默认值50
        properties.put("kaptcha.image.height",50);
        //图片实现类，默认值priv.kerlomz.kaptcha.impl.DefaultKaptcha
        properties.put("kaptcha.producer.impl","com.google.code.kaptcha.impl.DefaultKaptcha");
        //文本实现类,默认值priv.kerlomz.kaptcha.impl.DefaultTextCreator
        properties.put("kaptcha.textproducer.impl","com.google.code.kaptcha.text.impl.DefaultTextCreator");
        //文本集合，验证码值从此集合中获取,默认值abcde2345678gfynmnpwx
        properties.put("kaptcha.textproducer.char.string","abcde2345678gfynmnpwx");
        //验证码长度,默认值为5
        properties.put("kaptcha.textproducer.char.length","5");
        //字体,默认值Arial, Courier(如果使用中文验证码，则必须使用中文的字体，否则出现乱码)
        properties.put("kaptcha.textproducer.font.names","Arial");
        //字体大小，默认值为40px
        properties.put("kaptcha.textproducer.font.size","40");
        //字体颜色，合法值： r,g,b 或者 white,black,blue，默认值black
        properties.put("kaptcha.textproducer.font.color","black");
        //文字间隔，默认值为2
        properties.put("kaptcha.textproducer.char.space","2");
        //干扰实现类，默认值priv.kerlomz.kaptcha.impl.DefaultNoise
        properties.put("kaptcha.noise.impl","com.google.code.kaptcha.impl.DefaultNoise");
        //干扰 颜色，合法值： r,g,b 或者 white,black,blue，默认值black
        properties.put("kaptcha.noise.color","black");
        /**图片样式：
         水纹 priv.kerlomz.kaptcha.impl.WaterRipple
         鱼眼 priv.kerlomz.kaptcha.impl.FishEyeGimpy
         阴影 priv.kerlomz.kaptcha.impl.ShadowGimpy, 默认值水纹
         **/
        properties.put("kaptcha.obscurificator.impl","com.google.code.kaptcha.impl.ShadowGimpy");
        //背景实现类，默认值priv.kerlomz.kaptcha.impl.DefaultBackground
        properties.put("kaptcha.background.impl","com.google.code.kaptcha.impl.DefaultBackground");
        //背景颜色渐变，开始颜色，默认值lightGray/192,193,193
        properties.put("kaptcha.background.clear.from","255,255,255");
        //背景颜色渐变， 结束颜色，默认值white
        properties.put("kaptcha.background.clear.to","white");
        //文字渲染器，默认值priv.kerlomz.kaptcha.text.impl.DefaultWordRenderer
        properties.put("kaptcha.word.impl","com.google.code.kaptcha.text.impl.DefaultWordRenderer");
        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);

        return defaultKaptcha;
    }
}