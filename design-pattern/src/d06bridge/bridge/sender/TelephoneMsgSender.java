package d06bridge.bridge.sender;

import java.util.List;

/**
 * @program: practice-demos
 * @description: 手机号处理逻辑
 * @author: xiaoboji
 * @create: 2020-09-18 23:05
 */
public class TelephoneMsgSender implements MsgSender {
  private List telephones;

  public TelephoneMsgSender(List telephones) {
    this.telephones = telephones;
  }

  @Override
  public void send(String message) {
    // ...
  }
}
