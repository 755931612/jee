package demo;

import static java.lang.System.out;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.slf4j.*;

public class I18NDemo {
  private final static Logger logger
  =LoggerFactory.getLogger(I18NDemo.class);
  public static void main(String[] args) {
    // if(�ڴ�½) inCn();
    // else inTw();
    inCn();
    // loc();
    // i18n();
    // formatDemo();
    // format2();
    //order();
    getAllLocs();
  }

  public static void order() {
    Locale enLoc = new Locale("en", "US");
    // msg_en_US
    ResourceBundle bundle = ResourceBundle.getBundle("demo.msg", enLoc);
    out.println(bundle.getString("id"));
    out.println(bundle.getString("stu.info"));

  }

  public static void loc() {
    // Locale loc=new Locale("zh","CN");
    Locale loc = Locale.getDefault();// ��������
    out.println(loc);
    String strLoc = "" + loc;
    switch (strLoc) {
    case "zh_CN":
      inCn();
      break;
    case "zh_TW":
      inTw();
      break;
    default:
      inCn();
    }
  }

  public static void i18n() {
    ResourceBundle bundle = ResourceBundle.getBundle("demo.msg");
    String id = bundle.getString("id");
    out.println(id);
  }

  public static void formatDemo() {
    String info = "ѧ����{0},������{1}";
    String res = MessageFormat.format(info, 1L, "zhangsan", 45);
    out.println(res);
  }

  public static void format2() {
    String info = "ʱ����{0,time},������{0,date,full}";
    String res = MessageFormat.format(info, new Date());
    out.println(res);
  }

  public static void inCn() {
    logger.error("ѧ��");
    logger.error("��Ϣ");
  }

  public static void inTw() {
    out.println("�W̖");
    out.println("�YӍ");
  }
  public static void getAllLocs(){
    Locale[] locs=Locale.getAvailableLocales();
    for(Locale loc:locs){
      logger.debug("loc is {}",loc.getDisplayName(loc));      
    }
  }
}