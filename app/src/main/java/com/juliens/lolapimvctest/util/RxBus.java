package com.juliens.lolapimvctest.util;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by juliens on 18/09/2017.
 */

/**
 * Send event on bus with:
 * rxBus.send(new TapEvent());
 *
 * Listen event with:
 * rxBus.listen().subscribe(new Action1<Object>() {
 * @Override
 * public void call(Object event) {
 *  if(event instanceof TapEvent)
 *      what you want;
 *  }
 * });
 */
public final class RxBus {
    private static final PublishSubject<Object> bus = PublishSubject.create();

    public static void send(final Object event) {
        bus.onNext(event);
    }

    public static Observable<Object> listen() {
        return bus;
    }

    public boolean hasObservers() {
        return bus.hasObservers();
    }
}


