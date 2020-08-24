import rx.Observable;
import rx.functions.Action1;

public class GettingSimple {

  Observable<Integer> mySimpleObservable;
  Action1<Integer> onNextAction = new Action1<Integer>() {
    @Override
    public void call(Integer value) {
      System.out.println("Are ya winning son?");
      if (value % 2 == 0) {
        System.out.println("Nah, dad");
      } else {
        System.out.println("Perhaps");
      }
    }
  };

  public GettingSimple() {
    mySimpleObservable = Observable.range(0, 10);
    mySimpleObservable.subscribe(onNextAction);
  }
}
