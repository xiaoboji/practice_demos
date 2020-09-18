package d06bridge.bridge.sender;

import java.util.List;

/**
 * @program: practice-demos
 * @description: 手机号处理逻辑
 * @author: xiaoboji
 * @create: 2020-09-18 23:05
 */
public class WechatMsgSender implements MsgSender {
  private List wechatIds;

  public WechatMsgSender(List wechatIds) {
    this.wechatIds = wechatIds;
  }

  @Override
  public void send(String message) {
    // ...
  }
}
