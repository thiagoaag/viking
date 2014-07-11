package com.viking.test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import com.viking.interactor.DataModel;
import com.viking.interactor.ResultModel;

class VikingCreatorImpl implements VikingCreator {

	private static final Map<String, VikingPerson> VIKINGS = new HashMap<>();

	static {
		VIKINGS.put("nordic-god", new VikingPerson("Thor"));
		VIKINGS.put("nordic-human", new VikingPerson("Ragnar"));
	}

	@Override
	public void perform(VikingLineage lineAge,
			Consumer<VikingPerson> resultHandler) {

		resultHandler.accept(VIKINGS.get(lineAge.value));
	}

	static class VikingLineage implements DataModel {

		private static final long serialVersionUID = 1L;

		public final String value;

		public VikingLineage(String lineage) {
			this.value = lineage;
		}

	}

	static class VikingPerson implements ResultModel {

		private static final long serialVersionUID = 1L;

		public final String name;

		public VikingPerson(String name) {
			this.name = name;
		}

	}

}
