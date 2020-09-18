package d06bridge;

import java.util.List;

/**
 * @program: practice-demos
 * @description: 根据不同的告警规则，触发不同类型的告警
 * @author: xiaoboji
 * @create: 2020-09-18 22:55
 */
public class Notification {
  private List<String> emailAddreses;
  private List<String> telephones;
  private List<String> wechatIds;

  public Notification() {}

  public void setEmailAddreses(List<String> emailAddreses) {
    this.emailAddreses = emailAddreses;
  }

  public void setTelephones(List<String> telephones) {
    this.telephones = telephones;
  }

  public void setWechatIds(List<String> wechatIds) {
    this.wechatIds = wechatIds;
  }

  public void notify(NotificationEmergencyLevel level, String message) {
    if (level.equals(NotificationEmergencyLevel.SEVERE)) {
      // ...给telephones打电话
    } else if (level.equals(NotificationEmergencyLevel.URGENCY)) {
      // ...给wechatIds发微信
    } else if (level.equals(NotificationEmergencyLevel.NORMAL)) {
      // ...给emailAddreses发邮件
    } else if (level.equals(NotificationEmergencyLevel.TRIVIAL)) {
      // ...给emailAddreses发邮件
    }
  }
}

enum NotificationEmergencyLevel {
  /** 严重 */
  SEVERE,
  /** 紧急 */
  URGENCY,
  /** 普通 */
  NORMAL,
  /** 无关紧要 */
  TRIVIAL
}
