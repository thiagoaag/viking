package com.viking.interactor;

import java.util.function.Consumer;

public interface Interactor<D extends DataModel, R extends ResultModel> {

	void perform(D dataModel, Consumer<R> resultHandler);

}
