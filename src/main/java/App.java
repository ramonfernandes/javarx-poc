import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscriber;

public class App {

  public static void main(String[] args) {


    //First implementation of Observables and Observers, overriding the main functions
    //More complex then need it to be
    FirstImplementation firstImplementation = new FirstImplementation();
    firstImplementation.callingAllTheBoys();

    GettingSimple gettingSimple = new GettingSimple();
  }

}
