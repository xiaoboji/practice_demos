package d06bridge.bridge.notification;

import d06bridge.bridge.sender.MsgSender;

/**
 * @program: practice-demos
 * @description: SevereNotification
 * @author: xiaoboji
 * @create: 2020-09-18 23:16
 */
public class SevereNotification extends Notification {

  public SevereNotification(MsgSender msgSender) {
    super(msgSender);
  }

  @Override
  public void notify(String message) {}
}
