package d06bridge.bridge.notification;

import d06bridge.bridge.sender.MsgSender;

/**
 * @program: practice-demos
 * @description: notification
 * @author: xiaoboji
 * @create: 2020-09-18 23:14
 */
public abstract class Notification {
  protected MsgSender msgSender;

  public Notification(MsgSender msgSender) {
    this.msgSender = msgSender;
  }

  /** @param message */
  public abstract void notify(String message);
}
