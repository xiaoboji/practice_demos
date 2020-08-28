package d05proxy;

/**
 * The type Count collector.
 *
 * @program: practice -demos
 * @description: 收集接口请求的原始数据 ，比如访问时间、处理时长
 * @author: xiaoboji
 * @create: 2020 -08-29 00:42
 */
public class CountController {

  public void recordRequest(RequestInfo requestInfo) {
    System.out.println(
        requestInfo.getName() + ":" + (requestInfo.getStartTime() - requestInfo.getResponseTime()));
  };
}

/** The type Request info. */
class RequestInfo {
  private String name;
  private long responseTime;
  private long startTime;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getResponseTime() {
    return responseTime;
  }

  public void setResponseTime(long responseTime) {
    this.responseTime = responseTime;
  }

  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }

  public RequestInfo(String name, long responseTime, long startTime) {
    this.name = name;
    this.responseTime = responseTime;
    this.startTime = startTime;
  }
}
