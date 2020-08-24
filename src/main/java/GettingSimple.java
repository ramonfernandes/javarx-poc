import rx.Observable;

public class GettingSimple {
  public GettingSimple() {
    Observable.range(0, 10)
        .subscribe(value -> {
          System.out.println("Are ya winning son?");
          if (value % 2 == 0) {
            System.out.println("Nah, dad");
          } else {
            System.out.println("Perhaps");
          }
        });
  }
}
