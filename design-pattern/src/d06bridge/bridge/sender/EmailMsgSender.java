package d06bridge.bridge.sender;

import java.util.List;

/**
 * @program: practice-demos
 * @description: 手机号处理逻辑
 * @author: xiaoboji
 * @create: 2020-09-18 23:05
 */
public class EmailMsgSender implements MsgSender {
  private List emails;

  public EmailMsgSender(List emails) {
    this.emails = emails;
  }

  @Override
  public void send(String message) {
    // ...
  }
}
