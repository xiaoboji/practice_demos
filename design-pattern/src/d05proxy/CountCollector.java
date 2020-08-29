package d05proxy;

/**
 * The type Count collector.
 *
 * @program: practice -demos
 * @description: 收集接口请求的原始数据 ，比如访问时间、处理时长
 * @author: xiaoboji
 * @create: 2020 -08-29 00:42
 */
public class CountCollector {

  public void recordRequest(RequestInfo requestInfo) {
    System.out.println(
        requestInfo.getName() + ":" + (requestInfo.getEndTime() - requestInfo.getStartTime()));
  };
}
