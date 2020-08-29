package d05proxy;

/** The type Request info. */
public class RequestInfo {
  private String name;
  private long endTime;
  private long startTime;

  public RequestInfo(String name, long endTime, long startTime) {
    this.name = name;
    this.endTime = endTime;
    this.startTime = startTime;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }

  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }
}
