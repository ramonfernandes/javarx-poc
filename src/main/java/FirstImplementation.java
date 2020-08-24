import rx.Observable;
import rx.Subscriber;

public class FirstImplementation {


  Subscriber<String> myKindOfFirstSubscriber = new Subscriber<String>() {
    @Override
    public void onNext(String value) { System.out.println(value); }

    @Override
    public void onCompleted() { }

    @Override
    public void onError(Throwable error) { }
  };

  Observable<String> myKindOfFirstObservable = Observable.unsafeCreate(
      new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {
          subscriber.onNext("Are ya winning son?");
          subscriber.onCompleted();
        }
      }
  );

  Observable<String> myKindOfFirstIterableObservable = Observable.unsafeCreate(
      new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {
          for (int i = 0; i < 3; i++) {
            subscriber.onNext(String.valueOf(i));
          }
          subscriber.onCompleted();
        }
      });

  public void callingAllTheBoys() {
    System.out.println("FIRST IMPLEMENTATION:");
    myKindOfFirstObservable.subscribe(myKindOfFirstSubscriber);
    myKindOfFirstIterableObservable.subscribe(myKindOfFirstSubscriber);
    System.out.println("--------------------");
  }

}
